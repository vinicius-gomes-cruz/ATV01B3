import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercicio2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox(10); // spacing = 10
        vbox.setAlignment(Pos.CENTER); // centraliza os elementos

        Label userLabel = new Label("Usuário:");
        TextField userField = new TextField();

        Label passLabel = new Label("Senha:");
        TextField passField = new TextField();

        Button entrarBtn = new Button("Entrar");

        vbox.getChildren().addAll(userLabel, userField, passLabel, passField, entrarBtn);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Exercício 2 - Login VBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
