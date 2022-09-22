package Buoi3;

public class CustomerVN extends Customer {
    private int customerType, consumption;

    public CustomerVN() {
    }

    public CustomerVN(int customerType, int consumption) {
        this.customerType = customerType;
        this.consumption = consumption;
    }

    public int getCustomerType() {
        return customerType;
    }

    public void setCustomerType(int customerType) {
        this.customerType = customerType;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }
    public void input() {
        super.input();
        System.out.println("Input Customer Type (1.Sinh Hoat, 2.Kinh Doanh, 3.San Xuat: ") ;
        customerType  = sc.nextInt();
        System.out.println("Input Total Consumption: ");
        consumption = sc.nextInt();
    }
    public void Price() {
        
    }
    public double total() {
        if (this.getQuantity() <= 50 && this.getQuantity() >= 0) {
            total = this.getQuantity() * 1000;
        } else if (this.getQuantity() > 50 && this.getQuantity() <= 100) {
            total = (this.getQuantity() - 50) - 1200 + 50 * 1000;
        } else if (this.getQuantity() > 100 && this.getQuantity() <= 200) {
            total = (this.getQuantity() - 100) - 1500 + 50 * 1000 + 50 * 1200;
        } else {
            total = 50 * 1000 + 50 * 1200 + 100 * 1500 + (this.getQuantity() - 200);
        }
        return 0;
    }

    @Override
    public String toString() {
        String temp;
        if (customerType == 1) {
            temp = "Sinh Hoat";
        } else if(customerType == 2) {
            temp = "Kinh Doanh";
        } else {
            temp = "San Xuat";
        }
        return "CustomerVN{" +
                super.toString() +
                "customerType=" + customerType +
                temp +
                ", consumption=" + consumption +
                '}';
    }
}
