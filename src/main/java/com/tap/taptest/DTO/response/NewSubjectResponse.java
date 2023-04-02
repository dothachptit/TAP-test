package com.tap.taptest.DTO.response;

import com.tap.taptest.entity.Division;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewSubjectResponse {
    private Integer id;
    private String name;
    private Integer score;
    private Division divisionid;
}
