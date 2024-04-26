package OOP.Inheritance;

public class Academician extends User{
    private String section;

    public Academician() {

    }

    public Academician(int id,String firstName, String lastName, String email, String password, String section) {
        super(id,firstName, lastName, email, password);
        this.section = section;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
