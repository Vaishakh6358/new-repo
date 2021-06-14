package com.example.demo.college;

import lombok.Data;

import javax.persistence.*;
@Entity
@Table(name = "COLLEGE")
@Data
public class CollegePO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "COLLEGE_ID")
    private Integer collegeId;
    @Column(name = "COLLEGE_NAME")
    private String collegeName;
    @Column(name = "COLLEGE_DEPARTMENT")
    private String collegeDepartment;


}
