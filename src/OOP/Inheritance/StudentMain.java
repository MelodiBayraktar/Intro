package OOP.Inheritance;

import java.time.LocalDate;
import java.util.List;

public class StudentMain {
    public static void main(String[] args){
        StudentManager studentManager = new StudentManager();
        List<Student> students = studentManager.getAll();
        for (Student student:students){
            System.out.println("Kayıt olan öğrencinin Adı ve Soyadı: " + student.getFirstName() + " " +  student.getLastName());
            System.out.println("Email bilgisi: " + student.getEmail());
        }
        Student student1 = new Student();
        student1.setId(2);
        student1.setFirstName("Kubilay");
        student1.setLastName("Özer");
        student1.setEmail("kubilay@hotmail.com");
        student1.setAbout("QA Tester");
        student1.setCreatedDate(LocalDate.now());
        studentManager.add(student1);

        for (Student student2:students){
            System.out.println("Kayıt olan öğrencinin Adı ve Soyadı: " + student2.getFirstName() + " " +  student2.getLastName());
            System.out.println("Email bilgisi: " + student2.getEmail());
            System.out.println("Sisteme kayıt tarihi: " + student2.getCreatedDate());
        }
    }
}
