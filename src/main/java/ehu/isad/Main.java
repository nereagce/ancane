package ehu.isad;

import ehu.isad.controller.ui.HasieraKud;
import ehu.isad.controller.ui.IzenakHautatuKud;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

  private Parent hasiera;
  private Parent izenakHautatu;

  private Stage stage;

  private HasieraKud hasieraKud;
  private IzenakHautatuKud izenakHautatuKud;


  @Override
  public void start(Stage primaryStage) throws Exception {
    stage = primaryStage;
    pantailakKargatu();

    stage.setTitle("Conecta4");
    stage.setScene(new Scene(hasiera));
    stage.show();
  }

  private void pantailakKargatu() throws IOException {

    FXMLLoader loaderHasiera = new FXMLLoader(getClass().getResource("/view/hasiera.fxml"));
    hasiera = (Parent) loaderHasiera.load();
    hasieraKud = loaderHasiera.getController();
    hasieraKud.setMainApp(this);

    FXMLLoader loaderIzenakHautatu = new FXMLLoader(getClass().getResource("/view/izenakHautatu.fxml"));
    izenakHautatu = (Parent) loaderIzenakHautatu.load();
    izenakHautatuKud = loaderIzenakHautatu.getController();
    izenakHautatuKud.setMainApp(this);

  }


  public static void main(String[] args) {
    launch(args);
  }




}
