package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

// ABRIR UMA JANELA DE ALERTA COM AÇÃO BUTTON
public class ViewController {

	@FXML
	private Button btTest;
	
	@FXML
	public void onBtTestAction() {
		Alerts.showAlert("Alert title", null , "Hello" , AlertType.ERROR);
	}
}
