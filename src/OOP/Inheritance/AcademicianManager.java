package OOP.Inheritance;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class AcademicianManager {
    private List<Academician> academicians;

    public AcademicianManager(){
        academicians = new ArrayList<>();
        Academician academician = new Academician(1,"Burak","Balıkçı","burak@hotmail.com","abc","Yazılım");
        academicians.add(academician);
    }

    //getall
    public List<Academician> getAll(){
        return academicians;
    }
    //add
    public void add(Academician academician){
        academician.setCreatedDate(LocalDate.now());
        academicians.add(academician);
    }
    //getById
    public Academician getById(int id){
        for (Academician academician:academicians){
            if (academician.getId() == id){
                return academician;
            }
        }
        return null;
    }
    //update
    public void update(Academician academician){
        for (Academician updatedAcademician: academicians){
            if (updatedAcademician.getId() == academician.getId()){
                updatedAcademician.setFirstName(academician.getFirstName());
                updatedAcademician.setLastName(academician.getLastName());
                updatedAcademician.setEmail(academician.getEmail());
                updatedAcademician.setPassword(academician.getPassword());
                updatedAcademician.setSection(academician.getSection());

                updatedAcademician.setUpdatedDate(LocalDate.now());
            }
        }
    }
    //delete
    public void delete(int id){
        Iterator<Academician> iterator = academicians.iterator();
        while(iterator.hasNext()){
            Academician academician = iterator.next();
            if(academician.getId() == id){
                iterator.remove();
                academician.setDeletedDate(LocalDate.now());
            }
        }
    }

}
