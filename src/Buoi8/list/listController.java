package Buoi8.list;

import Buoi8.Main;
import Buoi8.Course;
import Buoi8.form.FormController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;



public class listController  {
    public ListView lvListDetails;
    @FXML



    public void goToForm(ActionEvent actionEvent) throws Exception {

        Parent listPage = FXMLLoader.load(getClass().getResource("../form/Form.fxml"));
        Scene listScene = new Scene(listPage, 800, 600);
        Main.rootStage.setTitle("Form Add Course");
        Main.rootStage.setScene(listScene);
    }
}
