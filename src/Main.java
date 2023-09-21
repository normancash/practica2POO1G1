import data.DataBase;
import model.Student;
import servicio.IDAOStudent;
import servicio.ImplDAOStudent;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("21011520","Carlos"
                ,"Jose"
                ,"Martinez","Lacayo");
        IDAOStudent dao = new ImplDAOStudent();
        dao.createStudent(s);
        System.out.println("quantity of student:"
                + dao.getAll().size());
        s.setFirstName("Manuel");
        dao.updateStudent(s);
        printStudent(DataBase.listStudent);
    }

    private static void printStudent(List<Student> list){
        for (Student e : list) {
            System.out.println(e);
        }
    }
}