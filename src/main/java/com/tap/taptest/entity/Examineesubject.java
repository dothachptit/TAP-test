package com.tap.taptest.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "examineesubject")
public class Examineesubject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Subjectid", nullable = false)
    private Subject subjectid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Examineeid", nullable = false)
    private Examinee examineeid;


}