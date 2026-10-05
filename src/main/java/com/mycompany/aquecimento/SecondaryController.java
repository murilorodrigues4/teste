package com.mycompany.aquecimento;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
      @FXML private ChoiceBox<String> choice;
      @FXML private CheckBox certo;
      @FXML private Label primeiro;
      @FXML private TextField nome;
      @FXML private TextField destino;
      
       @FXML private void confirmaralgo() {
           
}
        @FXML  private void cadastrar() throws IOException {
        if(nome.getText().isEmpty() || destino.getText().isEmpty() || choice.getValue() == null){
               Alert alerta2 = new Alert(Alert.AlertType.ERROR);
        alerta2.setTitle("ERRO");
        alerta2.setHeaderText("alguma infomação não está sendo irfomada");
        alerta2.setContentText("altere agora!!");
        alerta2.showAndWait();
        }else{
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Cadastro");
        alerta.setHeaderText(null);
        alerta.setContentText("deu certo");
        alerta.showAndWait();
        
         Reserva reserva = new Reserva(
                nome.getText(),
                destino.getText(),
                choice.getValue(),
                certo.isSelected()
        );
        Repositorio.reservas.add(reserva);
        
        }

    }
    
    @FXML
    private void initialize() {
        choice.getItems().addAll("Avião", "Ônibus", "Carro");
        
    }
    


}