package OOP.Inheritance;

import java.sql.SQLOutput;
import java.util.List;

public class AcademicianMain {
    public static void main(String[] args){
        AcademicianManager academicianManager = new AcademicianManager();

        //getall
        List<Academician> academicians = academicianManager.getAll();

        for(Academician academician:academicians){
            System.out.println("Akademisyen Adı ve Soyadı: " + academician.getFirstName() + " " + academician.getLastName());
        }
        System.out.println("***********************************");
        //add
        Academician academician = new Academician();
        academician.setId(2);
        academician.setFirstName("Esat");
        academician.setLastName("Yener");
        academician.setEmail("esat@hotmail.com");
        academician.setPassword("cba");
        academician.setSection("Yazılım");
        academicianManager.add(academician);

        for(Academician academician1:academicians){
            System.out.println("Akademisyen Adı ve Soyadı: " + academician1.getFirstName() + " " + academician1.getLastName());
        }
        System.out.println("***********************************");
        //update
        Academician updatedAcademician = new Academician(1, "burak", "balıkçı","burak@gmail.com","cba","yazılım" );
        academicianManager.update(updatedAcademician);
        for(Academician academician1:academicians){
            System.out.print("Akademisyen Adı ve Soyadı: " + academician1.getFirstName() + " " + academician1.getLastName() + " ");
            System.out.println("Sisteme eklenme tarihi: " + academician1.getCreatedDate() + " Güncellenme tarihi: " + academician1.getUpdatedDate());
        }
        System.out.println("***********************************");
        //delete

        Academician academician2 =academicianManager.getById(2);
        academicianManager.delete(2);
        System.out.print("Akademisyen Adı ve Soyadı: " + academician2.getFirstName() + " " +  academician2.getLastName() + " ");
        System.out.println("Sisteme eklenme tarihi: " + academician2.getCreatedDate() + " Güncellenme tarihi: " + academician2.getUpdatedDate() + "Sistemden silinme tarihi:  " + academician2.getDeletedDate());
        System.out.println("Akademisyen silindi");




    }

}
