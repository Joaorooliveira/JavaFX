package br.com.joaov.javafxminhaaplicacao.estudos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.web.WebView;

public class ExemploVideoStreaming extends Application {

    @Override
    public void start(Stage palco) throws Exception {
        WebView webView = new WebView();

        String urlVideo;
        urlVideo = "https://www.youtube.com/watch?v=bpOSxM0rNPM";

        webView.getEngine().load(urlVideo);
        Scene cena = new Scene(webView, 800, 600);

        palco.setTitle("Exemplo Video");
        palco.setScene(cena);
        palco.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
