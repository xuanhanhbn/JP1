package Buoi8.form;

import Buoi8.Course;
import Buoi8.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import javax.naming.Context;

public class FormController {
    public TextField txtCode;
    public TextField txtCourseName;
    public TextField txtHours;
    public Text txtNoticeError;

    private ObservableList<Course> listCourse = FXCollections.observableArrayList();
    private final static Context instance = new Context();

    public static Context getInstance(){

    }
    public void backToList(ActionEvent actionEvent) throws Exception {
        Parent listPage = FXMLLoader.load(getClass().getResource("../list/List.fxml"));
        Scene listScene = new Scene(listPage, 800, 600);
        Main.rootStage.setTitle("Form Add List Course");
        Main.rootStage.setScene(listScene);
    }

    public void handleSubmit(ActionEvent actionEvent) {
        try{
            txtNoticeError.setVisible(true);
            if(txtCode.getText().isEmpty() || txtCourseName.getText().isEmpty() || txtHours.getText().isEmpty()){
                for(Course c : listCourse) {
                    if(c.getCode().equals(txtCode.getText())){
                        throw new Exception("Error");
                    }
                }
            }
            listCourse.add(new Course(txtCode.getText(), txtCourseName.getText(), txtHours.getText()));
        }catch (Exception e){
            txtNoticeError.setText(e.getMessage());
            txtNoticeError.setVisible(true);
        }
    }
    public void displayList(String list){
        listCourse.add(new Course(txtCode.getText(), txtCourseName.getText(), txtHours.getText()));
    }
}
