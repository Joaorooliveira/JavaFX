package br.com.joaov.javafxminhaaplicacao.estudos;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;

import static javafx.application.Application.launch;

public class ExemploControleComCSSArquivoSeparado extends Application {
    @Override
    public void start(Stage palco) throws Exception {

        Label label = new Label("Ola, mundo! Sou uma etiqueta (label).");
        label.getStyleClass().add("etiqueta");

        Button botao = new Button("Clique aqui");
        botao.getStyleClass().add("botao");

        TextField campoTexto = new TextField();
        campoTexto.getStyleClass().add("campoTexto");
//        campoTexto.setStyle("-fx-font-family: 'Courier New'; -fx-font-size:
//                16px;");
        VBox layout = new VBox(label, botao, campoTexto);
        layout.setAlignment(Pos.CENTER);


        Scene cena = new Scene(layout, 300, 200);


        URL cssUrl = getClass().getResource("/css/styles.css");

        if (cssUrl != null) {

            cena.getStylesheets().add(cssUrl.toExternalForm());
        } else {
            System.out.println("Erro: Não foi possível encontrar o arquivo CSS!");
        }



        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}