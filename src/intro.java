import java.util.Scanner;
public class intro {
    public static void main(String[] args) {
        //2- Do-While ve While döngüsü nedir? Bununla ilgili örnek yapınız./

//Do-while önce yapılacak işlemi sonra koşulu belirtir.
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Bir sayı girin (çıkmak için 0'a basın): ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Girdiğiniz sayıların toplamı: " + sum);
        scanner.close();
        //while önce koşulu belirtip sonrasında yapılacak işlemi belirtir

        Scanner scanner1 = new Scanner(System.in);
        int sum1 = 0;
        int number1;

        System.out.println("Bir sayı girin (çıkmak için 0'a basın): ");
        number1 = scanner1.nextInt();

        while (number1 != 0) {
            sum1 += number1;
            System.out.println("Bir sayı girin (çıkmak için 0'a basın): ");
            number1 = scanner1.nextInt();
        }

        System.out.println("Girdiğiniz sayıların toplamı: " + sum1);
        scanner.close();
    }
}