package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button botaoA = new Button("A");
        Button botaoB = new Button("B");
        Button botaoC = new Button("C");

        botaoA.setOnAction(e -> System.out.println("A"));
        botaoB.setOnAction(e -> System.out.println("B"));
        botaoC.setOnAction(e -> System.exit(0));

        VBox box = new VBox();

        box.setAlignment(Pos.CENTER);
        box.setSpacing(10);
        box.getChildren().add(botaoA);
        box.getChildren().add(botaoB);
        box.getChildren().add(botaoC);

        Scene cenaPrincipal = new Scene(box, 200, 200);

        primaryStage.setScene(cenaPrincipal);
        primaryStage.show();

    }
}
