package br.com.joaov.javafxminhaaplicacao.estudos;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.controlsfx.control.spreadsheet.Grid;

public class ExemploGridPane extends Application {
    @Override
    public void start(Stage palco) throws Exception {
        //Criação dos elementos(rotulos, campos de texto e botão)
        Label rotuloNome = new Label("Nome:");
        Label rotuloEmail = new Label("Email:");

        TextField campoNome = new TextField();
        TextField campoEmail = new TextField();

        Button botaoEnviar = new Button("Enviar");

        //Criacao do GridPane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(8);// Espaçamento horizontal entre celulas
        gridPane.setVgap(8);// Espaçamento vertical entre celulas
        gridPane.setPadding(new Insets(5));//Espaçamento externo

        //Adicao dos elementos ao GridPane
        gridPane.addRow(0,rotuloNome,campoNome);
        gridPane.addRow(1,rotuloEmail,campoEmail);
        gridPane.addRow(2,botaoEnviar);

        //Criacao da cena e exibicao do palco
        Scene cena = new Scene(gridPane,400,200);
        palco.setScene(cena);
        palco.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
