package com.example.demoStudentDB.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
    @Id
    int id;
    @Column
    String fname;
    @Column
    String lname;

    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    private int getId() {
        return id;
    }

    private String getFname() {
        return fname;
    }

    private String getLname() {
        return lname;
    }

    private Student(int id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }
}
