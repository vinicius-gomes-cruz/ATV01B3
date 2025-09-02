import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercicio8 extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10));

        // Campos normais
        grid.add(new Label("Nome:"), 0, 0);
        grid.add(new TextArea(), 1, 0);

        // Observações ocupando duas colunas
        Label obsLabel = new Label("Observações:");
        grid.add(obsLabel, 0, 1);
        TextArea obsArea = new TextArea();
        grid.add(obsArea, 1, 1, 2, 1); // colspan = 2

        // Botão Salvar alinhado à direita
        Button salvarBtn = new Button("Salvar");
        GridPane.setHalignment(salvarBtn, HPos.RIGHT);
        grid.add(salvarBtn, 2, 2);

        Scene scene = new Scene(grid, 400, 250);
        primaryStage.setTitle("Exercício 8 - GridPane Span");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
