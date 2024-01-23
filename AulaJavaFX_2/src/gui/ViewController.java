package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

// AÇÃO AO CLICAR NO BUTTON, MENSAGEM: 'Click'
public class ViewController {

	@FXML
	private Button btTest;
	
	@FXML
	public void onBtTestAction() {
		System.out.println("Click");
	}
}
