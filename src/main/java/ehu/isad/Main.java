package ehu.isad;

import ehu.isad.controller.ui.HasieraKud;
import ehu.isad.controller.ui.IzenakHautatuKud;
import ehu.isad.controller.ui.TableroaKud;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

  private Parent hasiera;
  private Parent izenakHautatu;
  private Parent tableroa;

  private Stage stage;

  private HasieraKud hasieraKud;
  private IzenakHautatuKud izenakHautatuKud;
  private TableroaKud tableroaKud;


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

    FXMLLoader loaderTablero = new FXMLLoader(getClass().getResource("/view/tableroa.fxml"));
    tableroa = (Parent) loaderTablero.load();
    tableroaKud = loaderTablero.getController();
    tableroaKud.setMainApp(this);
  }


  public static void main(String[] args) {
    launch(args);
  }

  public void izenakHautatuKargatu(){
      Parent root = new AnchorPane(izenakHautatu);
      stage.setScene(new Scene(root));
      stage.show();

  }

  public void tableroaKargatu(String j1,String j2){
      Parent root = new AnchorPane(tableroa);
      tableroaKud.jokalariaEzarri(j1,j2);
      stage.setScene(new Scene(root));
      stage.show();
    }





}
