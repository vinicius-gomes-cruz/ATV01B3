import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Exercicio10 extends Application {

    @Override
    public void start(Stage primaryStage) {
        AnchorPane anchorPane = new AnchorPane();

        TextArea textArea = new TextArea();
        // Ancorando a TextArea em todas as bordas com 10px de margem
        AnchorPane.setTopAnchor(textArea, 10.0);
        AnchorPane.setBottomAnchor(textArea, 10.0);
        AnchorPane.setLeftAnchor(textArea, 10.0);
        AnchorPane.setRightAnchor(textArea, 10.0);

        anchorPane.getChildren().add(textArea);

        Scene scene = new Scene(anchorPane, 400, 300);
        primaryStage.setTitle("Exercício 10 - AnchorPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
