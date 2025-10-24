package br.com.joaov.javafxminhaaplicacao;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class ExemplosLayouts extends Application {

    @Override
    public void start(Stage palco) {
        Button botao1 = new Button("Botao 1");
        Button botao2 = new Button("Botao 2");
        Button botao3 = new Button("Botao 3");
        Button botao4 = new Button("Botao 4");

        HBox hBox = new HBox(botao1,botao2);
        hBox.setAlignment(Pos.CENTER_RIGHT);

        VBox vBox = new VBox(botao3,botao4);
        vBox.setAlignment(Pos.CENTER_RIGHT);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(hBox);
        borderPane.setBottom(vBox);

        Scene scene = new Scene(borderPane,300,300);
        palco.setScene(scene);
        palco.show();

    }

    public static void main(String[] args) {

        launch(args);
    }
}
