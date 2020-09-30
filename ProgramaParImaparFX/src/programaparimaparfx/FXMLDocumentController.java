/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaparimaparfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Mateus
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button btnVerificar;

    @FXML
    private Label label;

    @FXML
    private TextField txtValor;

    @FXML
    private Label lblResultado;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        int v = Integer.parseInt(txtValor.getText());
        
        if (v%2==0){
            lblResultado.setText("O número " + v + " é PAR.");
            v++;
        } else{
            lblResultado.setText("O número " + v + " é IMPAR");
            v++;
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
}
