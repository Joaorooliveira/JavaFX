package br.com.joaov.javafxminhaaplicacao.estudos;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class ExemploVideo extends Application {
    @Override
    public void start(Stage palcoPrincipal) throws Exception {
        String urlDoVideo = "file:///home/grizzly/Downloads/Desmistificando_I_O_em_Java.mp4";
        Media media = new Media(urlDoVideo);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        HBox hBox = new HBox();
        hBox.getChildren().add(mediaView);

        Scene cena = new Scene(hBox,1000,700);

        palcoPrincipal.setTitle("Exemplo Video");
        palcoPrincipal.setScene(cena);
        palcoPrincipal.show();

        mediaPlayer.play();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
