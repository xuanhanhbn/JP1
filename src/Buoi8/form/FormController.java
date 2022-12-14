package Buoi8.form;

import Buoi8.Course;
import Buoi8.Main;
import Buoi8.list.listController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class FormController {
    public TextField txtCode;
    public TextField txtCourseName;
    public TextField txtHours;
    public Text txtNoticeError;

    private ObservableList<Course> listCourse = FXCollections.observableArrayList();

    public void backToList(ActionEvent actionEvent) throws Exception {
        Parent listPage = FXMLLoader.load(getClass().getResource("../list/List.fxml"));
        Scene listScene = new Scene(listPage, 800, 600);
        Main.rootStage.setTitle("Form Add List Course");
        Main.rootStage.setScene(listScene);
    }

    public void handleSubmit(ActionEvent actionEvent) {
        try{
            int hourse = Integer.parseInt(txtHours.getText());
            txtNoticeError.setVisible(true);
            if(txtCode.getText().isEmpty() || txtCourseName.getText().isEmpty() || txtHours.getText().isEmpty()
            || hourse < 0){
                throw new Exception("Error");
            }
            for(Course c: listController.list){
                if(c.getCode().equals(txtCode.getText()))
                    throw new Exception("Nhập trùng Mã Môn Học");
            }
            listController.list.add(new Course(txtCode.getText(), txtCourseName.getText(), hourse));
            backToList(null);
        }catch (Exception e){
            txtNoticeError.setText(e.getMessage());
            txtNoticeError.setVisible(true);
        }
    }
}
