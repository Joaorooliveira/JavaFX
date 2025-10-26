package br.com.joaov.javafxminhaaplicacao.estudos;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExemploCssInicial extends Application {
    @Override
    public void start(Stage palco) throws Exception {

        Label label = new Label("Ola, mundo! Sou uma etiqueta (label).");
        //label.setStyle("-fx-font-family: 'System'; -fx-font-size: 14px; -fx-font-style:  italic;-fx-font-weight: bold;");
        label.setStyle(" -fx-background-color: blue; -fx-text-fill: pink");
        Button botao = new Button("Clique aqui");
        botao.setStyle("-fx-font-family: 'Verdana'; -fx-font-size: 12px;");

        TextField campoTexto = new TextField();
//        campoTexto.setStyle("-fx-font-family: 'Courier New'; -fx-font-size:
//                16px;");
        VBox layout = new VBox(label,botao, campoTexto);
        layout.setAlignment(Pos.CENTER);


        Scene cena = new Scene(layout,300,200);

        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
