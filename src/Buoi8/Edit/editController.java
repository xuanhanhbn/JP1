package Buoi8.Edit;

import Buoi8.Course;
import Buoi8.Main;
import Buoi8.list.listController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;


public class editController implements Initializable {
    public TextField txtCode;
    public TextField txtCourseName;
    public TextField txtHours;
    public Text txtNoticeError;

    private ObservableList<Course> listCourse = FXCollections.observableArrayList();

    public void backToList(ActionEvent actionEvent) throws Exception {
        Parent listPage = FXMLLoader.load(getClass().getResource("../list/List.fxml"));
        Scene listScene = new Scene(listPage, 800, 600);
        Main.rootStage.setTitle("EditList Course");
        Main.rootStage.setScene(listScene);
    }

    public void handleSubmit(ActionEvent actionEvent) {
        try{
            int hourse = Integer.parseInt(txtHours.getText());
            txtNoticeError.setVisible(true);
            if(txtCourseName.getText().isEmpty() || hourse < 0){
                throw new Exception("Error");
            }
            listController.editItem.setCourseName(txtCourseName.getText());
            listController.editItem.setHours(hourse);
            backToList(null);
        }catch (Exception e){
            txtNoticeError.setText(e.getMessage());
            txtNoticeError.setVisible(true);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            if(listController.editItem == null) {
                backToList(null);
            }
            txtCode.setText(listController.editItem.getCode());
            txtCourseName.setText(listController.editItem.getCourseName());
            txtHours.setText(listController.editItem.getHours().toString());
            txtCode.setEditable(false);

        }catch (Exception e){

        }

    }
}
