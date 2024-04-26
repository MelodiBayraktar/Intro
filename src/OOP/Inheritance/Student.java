package OOP.Inheritance;

public class Student extends User {
    private String about;

    public Student() {

    }

    public Student(int id,String firstName, String lastName, String email, String password, String about) {
        super(id, firstName, lastName, email, password);
        this.about = about;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
