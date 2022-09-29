package Buoi4;

import java.util.ArrayList;


public class PhoneBack extends Phone{

    public ArrayList<String> PhoneList;


    @Override
     void insertPhone(String name, String phone) {
        if(PhoneList.isEmpty()) {
            PhoneList.add(name + ", " + phone);
        } else {
            boolean check = false;
            for(String i : PhoneList) {
                if(i.contains(name + ", ")) {
                    check = true;
                    if(!i.contains(phone)) {
                        PhoneList.set(PhoneList.indexOf(i), i + ":" + phone);
                    }
                    break;
                }
            }
            if(!check) {
                PhoneList.add(name + ", " + phone);
            }
        }
    }

    @Override
    void removePhone(String name) {

    }

    @Override
    void updatePhone(String name, String oldPhone, String newPhone) {

    }

    @Override
    void searchPhone(String name) {

    }

    @Override
    void sort() {

    }
}
