public class EmployeeSalaries {
    public static void main(String[] args) {
        String[] employeeNames = {" Burak" , " Esat", " Sevde"};
        String[] employeeSurnames = {" Balıkçı", " Yener", " Köycü "};
        double[] employeeSalaries = {30500, 40000,28200};

        double tax = 0.1;
        for(int i= 0; i <employeeNames.length;i++){
            System.out.println("Çalışan adı: " + employeeNames[i] +
                    " Çalışan soyadı: " + employeeSurnames[i] +" Brüt maaşı: " + employeeSalaries[i] +" Net maaşı: " + (1- tax)* employeeSalaries[i]);
        }

    }
}
