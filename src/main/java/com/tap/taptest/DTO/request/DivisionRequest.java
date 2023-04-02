package com.tap.taptest.DTO.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DivisionRequest {

    private String name;
    private String acronym;
    private Integer minDivisionScore;
}
