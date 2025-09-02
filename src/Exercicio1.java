import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Exercicio1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // StackPane centraliza seus filhos por padrão
        StackPane root = new StackPane();
        
        Label label = new Label("Layouts organizam os elementos da interface.\n" +
                "Eles definem posição, alinhamento e espaçamento de forma automática.");
        
        root.getChildren().add(label);

        Scene scene = new Scene(root, 400, 200);
        primaryStage.setTitle("Exercício 1 - Conceito de Layouts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
