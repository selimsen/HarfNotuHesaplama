package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize1: ");
        int vize1 = scanner.nextInt();
        System.out.print("Vize2: ");
        int vize2 = scanner.nextInt();
        System.out.print("Final: ");
        int finalnot = scanner.nextInt();

        double ortalamanot = (vize1 * 3 / 10.0) + (vize2 * 3 / 10.0) + (finalnot * 4 / 10.0);

        if (ortalamanot >= 90) {

            System.out.print("AA aldınız ve dersi başarı ile geçtiniz.. ");
        }
        else if (ortalamanot >= 85){

            System.out.print("BA aldınız ve dersi başarı ile geçtiniz..");
        }
        else if (ortalamanot >= 80){

            System.out.println("BB aldınız ve dersi başarı ile geçtiniz..");
        }
        else if (ortalamanot >= 75){

            System.out.println("CB aldınız ve dersi geçtiniz..");
        }
        else if (ortalamanot >= 70){

            System.out.println("CC aldınız ve dersi geçtiniz.. Biraz daha efor sarfetmelisin..");
        }
        else if (ortalamanot >= 65){

            System.out.println("DC aldınız ve dersi geçtiniz.. Mezun senenizde ortalama tutmaması durumunda bu dersi tekrar almanız gerekebilir.. ");
        }
        else if (ortalamanot >= 60){

            System.out.println("DD aldınız ve dersi geçtiniz.. Derslere biraz daha önem vermen gerekiyor..");
        }
        else if (ortalamanot >= 55) {

            System.out.println("FD aldınız ve dersten kaldınız..");
        }
        else{

            System.out.println("FF aldınız ve dersten kaldınız.. Bütünlemelerde görüşmek üzere..");
        }
    }
}
