package com.meli.obterdiploma.service;

import com.meli.obterdiploma.exception.StudentNotFoundException;
import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.model.SubjectDTO;
import com.meli.obterdiploma.repository.IStudentDAO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.commons.function.Try;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class ObterDiplomaServiceTest {

    @Mock
    IStudentDAO studentDAO;

    @InjectMocks
    ObterDiplomaService obterDiplomaService;

    @Test
    public void calculateAverageResultTest(){

        List<SubjectDTO> subjects = new ArrayList<>();
        subjects.add(new SubjectDTO("Matematica", 7.0));
        subjects.add(new SubjectDTO("Portugues", 10.0));

        Mockito.when(studentDAO.findById(1L)).thenReturn(new StudentDTO(1L,"Igor",null, 0.0, subjects));

        StudentDTO studentDTO = obterDiplomaService.analyzeScores(1L);

        assertEquals(studentDTO.getAverageScore(), 8.5);

    }

    @Test
    public void greetingMessageResultCongratulations(){

        List<SubjectDTO> subjects = new ArrayList<>();
        subjects.add(new SubjectDTO("Matematica", 9.0));
        subjects.add(new SubjectDTO("Portugues", 10.0));

        Mockito.when(studentDAO.findById(1L)).thenReturn(new StudentDTO(1L,"Igor",null, 0.0, subjects));

        StudentDTO studentDTO = obterDiplomaService.analyzeScores(1L);

        assertEquals("O aluno Igor obteve uma média de 9,5. Parabéns!", studentDTO.getMessage());

    }

    @Test
    public void greetingMessageResultCanBeBetter(){

        List<SubjectDTO> subjects = new ArrayList<>();
        subjects.add(new SubjectDTO("Matematica", 6.0));
        subjects.add(new SubjectDTO("Portugues", 8.0));

        Mockito.when(studentDAO.findById(1L)).thenReturn(new StudentDTO(1L,"Igor",null, 0.0, subjects));

        StudentDTO studentDTO = obterDiplomaService.analyzeScores(1L);

        assertEquals("O aluno Igor obteve uma média de 7. Você pode melhorar.", studentDTO.getMessage());
    }

    @Test
    public void AnalyzeScoreWithIdStudentNotExists(){

        Mockito.when(studentDAO.findById(2L)).thenThrow(new StudentNotFoundException(2L));

        StudentNotFoundException response = Assertions.assertThrows(StudentNotFoundException.class, ()-> obterDiplomaService.analyzeScores(2L));

        assertEquals("O aluno com Id 2 não está registrado.", response.getError().getDescription());

    }




}
