package com.ltp.hello_spring.reposidory;

import com.ltp.hello_spring.Grade;
import java.util.*;
import org.springframework.stereotype.Repository;

@Repository
public class GradeReposidory {
    private List<Grade> studentGrades = new ArrayList<>();

    public Grade getGrade(int index) {
        return studentGrades.get(index);
    }

    public void addGrade(Grade grade) {
        studentGrades.add(grade);
    }

    public void updateGrade(int index, Grade grade) {
        // int index = getIndex(grade.getId());
        studentGrades.set(index, grade);
    }

    public List<Grade> getGrades() {
        return studentGrades;
    }

}
