package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

    private int contador =0;

    private void atualizarLabelNumero(Label label){
        label.setText(Integer.toString(contador));
        label.getStyleClass().remove("verde");
        label.getStyleClass().remove("vermelha");

        if (contador > 0){
            label.getStyleClass().add("verde");
        } else if (contador < 0) {
            label.getStyleClass().add("vermelha");
        }
    }

    public static void main(String[] args) {
        launch(args);}



    @Override
    public void start(Stage primaryStage) {

        Label labellTitulo = new Label("Contador");
        labellTitulo.getStyleClass().add("titulo");

        Label numero = new Label("0");
        numero.getStyleClass().add("numero");



        Button botaoDecremento = new Button("-");
        botaoDecremento.getStyleClass().add("botaoVermelho");
        botaoDecremento.setOnAction(e -> {
            contador--;
            atualizarLabelNumero(numero);
        });

        Button botaoIncremento = new Button("+");
        botaoIncremento.getStyleClass().add("botaoVerde");
        botaoIncremento.getStyleClass().add("botao:hover");
        botaoIncremento.setOnAction(e -> {
            contador++;
            atualizarLabelNumero(numero);

        });

        HBox boxBotoes = new HBox();
        boxBotoes.setAlignment(Pos.CENTER);
        boxBotoes.setSpacing(10);
        boxBotoes.getChildren().add(botaoDecremento);
        boxBotoes.getChildren().add(botaoIncremento);

        VBox boxPrincipal = new VBox();

        boxPrincipal.getStyleClass().add("conteudo");
        boxPrincipal.setSpacing(10);
        boxPrincipal.setAlignment(Pos.CENTER);
        boxPrincipal.getChildren().add(labellTitulo);
        boxPrincipal.getChildren().add(numero);
        boxPrincipal.getChildren().add(boxBotoes);

        String caminhoCSS = getClass()
                .getResource("/Contador.css")
                .toExternalForm();
        Scene cenaPrincipal = new Scene(boxPrincipal, 400, 400);
        cenaPrincipal.getStylesheets().add(caminhoCSS);
        cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");

        primaryStage.setScene(cenaPrincipal);

       primaryStage.show();
    }

}
