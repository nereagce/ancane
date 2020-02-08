package ehu.isad.controller.ui;

import ehu.isad.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TableroaKud implements Initializable {

    private Main mainApp;

    private int jokalaria;

    private static boolean[][] tableroa;

    @FXML
    private ImageView k00; //columna,linea
    @FXML
    private ImageView k01;
    @FXML
    private ImageView k02;
    @FXML
    private ImageView k03;
    @FXML
    private ImageView k04;
    @FXML
    private ImageView k05;

    @FXML
    private ImageView k10; //columna,linea
    @FXML
    private ImageView k11;
    @FXML
    private ImageView k12;
    @FXML
    private ImageView k13;
    @FXML
    private ImageView k14;
    @FXML
    private ImageView k15;

    @FXML
    private ImageView k20; //columna,linea
    @FXML
    private ImageView k21;
    @FXML
    private ImageView k22;
    @FXML
    private ImageView k23;
    @FXML
    private ImageView k24;
    @FXML
    private ImageView k25;

    @FXML
    private ImageView k30; //columna,linea
    @FXML
    private ImageView k31;
    @FXML
    private ImageView k32;
    @FXML
    private ImageView k33;
    @FXML
    private ImageView k34;
    @FXML
    private ImageView k35;

    @FXML
    private ImageView k40; //columna,linea
    @FXML
    private ImageView k41;
    @FXML
    private ImageView k42;
    @FXML
    private ImageView k43;
    @FXML
    private ImageView k44;
    @FXML
    private ImageView k45;

    @FXML
    private ImageView k50; //columna,linea
    @FXML
    private ImageView k51;
    @FXML
    private ImageView k52;
    @FXML
    private ImageView k53;
    @FXML
    private ImageView k54;
    @FXML
    private ImageView k55;

    @FXML
    private ImageView k60; //columna,linea
    @FXML
    private ImageView k61;
    @FXML
    private ImageView k62;
    @FXML
    private ImageView k63;
    @FXML
    private ImageView k64;
    @FXML
    private ImageView k65;

    @FXML
    private ImageView k70; //columna,linea
    @FXML
    private ImageView k71;
    @FXML
    private ImageView k72;
    @FXML
    private ImageView k73;
    @FXML
    private ImageView k74;
    @FXML
    private ImageView k75;

    @FXML
    private ImageView k80; //columna,linea
    @FXML
    private ImageView k81;
    @FXML
    private ImageView k82;
    @FXML
    private ImageView k83;
    @FXML
    private ImageView k84;
    @FXML
    private ImageView k85;


    @FXML
    private Label jokalariTxanda;


    public void setMainApp(Main main) {
        this.mainApp = main;
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //metodo de get izena del primero y del segundo

        jokalariTxanda.setText("lehenengoa");//nombre del primero
        jokalaria = 1;
        tableroa = new boolean[9][6];
        for (int i=0;i<tableroa.length;i++){
            for (int j=0;j<tableroa[i].length;j++){
                tableroa[i][j] = false;

            }
        }



    }

    public void fitxaSartu(ImageView kasilla) { //int zutabea pasar

        if (jokalaria == 1) {
            kasilla.setImage(new Image("/irudiak/rojo.png"));
            jokalaria++;
            jokalariTxanda.setText("bigarrena");
        } else {
            kasilla.setImage(new Image("/irudiak/azul.jpg"));
            jokalaria--;
            jokalariTxanda.setText("lehenengoa");
        }
    }

    public void b0(ActionEvent actionEvent) { //se repite igual se puede sacar el codigo
        if (tableroa[0][5] == false) { //false --> EZ dago beteta
            fitxaSartu(k05);
            tableroa[0][5] = true;
        } else if (tableroa[0][4] == false) {
            fitxaSartu(k04);
            tableroa[0][4] = true;
        } else if (tableroa[0][3] == false) {
            fitxaSartu(k03);
            tableroa[0][3] = true;
        } else if (tableroa[0][2] == false) {
            fitxaSartu(k02);
            tableroa[0][2] = true;
        } else if (tableroa[0][1] == false) {
            fitxaSartu(k01);
            tableroa[0][1] = true;
        } else if (tableroa[0][0]  == false) {
            fitxaSartu(k00);
            tableroa[0][0] = true;
        }
    }

    public void b1(ActionEvent actionEvent) {
        if (tableroa[1][5] == false) { //false --> EZ dago beteta
            fitxaSartu(k15);
            tableroa[1][5] = true;
        } else if (tableroa[1][4] == false) {
            fitxaSartu(k14);
            tableroa[1][4] = true;
        } else if (tableroa[1][3] == false) {
            fitxaSartu(k13);
            tableroa[1][3] = true;
        } else if (tableroa[1][2] == false) {
            fitxaSartu(k12);
            tableroa[1][2] = true;
        } else if (tableroa[1][1] == false) {
            fitxaSartu(k11);
            tableroa[1][1] = true;
        } else if (tableroa[1][0]  == false) {
            fitxaSartu(k10);
            tableroa[1][0] = true;
        }

    }
    public void b2(ActionEvent actionEvent) {
        if (tableroa[2][5] == false) { //false --> EZ dago beteta
            fitxaSartu(k25);
            tableroa[2][5] = true;
        } else if (tableroa[2][4] == false) {
            fitxaSartu(k24);
            tableroa[2][4] = true;
        } else if (tableroa[2][3] == false) {
            fitxaSartu(k23);
            tableroa[2][3] = true;
        } else if (tableroa[2][2] == false) {
            fitxaSartu(k22);
            tableroa[2][2] = true;
        } else if (tableroa[2][1] == false) {
            fitxaSartu(k21);
            tableroa[2][1] = true;
        } else if (tableroa[2][0]  == false) {
            fitxaSartu(k20);
            tableroa[2][0] = true;
        }

    }
    public void b3(ActionEvent actionEvent) {
        if (tableroa[3][5] == false) { //false --> EZ dago beteta
            fitxaSartu(k35);
            tableroa[3][5] = true;
        } else if (tableroa[3][4] == false) {
            fitxaSartu(k34);
            tableroa[3][4] = true;
        } else if (tableroa[3][3] == false) {
            fitxaSartu(k33);
            tableroa[3][3] = true;
        } else if (tableroa[3][2] == false) {
            fitxaSartu(k32);
            tableroa[3][2] = true;
        } else if (tableroa[3][1] == false) {
            fitxaSartu(k31);
            tableroa[3][1] = true;
        } else if (tableroa[3][0]  == false) {
            fitxaSartu(k30);
            tableroa[3][0] = true;
        }

    }
    public void b4(ActionEvent actionEvent) {
        if (tableroa[4][5] == false) { //false --> EZ dago beteta
            fitxaSartu(k45);
            tableroa[4][5] = true;
        } else if (tableroa[4][4] == false) {
            fitxaSartu(k44);
            tableroa[4][4] = true;
        } else if (tableroa[4][3] == false) {
            fitxaSartu(k43);
            tableroa[4][3] = true;
        } else if (tableroa[4][2] == false) {
            fitxaSartu(k42);
            tableroa[4][2] = true;
        } else if (tableroa[4][1] == false) {
            fitxaSartu(k41);
            tableroa[4][1] = true;
        } else if (tableroa[4][0]  == false) {
            fitxaSartu(k40);
            tableroa[4][0] = true;
        }

    }
    public void b5(ActionEvent actionEvent) {
        if (tableroa[5][5] == false) { //false --> EZ dago beteta
            fitxaSartu(k55);
            tableroa[5][5] = true;
        } else if (tableroa[5][4] == false) {
            fitxaSartu(k54);
            tableroa[5][4] = true;
        } else if (tableroa[5][3] == false) {
            fitxaSartu(k53);
            tableroa[5][3] = true;
        } else if (tableroa[5][2] == false) {
            fitxaSartu(k52);
            tableroa[5][2] = true;
        } else if (tableroa[5][1] == false) {
            fitxaSartu(k51);
            tableroa[5][1] = true;
        } else if (tableroa[5][0]  == false) {
            fitxaSartu(k50);
            tableroa[5][0] = true;
        }

    }
    public void b6(ActionEvent actionEvent) {
        if (tableroa[6][5] == false) { //false --> EZ dago beteta
            fitxaSartu(k65);
            tableroa[6][5] = true;
        } else if (tableroa[6][4] == false) {
            fitxaSartu(k64);
            tableroa[6][4] = true;
        } else if (tableroa[6][3] == false) {
            fitxaSartu(k63);
            tableroa[6][3] = true;
        } else if (tableroa[6][2] == false) {
            fitxaSartu(k62);
            tableroa[6][2] = true;
        } else if (tableroa[6][1] == false) {
            fitxaSartu(k61);
            tableroa[6][1] = true;
        } else if (tableroa[6][0]  == false) {
            fitxaSartu(k60);
            tableroa[6][0] = true;
        }

    }
    public void b7(ActionEvent actionEvent) {
        if (tableroa[7][5] == false) { //false --> EZ dago beteta
            fitxaSartu(k75);
            tableroa[7][5] = true;
        } else if (tableroa[7][4] == false) {
            fitxaSartu(k74);
            tableroa[7][4] = true;
        } else if (tableroa[7][3] == false) {
            fitxaSartu(k73);
            tableroa[7][3] = true;
        } else if (tableroa[7][2] == false) {
            fitxaSartu(k72);
            tableroa[7][2] = true;
        } else if (tableroa[7][1] == false) {
            fitxaSartu(k71);
            tableroa[7][1] = true;
        } else if (tableroa[7][0]  == false) {
            fitxaSartu(k70);
            tableroa[7][0] = true;
        }

    }
    public void b8(ActionEvent actionEvent) {
        if (tableroa[8][5] == false) { //false --> EZ dago beteta
            fitxaSartu(k85);
            tableroa[8][5] = true;
        } else if (tableroa[8][4] == false) {
            fitxaSartu(k84);
            tableroa[8][4] = true;
        } else if (tableroa[8][3] == false) {
            fitxaSartu(k83);
            tableroa[8][3] = true;
        } else if (tableroa[8][2] == false) {
            fitxaSartu(k82);
            tableroa[8][2] = true;
        } else if (tableroa[8][1] == false) {
            fitxaSartu(k81);
            tableroa[8][1] = true;
        } else if (tableroa[8][0]  == false) {
            fitxaSartu(k80);
            tableroa[8][0] = true;
        }

    }

}