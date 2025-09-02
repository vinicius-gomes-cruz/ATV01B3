import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercicio7 extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setHgap(10); // espaçamento horizontal
        grid.setVgap(10); // espaçamento vertical
        grid.setPadding(new Insets(10));

        // Labels e TextFields
        grid.add(new Label("Nome:"), 0, 0);
        grid.add(new TextField(), 1, 0);

        grid.add(new Label("E-mail:"), 0, 1);
        grid.add(new TextField(), 1, 1);

        grid.add(new Label("Telefone:"), 0, 2);
        grid.add(new TextField(), 1, 2);

        grid.add(new Label("Cidade:"), 0, 3);
        grid.add(new TextField(), 1, 3);

        Scene scene = new Scene(grid, 350, 200);
        primaryStage.setTitle("Exercício 7 - GridPane Formulário");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
