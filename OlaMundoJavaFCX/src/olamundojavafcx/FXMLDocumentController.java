/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olamundojavafcx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Joao
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button btnClick;
    private Label lblMensagem;
    
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        lblMensagem.setText("Ola Mundo");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
