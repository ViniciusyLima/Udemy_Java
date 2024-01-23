package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

// AÇÃO AO CLICAR NO BUTTON, MENSAGEM: 'Click'
public class ViewController {

	@FXML
	private Button btTest;
	
	@FXML
	public void onBtTestAction() {
		Alerts.showAlert("Alert title", null , "Hello" , AlertType.ERROR);
	}
}
