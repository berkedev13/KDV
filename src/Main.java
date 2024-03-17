import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your money: ");
        int simpleMoney = input.nextInt();
        double moneyKDV, KDV;
        if (simpleMoney <= 1000 && simpleMoney >= 0) {
            KDV = 0.18;
            moneyKDV = simpleMoney * (1 + KDV);

        }
        else {
            KDV = 0.08;
            moneyKDV = simpleMoney * (1 + KDV);
        }
        System.out.println("KDV'li Fiyat: " + moneyKDV);
        System.out.println("KDV tutarı: " + (moneyKDV - simpleMoney));
    }
}