module br.com.joaov.javafxminhaaplicacao {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.desktop;

    opens br.com.joaov.javafxminhaaplicacao to javafx.fxml;
    exports br.com.joaov.javafxminhaaplicacao;
}