package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

	private int contador = 0;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Label lblTitulo = new Label("Contador");
		lblTitulo.getStyleClass().add("titulo");
		
		Label lblNumero = new Label("0");
		lblNumero.getStyleClass().add("numero");
		
		Button btnDecremento = new Button("-");
		Button btnIncremento = new Button("+");

		btnDecremento.setOnAction(e -> {
			this.contador--;
			lblNumero.setText(Integer.toString(this.contador));
		});
		
		btnIncremento.setOnAction(e -> {
			this.contador++;
			lblNumero.setText(Integer.toString(this.contador));
		});

		VBox boxPrincipal = new VBox();
		boxPrincipal.setSpacing(10);
		boxPrincipal.setAlignment(Pos.CENTER);
		boxPrincipal.getChildren().add(lblTitulo);
		boxPrincipal.getChildren().add(lblNumero);

		HBox boxSecundario = new HBox();
		boxPrincipal.getStyleClass().add("conteudo");
		boxSecundario.setSpacing(10);
		boxSecundario.setAlignment(Pos.CENTER);
		boxSecundario.getChildren().add(btnDecremento);
		boxSecundario.getChildren().add(btnIncremento);

		boxPrincipal.getChildren().add(boxSecundario);

		String pathCSS = getClass().getResource("/basico/Contador.css").toExternalForm();
		Scene cena = new Scene(boxPrincipal, 400, 400);
		cena.getStylesheets().add(pathCSS);
		cena.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
		
		primaryStage.setScene(cena);
		primaryStage.show();

	}

}
