module br.com.joaov.javafxminhaaplicacao {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.desktop;
    requires javafx.media;

    opens br.com.joaov.javafxminhaaplicacao to javafx.fxml;
    exports br.com.joaov.javafxminhaaplicacao;
    exports br.com.joaov.javafxminhaaplicacao.estudos;
    opens br.com.joaov.javafxminhaaplicacao.estudos to javafx.fxml;
}