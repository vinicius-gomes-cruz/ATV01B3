import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercicio13 extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox(10);

        Label contadorLabel = new Label("0/140");
        TextArea textArea = new TextArea();

        textArea.textProperty().addListener((obs, oldText, newText) -> {
            if (newText.length() > 140) {
                textArea.setText(oldText); // impede excesso
            }
            contadorLabel.setText(textArea.getText().length() + "/140");
        });

        vbox.getChildren().addAll(textArea, contadorLabel);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Exercício 13 - Limite TextArea");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
