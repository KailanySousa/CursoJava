package fxml;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXML extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		String arquivoCSS = getClass().getResource("/fxml/Login.css").toExternalForm();
		
		URL arquivoFXML = getClass().getResource("/fxml/Login.fxml");
		GridPane raiz = FXMLLoader.load(arquivoFXML);
		
		Scene cena = new Scene(raiz, 350, 400);
		cena.getStylesheets().add(arquivoCSS);
		
		primaryStage.setTitle("Tela de Login");
		primaryStage.setResizable(true);
		primaryStage.setScene(cena);
		primaryStage.show();
		
	}

}
