import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercicio11 extends Application {

    private int contador = 0;

    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox(10);
        
        Label label = new Label("Cliques: 0");
        Button button = new Button("Contar Cliques");

        button.setOnAction(e -> {
            contador++;
            label.setText("Cliques: " + contador);
        });

        vbox.getChildren().addAll(button, label);

        Scene scene = new Scene(vbox, 200, 100);
        primaryStage.setTitle("Exercício 11 - Contador de Cliques");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
