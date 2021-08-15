package fxml;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController {
	
	@FXML
	private TextField emailField;
	
	@FXML
	private TextField senhaField;

	public void entrar() {
		System.out.println(emailField.getText());
		System.out.println(senhaField.getText());
	}
}
