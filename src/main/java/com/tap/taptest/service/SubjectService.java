package com.tap.taptest.service;

import com.tap.taptest.DTO.request.NewSubjectRequest;
import com.tap.taptest.DTO.response.NewSubjectResponse;

import java.util.List;

public interface SubjectService {
    NewSubjectResponse addSubject(NewSubjectRequest newSubjectRequest);



    List<NewSubjectResponse> getAll();

    boolean deleteById(Integer id);
}
