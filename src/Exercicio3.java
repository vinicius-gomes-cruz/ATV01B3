import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercicio3 extends Application {

    @Override
    public void start(Stage primaryStage) {
        HBox hbox = new HBox(10); // spacing = 10
        hbox.setAlignment(Pos.CENTER); // centraliza horizontalmente

        Button novoBtn = new Button("Novo");
        Button abrirBtn = new Button("Abrir");
        Button salvarBtn = new Button("Salvar");

        hbox.getChildren().addAll(novoBtn, abrirBtn, salvarBtn);

        Scene scene = new Scene(hbox, 400, 100);
        primaryStage.setTitle("Exercício 3 - Toolbar HBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
