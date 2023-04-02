package com.tap.taptest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "division")
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", length = 55)
    private String name;

    @Column(name = "acronym", length = 5)
    private String acronym;

    @Column(name = "minDivisionScore")
    private Integer minDivisionScore;


}