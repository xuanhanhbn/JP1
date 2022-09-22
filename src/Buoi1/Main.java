package Buoi1;
import java.util.Scanner;




public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction ps1 = new Fraction();
        Fraction ps2 = new Fraction();
        Fraction psTong;

        System.out.println("Nhap PS1: ");
        ps1.input();
        System.out.println("Nhap PS2: ");
        ps2.input();

        System.out.println("PS1 la: ");
        ps1.output();
        System.out.println("PS2 la: ");
        ps2.output();

        psTong = ps1.add(ps2);
        System.out.println("Tong 2 PS la :");
        psTong.output();
    }
}
