package ru.kors.springstudents.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kors.springstudents.model.Student;
import ru.kors.springstudents.repository.InMemoryStudentDAO;
import ru.kors.springstudents.service.StudentService;

import java.util.List;
@AllArgsConstructor
@Service
public class InMemoryStudentServiceImpl implements StudentService {
    private final InMemoryStudentDAO inMemoryStudentDAO;
    @Override
    public List<Student> findAllStudents() {
       return inMemoryStudentDAO.findAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {
        return inMemoryStudentDAO.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return inMemoryStudentDAO.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return inMemoryStudentDAO.updateStudent(student);
    }

    @Override

    public void deleteStudent(String email) {
        inMemoryStudentDAO.deleteStudent(email);
    }
}
