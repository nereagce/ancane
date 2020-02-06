package ehu.isad.controller.ui;

import ehu.isad.Main;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

public class HasieraKud implements Initializable {

    private Main mainApp;

    private static HasieraKud instantzia = new HasieraKud();

    public static HasieraKud getInstantzia() {
        return instantzia;
    }



    public void setMainApp(Main main) {
        this.mainApp = main;
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}