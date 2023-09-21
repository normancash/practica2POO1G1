package servicio;

import model.Student;

import java.util.List;

public interface IDAOStudent {

    void createStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(Student student);

    List<Student> getAll();

    Student findByCif(String cif);
}
