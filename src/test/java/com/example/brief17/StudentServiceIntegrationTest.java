package com.example.brief17;

import com.example.brief17.repository.StudentRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import com.example.brief17.entity.Student;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@DataJpaTest
@ActiveProfiles("test")
class StudentServiceIntegrationTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    @DisplayName("Nominal Case test : save Student and return it")
    void shouldSaveAndRetrieveStudent() {
        //Arrange
        final Student student = new Student();
        student.setName("Sarah Connor");
        student.setAddress("La Fistinière");

        //Act
        Student savedStudent = studentRepository.save(student);
        Optional<Student> foundStudent = studentRepository.findById(savedStudent.getId());

        //Assert
        assertThat(foundStudent)
                .isPresent()
                .hasValueSatisfying( (s) -> {
                    assertThat(s.getName()).isEqualTo(savedStudent.getName());
                    assertThat(s.getAddress()).isEqualTo(savedStudent.getAddress());
                })
        ;

    }
}