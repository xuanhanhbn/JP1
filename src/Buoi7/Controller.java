package Buoi7;

import BtBuoi6.PhoneNumber;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.awt.event.ActionEvent;
import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;

public class Controller {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtPoint;
    public Text noticeError;
    public ListView<SinhVien> lvList;

    private ObservableList<SinhVien> listSV = FXCollections.observableArrayList();

    public void handleAdd() {
        try {
            noticeError.setVisible(false);
            if (txtName.getText().isEmpty() || txtEmail.getText().isEmpty() || !txtEmail.getText().contains("@")
                    || txtEmail.getText().startsWith("@")  || txtPoint.getText().isEmpty()) {
                throw new Exception("Dien day du thong tin");
            }
            listSV.add(new SinhVien(txtName.getText(), txtEmail.getText(), txtPoint.getText()));
            outputList();
        } catch (Exception e) {
            noticeError.setText(e.getMessage());
            noticeError.setVisible(true);
        }
    }

    public void outputList() {
        lvList.setItems(listSV);
        lvList.refresh();
    }

    public void handleSortByName() {
        Collections.sort(listSV,new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien lhs, SinhVien rhs) {
                return lhs.name.compareTo(rhs.name);
            }
        });
    }

    public void handleSortByPoint() {
        Collections.sort(listSV, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.point.compareTo(o2.point);
            }
        });

    }
}
