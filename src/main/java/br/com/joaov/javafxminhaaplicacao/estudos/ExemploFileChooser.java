package br.com.joaov.javafxminhaaplicacao.estudos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class ExemploFileChooser extends Application {
    @Override
    public void start(Stage palco) {
        FileChooser seletorDeArquivos = new FileChooser();
        seletorDeArquivos.setTitle("Escolha um arquivo");

        Button botaoAbrir =  new Button("Abrir arquivo");
        botaoAbrir.setOnAction(e -> {
            File arquivoSelecionado = seletorDeArquivos.showOpenDialog(palco);
            if (arquivoSelecionado != null) {
                exibirImagem(arquivoSelecionado,palco);

            }
        });

        VBox layout = new VBox(botaoAbrir);
        Scene cena = new Scene(layout,800,600);
        palco.setTitle("Testando FileChooser");
        palco.setScene(cena);
        palco.show();
    }

    private void exibirImagem(File arquivoSelecionado, Stage palco)  {
        Image imagem = new Image(arquivoSelecionado.toURI().toString());
        ImageView imageView = new ImageView(imagem);

        VBox layout;

        //A linha abaixo obtem o layout atual
        layout = (VBox) palco.getScene().getRoot();

        //A linha abaixo adiciona a imagem ao layout
        layout.getChildren().add(imageView);

        //Ajustar o tamanho da imagem
        imageView.setFitWidth(500);
        imageView.setFitHeight(300);

        palco.setTitle("Seletor de Arquivo");
    }
    public static void main(String[] args) {
        launch(args);
    }
}
