package com.tap.taptest.serviceImpl;

import com.tap.taptest.DTO.request.NewSubjectRequest;
import com.tap.taptest.DTO.response.NewSubjectResponse;
import com.tap.taptest.entity.Subject;
import com.tap.taptest.repository.SubjectRepository;
import com.tap.taptest.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    private  final ModelMapper mapper;
    private final SubjectRepository subjectRepository;

    @Override
    public NewSubjectResponse addSubject(NewSubjectRequest newSubjectRequest) {
        Subject subject = new Subject();
        subject.setName(newSubjectRequest.getName());
        return mapper.map(subjectRepository.save(subject), NewSubjectResponse.class);
    }

    @Override
    public List<NewSubjectResponse> getAll() {
        return subjectRepository.findAll().stream().map(i -> mapper.map(i,NewSubjectResponse.class)).collect(Collectors.toList());

    }

    @Override
    public boolean deleteById(Integer id) {
        subjectRepository.deleteById(id);
        return true;
    }


}
