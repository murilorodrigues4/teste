package com.mycompany.aquecimento;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class PrimaryController {
     @FXML private ImageView logo;

    @FXML
    private void nova() throws IOException {
        App.setRoot("secondary");
    }
        @FXML
    private void lista() throws IOException {
        App.setRoot("secondary_1");
    }
}
