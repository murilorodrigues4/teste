package com.mycompany.aquecimento;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class SecondaryController1 {

    @FXML
    private TextArea txtReservas;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void atualizarLista() {
        String texto = "";

        for (Reserva r : Repositorio.reservas) {
            texto += r.toString() + "\n";
        }

        txtReservas.setText(texto);
    }

    @FXML
    private void initialize() {
        atualizarLista();
    }
}
