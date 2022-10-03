package BtBuoi6;

import javafx.scene.control.TextField;

import java.util.Objects;

public class Controller {
    public TextField txtPhoneNumber;
    public TextField txtName;
    public TextField listPhoneBook;

    public void handleAdd(){
        String fn = txtName.getText();
        String ph = txtPhoneNumber.getText();
        Integer nPhone = Integer.parseInt(ph);
        if (equals(true)) {
            listPhoneBook.setText(fn.concat(": ").concat(ph));
        } else {
            listPhoneBook.setText("Error");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Controller)) return false;
        Controller that = (Controller) o;
        return Objects.equals(txtPhoneNumber, that.txtPhoneNumber) && Objects.equals(txtName, that.txtName) && Objects.equals(listPhoneBook, that.listPhoneBook);
    }

}
