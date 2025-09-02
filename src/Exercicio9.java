import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Exercicio9 extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane stack = new StackPane();

        // Imagem de fundo
        ImageView background = new ImageView(new Image("https://via.placeholder.com/400x200"));
        background.setFitWidth(400);
        background.setFitHeight(200);
        background.setPreserveRatio(false);

        // Retângulo semitransparente
        Rectangle overlay = new Rectangle(400, 200, Color.rgb(0, 0, 0, 0.5));

        // Label central
        Label label = new Label("Título Central");
        label.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        stack.getChildren().addAll(background, overlay, label);

        Scene scene = new Scene(stack, 400, 200);
        primaryStage.setTitle("Exercício 9 - StackPane Sobreposição");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
