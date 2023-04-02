package com.tap.taptest.serviceImpl;

import com.tap.taptest.DTO.request.DivisionRequest;
import com.tap.taptest.DTO.response.DivisionResponse;
import com.tap.taptest.entity.Division;
import com.tap.taptest.repository.DivisionRepository;
import com.tap.taptest.service.DivisonService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DivisionServiceImpl implements DivisonService {
    private final ModelMapper mapper;
    private final DivisionRepository divisionRepository;
    @Override
    public DivisionResponse addDivision(DivisionRequest divisionRequest) {
        Division division = new Division();
        division.setName(divisionRequest.getName());
        division.setAcronym(divisionRequest.getAcronym());
        division.setMinDivisionScore(divisionRequest.getMinDivisionScore());
        return mapper.map(divisionRepository.save(division),DivisionResponse.class);
    }

    @Override
    public List<DivisionResponse> getAllDivision() {
        return divisionRepository.findAll().stream().map(i ->mapper.map(i ,DivisionResponse.class)).collect(Collectors.toList());
    }

    @Override
    public boolean deleteById(Integer id) {
        divisionRepository.deleteById(id);
        return true;
    }
}
