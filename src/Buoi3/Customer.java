package Buoi3;

import java.util.Scanner;

public class Customer {
    public String idCustomer, dateOfInvoice, nameCustomer;
    public double quantity, total;

    Scanner sc = new Scanner(System.in);

    public Customer() {
    }

    public Customer(String idCustomer, String dateOfInvoice, String nameCustomer, String customerType, double quantity, double price, double total) {
        this.idCustomer = idCustomer;
        this.dateOfInvoice = dateOfInvoice;
        this.nameCustomer = nameCustomer;
        this.quantity = quantity;
        this.total = total;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getDateOfInvoice() {
        return dateOfInvoice;
    }

    public void setDateOfInvoice(String dateOfInvoice) {
        this.dateOfInvoice = dateOfInvoice;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void input() {
        System.out.println("Input Id Customer: ");
        idCustomer = sc.nextLine();
        System.out.println("Input Name Customer: ");
        nameCustomer = sc.nextLine();
        System.out.println("Input Date of Invoice: ");
        dateOfInvoice = sc.nextLine();
        System.out.println("Input Quantity (KW): ");
        quantity = sc.nextDouble();
    }

    @Override
    public String toString() {
        return
                "idCustomer='" + idCustomer + '\'' +
                ", dateOfInvoice='" + dateOfInvoice + '\'' +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", quantity=" + quantity +
                ", total=" + total ;
    }
}
