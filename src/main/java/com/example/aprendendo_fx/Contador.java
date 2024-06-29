package com.example.aprendendo_fx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

    public static void main(String[] args) {
        launch(args);}

    @Override
    public void start(Stage primaryStage) {

        Label labellTitulo = new Label("Contador");
        Label numero = new Label("0");

        Button botaoDecremento = new Button("-");
        Button botaoIncremento = new Button("+");

        HBox boxBotoes = new HBox();
        boxBotoes.setAlignment(Pos.CENTER);
        boxBotoes.setSpacing(10);
        boxBotoes.getChildren().add(botaoDecremento);
        boxBotoes.getChildren().add(botaoIncremento);

        VBox boxPrincipal = new VBox();
        boxPrincipal.setSpacing(10);
        boxPrincipal.setAlignment(Pos.CENTER);
        boxPrincipal.getChildren().add(labellTitulo);
        boxPrincipal.getChildren().add(numero);
        boxPrincipal.getChildren().add(boxBotoes);


        Scene cenaPrincipal = new Scene(boxPrincipal, 400, 400);

        primaryStage.setScene(cenaPrincipal);

       primaryStage.show();
    }

}
