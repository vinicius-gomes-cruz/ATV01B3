import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercicio5 extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(10));

        // Top: toolbar
        VBox topBox = new VBox(5);
        Button novoBtn = new Button("Novo");
        Button abrirBtn = new Button("Abrir");
        Button salvarBtn = new Button("Salvar");
        topBox.getChildren().addAll(novoBtn, abrirBtn, salvarBtn);
        borderPane.setTop(topBox);

        // Left: menu vertical
        VBox leftMenu = new VBox(10);
        leftMenu.getChildren().addAll(
                new Button("Menu 1"),
                new Button("Menu 2"),
                new Button("Menu 3"),
                new Button("Menu 4")
        );
        borderPane.setLeft(leftMenu);

        // Center: área de trabalho
        Label areaTrabalho = new Label("Área de trabalho");
        borderPane.setCenter(areaTrabalho);

        // Bottom: barra de status
        Label statusBar = new Label("Status: Pronto");
        borderPane.setBottom(statusBar);

        Scene scene = new Scene(borderPane, 500, 300);
        primaryStage.setTitle("Exercício 5 - BorderPane Esqueleto");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
