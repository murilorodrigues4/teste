module com.mycompany.aquecimento {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.aquecimento to javafx.fxml;
    exports com.mycompany.aquecimento;
}
