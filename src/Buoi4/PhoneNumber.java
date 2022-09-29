package Buoi4;

import java.util.ArrayList;

public class PhoneNumber {
    String name;

    public PhoneNumber() {
    }

    public PhoneNumber(String name, ArrayList<String> PhoneList) {
        this.name = name;
        this.PhoneList = PhoneList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    ArrayList<String> PhoneList;
}
