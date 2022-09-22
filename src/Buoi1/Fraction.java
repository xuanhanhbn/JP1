package Buoi1;

import java.util.Scanner;

public class Fraction {
    Scanner scanner = new Scanner(System.in);
    public int tuSo;
    public int mauSo;

    public Fraction(int tuSo, int mauSo) {
        if (mauSo == 0) {
            System.out.println("Mau so khong duoc bang 0");
            tuSo = 0;
            mauSo = 1;
        } else {
            this.tuSo = tuSo;
            this.mauSo = mauSo;
        }
    }

    public Fraction() {
        tuSo = 0;
        mauSo = 1;
    }

    public void input() {
        System.out.println("Nhap tu so : ");
        tuSo = scanner.nextInt();
        System.out.println("Nhap mau so : ");
        mauSo = scanner.nextInt();
    }

    public void output() {
        System.out.println(Math.abs(tuSo) + "/" + Math.abs(mauSo));
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public Fraction add(Fraction ps2) {
        int ts = tuSo * ps2.mauSo + ps2.tuSo * mauSo;
        int ms = mauSo * ps2.mauSo;
        return new Fraction(ts, ms);
    }

    public Fraction sub(Fraction ps2) {
        int ts = tuSo * ps2.mauSo - ps2.tuSo * mauSo;
        int ms = mauSo * ps2.mauSo;
        return new Fraction(ts,ms);
    }
}
