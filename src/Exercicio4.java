import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercicio4 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Toolbar HBox
        HBox toolbar = new HBox(10);
        toolbar.setAlignment(Pos.CENTER_LEFT);
        toolbar.setPadding(new Insets(5));
        Button novoBtn = new Button("Novo");
        Button abrirBtn = new Button("Abrir");
        Button salvarBtn = new Button("Salvar");
        toolbar.getChildren().addAll(novoBtn, abrirBtn, salvarBtn);

        // Conteúdo textual
        Label conteudo = new Label("Aqui vai o conteúdo principal da aplicação.");

        // VBox com toolbar e conteúdo
        VBox vbox = new VBox(15);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(toolbar, conteudo);

        Scene scene = new Scene(vbox, 400, 200);
        primaryStage.setTitle("Exercício 4 - VBox + HBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
