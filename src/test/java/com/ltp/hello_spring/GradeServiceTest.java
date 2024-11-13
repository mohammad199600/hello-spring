package com.ltp.hello_spring;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.ltp.hello_spring.reposidory.GradeReposidory;
import com.ltp.hello_spring.service.GradeService;

@RunWith(MockitoJUnitRunner.class)
public class GradeServiceTest {
    @Mock
    GradeReposidory gradeReposidory;

    @InjectMocks
    GradeService gradeService;

    @Test
    public void getGradesTest() {
        when(gradeReposidory.getGrades())
                .thenReturn(Arrays.asList(new Grade("Eid", "Maths", "D-"), new Grade("Rawan", "Physics", "A+")));
        List<Grade> result = gradeService.getGrades();
        assertEquals("Eid", result.get(0).getName());
        assertEquals("Physics", result.get(1).getSubject());
        assertEquals("D-", result.get(0).getScore());
    }

    @Test
    public void getIndexTest() {
        Grade grade = new Grade("Eid", "Maths", "D-");
        when(gradeReposidory.getGrades()).thenReturn(Arrays.asList(grade));
        when(gradeReposidory.getGrade(0)).thenReturn(grade);
        int valid = gradeService.getIndex(gradeService.getGrades().get(0).getId());
        int notFound = gradeService.getIndex("123");
        assertEquals(0, valid);
        assertEquals(Constants.NOT_FOUND, notFound);
    }

    @Test
    public void getGradeTest() {
        Grade grade = new Grade("Eid", "Maths", "D-");
        when(gradeReposidory.getGrades()).thenReturn(Arrays.asList(grade));
        when(gradeReposidory.getGrade(0)).thenReturn(grade);
        Grade result = gradeService.getGrade(grade.getId());
        assertEquals(grade, result);
    }

    @Test
    public void addGradeTest() {
        Grade grade = new Grade("Eid", "Maths", "D-");
        when(gradeReposidory.getGrades()).thenReturn(Arrays.asList(grade));
        when(gradeReposidory.getGrade(0)).thenReturn(grade);
        Grade newGrade = new Grade("Rawan", "Physics", "A+");
        gradeService.submitGrade(newGrade);
        verify(gradeReposidory, times(1)).addGrade(newGrade);
    }

    @Test
    public void updateGradeTest() {
        Grade grade = new Grade("Eid", "Maths", "D-");
        when(gradeReposidory.getGrades()).thenReturn(Arrays.asList(grade));
        when(gradeReposidory.getGrade(0)).thenReturn(grade);
        Grade newGrade = new Grade("Rawan", "Physics", "A+");
        gradeService.submitGrade(grade);
        verify(gradeReposidory, times(1)).updateGrade(0, grade);
    }
}