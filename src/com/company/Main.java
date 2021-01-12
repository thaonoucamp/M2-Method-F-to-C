package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// B3: tao phuong thuc main() de chay chuong trinh;
        Scanner input = new Scanner(System.in);
        double fah;
        double cel = 6;
        int choice;

        do {
            System.out.println("Menu :");
            System.out.println("0. Exit");
            System.out.println("1. Cel to Fah");
            System.out.println("2. Fah to Cel");
            System.out.println("Enter your choice :");

            choice = input.nextInt();
            switch (choice) {
                case 1:
                    // B5: goi phuong thuc chuyen tu C to F cho nguoi dung chon;
                    System.out.println("Enter Cel : ");
                    cel = input.nextDouble();
                    System.out.println("Cel to Fah : "+cToF(cel));
                    cToF(cel);
                    break;
                case 2:
                    // B4: goi phuong thuc chuyen tu F to C cho nguoi dung chon;
                    System.out.println("Enter Fah :");
                    fah = input.nextDouble();
                    System.out.println("Fah to Cel : "+fToC(fah));
                    break;
                case 0:
                    System.exit(0);

            }
        } while (choice != 0);
    }

    // B1: xay dung phuong thuc chuyen doi tu F sang C;
    public static double cToF(double cel) {
        double f = (9.0 / 5) * cel + 32;
        return f;
    }

    // Xay dung phuong thuc chuyen doi tu F sang C;
    public static double fToC(double fah) {
        double c = (5.0 / 9) * (fah - 32);
        return c;
    }
}
