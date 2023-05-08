module com.example.bootcamp {
    requires javafx.controls;
    requires javafx.fxml;


    opens Bootcamp to javafx.fxml;
    exports Objetos;
    opens Objetos to javafx.fxml;
}