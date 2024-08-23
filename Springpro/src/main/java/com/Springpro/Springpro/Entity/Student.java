package com.Springpro.Springpro.Entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Student_DB")
@NoArgsConstructor
@AllArgsConstructor

public class Student {
    @Id
    @Column(name = "Id")
    @GeneratedValue
    private int id;

    @Column(name = "Marks")
    private int marks;

    @Column(name = "StudentName")
    private String name ;
}
