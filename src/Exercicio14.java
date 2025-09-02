import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercicio14 extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox(10);
        HBox hbox = new HBox(10);

        Label l1 = new Label("Item 1");
        Label l2 = new Label("Item 2");
        Label l3 = new Label("Item 3");

        vbox.getChildren().addAll(l1, l2, l3);
        hbox.getChildren().addAll(l1, l2, l3);

        Scene scene = new Scene(vbox, 500, 200);

        // Listener para alternar entre VBox e HBox
        scene.widthProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal.doubleValue() < 600) {
                scene.setRoot(vbox);
            } else {
                scene.setRoot(hbox);
            }
        });

        primaryStage.setTitle("Exercício 14 - Layout Responsivo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
