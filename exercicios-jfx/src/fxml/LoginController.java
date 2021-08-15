package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;

public class LoginController {
	
	@FXML
	private TextField emailField;
	
	@FXML
	private TextField senhaField;

	public void entrar() {
		
		boolean emailValidado = emailField.getText().equals("kailanysousag@gmail.com");
		boolean senhaValida = senhaField.getText().equals("142536");
		
		if(emailValidado && senhaValida) {
			Notifications.create().title("Login FXML").position(Pos.TOP_RIGHT).text("Login efetuado com sucesso").showInformation();
		} else {
			Notifications.create().title("Login FXML").position(Pos.TOP_RIGHT).text("Usuário e senha inválidos").showError();
		}
	}
}
