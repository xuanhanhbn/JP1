package Buoi7;

import BtBuoi6.PhoneNumber;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtPoint;
    public Text noticeError;
    public ListView<SinhVien> lvList;

    private boolean sortName = true;
    private boolean sortPoint = true;

    private ObservableList<SinhVien> listSV = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listSV.add(new SinhVien("Nguyễn Xuân Hạnh", "hanh@gmail.com", 9));
        lvList.setItems(listSV);
    }

    public void handleAdd() {
        try {
            Integer point = Integer.parseInt(txtPoint.getText());
            noticeError.setVisible(false);
            if (txtName.getText().isEmpty() || txtEmail.getText().isEmpty() || !txtEmail.getText().contains("@")
                    || txtEmail.getText().startsWith("@")  || txtPoint.getText().isEmpty() || point < 0) {
                throw new Exception("Dien day du thong tin");
            }
            listSV.add(new SinhVien(txtName.getText(), txtEmail.getText(), point));
            outputList();
            clearInput();
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
        Collections.sort(listSV, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return sortName?o1.getName().compareTo(o2.getName()):o2.getName().compareTo(o1.getName());
            }
        });
        sortName = !sortName;
    }

    public void handleSortByPoint() {
        Collections.sort(listSV, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return (int) (sortPoint?o1.getPoint() - o2.getPoint():o2.getPoint() - o1.getPoint());
            }
        });
        sortPoint = !sortPoint;
    }
    public void clearInput(){
        txtName.setText("");
        txtEmail.setText("");
        txtPoint.setText("");
    }
}
