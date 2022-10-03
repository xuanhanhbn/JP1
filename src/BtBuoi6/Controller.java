package BtBuoi6;

import Buoi4.Phone;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Objects;

public class Controller {
    public TextField txtPhoneNumber;
    public TextField txtName;
    public ListView<PhoneNumber> listPhoneBook;
    public Text noticeError;

    private ObservableList<PhoneNumber> phoneList = FXCollections.observableArrayList();
    ;
    public void handleAdd(){
        try {
            noticeError.setVisible(false);
            if(txtName.getText().isEmpty() || txtPhoneNumber.getText().isEmpty()) {
                throw new Exception("Nhập đầy đủ thông tin!!");
            }
            updateListBook();
//            phoneList.add(new PhoneNumber(txtName.getText(), txtPhoneNumber.getText()));
            outputListBook();

        }catch(Exception e) {
            noticeError.setText(e.getMessage());
            noticeError.setVisible(true);
        }
    }

    public void outputListBook() {
        listPhoneBook.setItems(phoneList);
        listPhoneBook.refresh();

    }
    public void updateListBook(){
        for(PhoneNumber p: phoneList){
            if(p.getName().equals(txtName.getText())){
                if(!p.getPhone().equals(txtPhoneNumber.getText())){
                    p.setPhone(txtPhoneNumber.getText());
                    return;
                }
                return;
            }
        }
        phoneList.add(new PhoneNumber(txtName.getText(), txtPhoneNumber.getText()));
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Controller)) return false;
        Controller that = (Controller) o;
        return Objects.equals(txtPhoneNumber, that.txtPhoneNumber) && Objects.equals(txtName, that.txtName) && Objects.equals(listPhoneBook, that.listPhoneBook);
    }

}
