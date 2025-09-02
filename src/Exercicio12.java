import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercicio12 extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox(10);

        Label aviso = new Label("Apenas números");
        TextField textField = new TextField();

        // Listener para aceitar somente dígitos
        textField.textProperty().addListener((obs, oldText, newText) -> {
            if (!newText.matches("\\d*")) {
                textField.setText(newText.replaceAll("[^\\d]", ""));
            }
        });

        vbox.getChildren().addAll(aviso, textField);

        Scene scene = new Scene(vbox, 250, 100);
        primaryStage.setTitle("Exercício 12 - Validação de Números");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
