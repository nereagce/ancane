package ehu.isad.controller.ui;

import ehu.isad.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class IzenakHautatuKud implements Initializable {

    private Main mainApp;

    private static IzenakHautatuKud instantzia = new IzenakHautatuKud();

    public static IzenakHautatuKud getInstantzia() {
        return instantzia;
    }

    public void setMainApp(Main main) {
        this.mainApp = main;
    }

    @FXML
    private TextField jokalariBat;
    @FXML
    private TextField jokalariBi;




    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void ok(ActionEvent actionEvent) {
       String j1 = jokalariBat.getText();
       String j2 = jokalariBi.getText();
       if (j2.length()!=0 && j1.length()!=0) {
           mainApp.tableroaKargatu(j1, j2);
       }
    }

}