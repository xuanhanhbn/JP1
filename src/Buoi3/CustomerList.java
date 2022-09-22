package Buoi3;

import java.util.ArrayList;

public class CustomerList {
    private Customer Cs[] = new Customer[100];
    private int CountCus,sum1 = 0, sum2 = 0, count = 0, sumTotal = 0;

    public CustomerList() {
        CountCus = 0;
        for (int i = 0; i < 100; i++) {
            Cs[i] = new Customer();
        }
    }
    public void addCustomer(int temp) {
        if(CountCus > 100) {
            System.out.println("Full!");
        } else {
            if(temp == 1) {
                Cs[CountCus] = new CustomerVN();
                CustomerVN csVN = new CustomerVN();
                csVN.input();
                csVN.total = csVN.total();
                Cs[CountCus] = csVN;
            } else {
                Cs[CountCus] = new CustomerForeign();
                CustomerForeign csFor = new CustomerForeign();
                csFor.input();
                csFor.total = csFor.total();
                Cs[CountCus] = csFor;
                sum2 += csFor.quantity;
                sumTotal += csFor.total;
            }
            count++;
            CountCus++;
        }
    }
    public void Output() {
        for(int i = 0; i < CountCus; i++){
            System.out.println("Information: " +(i + 1));
            System.out.println(Cs[i].toString());
        }
    }
    public void totalQuantity() {
        System.out.println("Total Quantity (KW) by Customer Viet Nam: " +sum1);
        System.out.println("Total Quantity (KW) by Customer Foreign: " +sum2);
    }
    public void avg() {
        System.out.println("AVG Total Money by Customer Foreign:  "+(sumTotal/count));
    }
    public void checkDate() {
        String Date = "9/2013", Date1;
        for (int i = 0; i < CountCus; i++){
            Date1 = Cs[i].getDateOfInvoice();
            String[] date1 = Date.split("/");
            String[] date2 = Date1.split("/");
            int month1 = Integer.parseInt(date1[0]);
            int year1 = Integer.parseInt(date1[1]);
            int month2 = Integer.parseInt(date2[0]);
            int year2 = Integer.parseInt(date2[1]);
            if(month1 == month2 && year1 == year2) {
                System.out.println(Cs[i]);
            }
        }
    }
}
