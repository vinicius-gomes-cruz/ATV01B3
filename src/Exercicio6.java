import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercicio6 extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(10));

        // Left: menu vertical com botões que alteram o Center
        VBox leftMenu = new VBox(10);
        Button btn1 = new Button("Conteúdo 1");
        Button btn2 = new Button("Conteúdo 2");
        Button btn3 = new Button("Conteúdo 3");
        leftMenu.getChildren().addAll(btn1, btn2, btn3);
        borderPane.setLeft(leftMenu);

        // Center inicial
        Label centerLabel = new Label("Área de trabalho inicial");
        borderPane.setCenter(centerLabel);

        // Eventos dos botões
        btn1.setOnAction(e -> borderPane.setCenter(new Label("Conteúdo 1 exibido")));
        btn2.setOnAction(e -> borderPane.setCenter(new Label("Conteúdo 2 exibido")));
        btn3.setOnAction(e -> borderPane.setCenter(new Label("Conteúdo 3 exibido")));

        Scene scene = new Scene(borderPane, 500, 300);
        primaryStage.setTitle("Exercício 6 - BorderPane Dinâmico");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
