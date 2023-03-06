package MinumumMax;

import java.util.Scanner;

public class Cod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a , buyuk = 0, kucuk = 999999999, value;

        System.out.print("Kaç sayı girilecek : ");
        a = sc.nextInt();

        for (int i = 1; i <= a; i++) {

            System.out.print("Değer girin : ");
            value = sc.nextInt();

            if (value > buyuk) {

                buyuk = value;

            }

            if (value < kucuk) {

                kucuk = value ;

            }

        }

        System.out.println(buyuk);
        System.out.println(kucuk);

    }
}
