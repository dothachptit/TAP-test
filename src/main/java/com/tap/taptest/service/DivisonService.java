package com.tap.taptest.service;

import com.tap.taptest.DTO.request.DivisionRequest;
import com.tap.taptest.DTO.response.DivisionResponse;

import java.util.List;

public interface DivisonService {
    DivisionResponse addDivision(DivisionRequest divisionRequest);

    List<DivisionResponse> getAllDivision();

    boolean deleteById(Integer id);
}
