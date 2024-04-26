public class StudentsGrades {
    public static void main(String[] args) {
        String[] students = {"Burak", "Esat", "Sevde"};
        double[] grades= {95.50, 85.50, 75 };
        double total = 0;
        double ort = 0;
        for (int i = 0; i<students.length; i++){
            total += grades[i];
        }
        ort = total / students.length;
        System.out.println("Öğrencilerin not ortalamaları toplamı: " + ort );
    }
}
