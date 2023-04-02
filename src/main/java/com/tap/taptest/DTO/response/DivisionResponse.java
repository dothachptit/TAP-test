package com.tap.taptest.DTO.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DivisionResponse {
    private Integer id;
    private String name;
    private String acronym;
    private Integer minDivisionScore;

}
