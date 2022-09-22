package Buoi3;

public class CustomerForeign  extends Customer{
    private String nationality;

    public CustomerForeign() {
    }

    public CustomerForeign(String nationality) {
        this.nationality = nationality;
    }

    public CustomerForeign(String idCustomer, String dateOfInvoice, String nameCustomer, String customerType, double quantity, double price, double total, String nationality) {
        super(idCustomer, dateOfInvoice, nameCustomer, customerType, quantity, price, total);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void input() {
        super.input();
        System.out.println("Input Nationality: ");
        nationality = sc.nextLine();
    }
    public double total() {
        return this.quantity*2000;
    }

    @Override
    public String toString() {
        return "CustomerForeign{" +
                super.toString() +
                "nationality='" + nationality + '\'' +
                '}';
    }
}
