package br.com.joaov.javafxminhaaplicacao.estudos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExemploImagens extends Application {
    @Override
    public void start(Stage palco) throws Exception {
        //Caminho absoluto para a imagem no windows
        String caminhoImagem = "file:///home/grizzly/Downloads/perfil.jpg";

        Image imagem = new Image(caminhoImagem);
        ImageView imageView = new ImageView(imagem);

        //Configuracao para ajustar o tamanho da imagem
        imageView.setFitWidth(613);//Largura desejada em pixels
        imageView.setFitHeight(640);// Altura desejada em pixels
        imageView.setPreserveRatio(true);//Mantem a proporcao original da imagem

        VBox layout = new VBox(imageView);
        Scene cena = new Scene(layout,700,700);

        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
