package ehu.isad.controller.ui;

import ehu.isad.Main;
import javafx.fxml.Initializable;
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



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}