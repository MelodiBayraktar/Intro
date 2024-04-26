import java.util.Scanner;

public class controlStatement {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 20;

        if(number1 < number2){
            System.out.println(number1 + ":küçüktür");
        }
        else if(number1 > number2){
            System.out.println(number1 + ":büyüktür");
        }else{
            System.out.println(number1 + " ve " + number2 + " eşittir. ");
        }
        int assignment = 70;
        if(assignment<=100 && assignment >= 81){
            System.out.println("Not ortalamanız: AA");
        }else if(assignment<=80 && assignment >= 71){
            System.out.println("Not ortalamanız: BA");
        }else if(assignment <=70 && assignment>= 51){
            System.out.println("Not ortalamanız: CC");
        }else{
            System.out.println("Not ortalamanız: FF");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hesap bakiyenizi giriniz: ");
        double accountBalance = scanner.nextDouble();
        System.out.println("Çekmek istediğiniz miktarı giriniz: ");
        double amount = scanner.nextDouble();

        if(amount <= accountBalance){
            accountBalance -=amount;
            System.out.println("Para çekme işlemi başarılı" + " Güncel bakiye: " + accountBalance);
        }else{
            System.out.println("Yetersiz bakiye");
        }

    }
}
