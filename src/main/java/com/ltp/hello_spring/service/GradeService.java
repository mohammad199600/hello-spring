package com.ltp.hello_spring.service;

import com.ltp.hello_spring.Constants;
import com.ltp.hello_spring.Grade;
import com.ltp.hello_spring.reposidory.GradeReposidory;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeService {
    
    GradeReposidory gradeReposidory;

    public GradeService(GradeReposidory gradeReposidory){
        this.gradeReposidory=gradeReposidory;
    }

    public Grade getGrade(int index) {
        return gradeReposidory.getGrade(index);
    }

    public void addGrade(Grade grade) {
        gradeReposidory.addGrade(grade);
    }

    public void updateGrade(int index, Grade grade) {
       
        gradeReposidory.updateGrade(index, grade);
    }

    public Integer getIndex(String id) {
        for (int i = 0; i < gradeReposidory.getGrades().size(); i++) {
            if (gradeReposidory.getGrade(i).getId().equals(id))
                return i;
        }
        return Constants.NOT_FOUND;
    }

    public List<Grade> getGrades() {
        return gradeReposidory.getGrades();
    }
    public Grade getGrade(String id){
        int index=getIndex(id);
            return index==Constants.NOT_FOUND?new Grade():getGrade(index);
    }
    public void submitGrade(Grade grade){
        int index= getIndex(grade.getId());
        if(index==Constants.NOT_FOUND)
        addGrade(grade);
        else
        updateGrade(index, grade);
    }
}
