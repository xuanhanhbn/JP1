package Buoi8.list;

import Buoi8.Main;
import Buoi8.Course;
import Buoi8.form.FormController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;


public class listController implements Initializable {
    public ListView<Course> lvListDetails;

    public static ObservableList<Course> list = FXCollections.observableArrayList();
    public static Course editItem;


    public void goToForm(ActionEvent actionEvent) throws Exception {

        Parent listPage = FXMLLoader.load(getClass().getResource("../form/Form.fxml"));
        Scene listScene = new Scene(listPage, 800, 600);
        Main.rootStage.setTitle("Form Add Course");
        Main.rootStage.setScene(listScene);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        list.add(new Course("JP1", "Java1", 40));
//        list.add(new Course("JP2", "Java2", 60));
        lvListDetails.setItems(list);
    }

    public void editList(ActionEvent actionEvent) throws Exception {
        editItem = lvListDetails.getSelectionModel().getSelectedItem(); // Lay du lieu duoc chon;
        if(editItem == null) return;

        Parent listPage = FXMLLoader.load(getClass().getResource("../Edit/Form.fxml"));
        Scene listScene = new Scene(listPage, 800, 600);
        Main.rootStage.setTitle("Form EditCourse");
        Main.rootStage.setScene(listScene);
    }
}
