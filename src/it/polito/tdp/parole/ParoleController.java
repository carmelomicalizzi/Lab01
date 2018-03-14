package it.polito.tdp.parole;

/**
 * Sample Skeleton for 'Parole.fxml' Controller Class
 */


import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ParoleController {
	
	Parole elenco ;
	Parole perLista = new Parole();


    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtParola"
    private TextField txtParola; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader
    
    @FXML // fx:id="timeResult"
    private TextArea timeResult; // Value injected by FXMLLoader
    
    @FXML
    private Button btnReset;

    @FXML // fx:id="btnInserisci"
    private Button btnInserisci; // Value injected by FXMLLoader

    @FXML
    void doInsert(ActionEvent event) {
    	
    	perLista.addParola(txtParola.getText());
    	ArrayList<String> elenco = new ArrayList<String>(perLista.getElenco());
    	String s = "";
    	String t = "";
		for(String str : elenco) {
			s += str+"\n";
			t += System.nanoTime()+"\n";}
		
    	txtResult.setText(s);
    	timeResult.setText(t);

    }
    
    @FXML
    void doReset(ActionEvent event) {
    	
    	perLista.reset();
    	txtResult.setText("");
    	timeResult.setText("");

    }
    
    @FXML
    void doCancella(ActionEvent event) {
    	perLista.cancellaParola(txtParola.getText());
    	ArrayList<String> elenco = new ArrayList<String>(perLista.getElenco());
    	String s = "";
    	String t = "";
		for(String str : elenco) {
			s += str+"\n";
			t += System.nanoTime()+"\n";}

		
    	txtResult.setText(s);
    	timeResult.setText(t);

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Parole.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Parole.fxml'.";

        elenco = new Parole() ;
        
    }
}
