package com.tap.taptest.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "examinee")
public class Examinee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "totalScore")
    private Integer totalScore;

    @Column(name = "divisionScore")
    private Integer divisionScore;

    @Column(name = "divisionOfExaminee", length = 55)
    private String divisionOfExaminee;


}