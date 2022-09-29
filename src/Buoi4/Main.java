package Buoi4;

public class Main {
    public static void main(String[] args) {
        PhoneBack pb = new PhoneBack();
        pb.insertPhone("ABC", "09999999");
        for(String pl : pb.PhoneList){
            System.out.println(pl);
        }
    }
}
