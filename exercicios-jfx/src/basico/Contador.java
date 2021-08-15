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
		Label lblNumero = new Label("0");
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
		boxSecundario.setSpacing(10);
		boxSecundario.setAlignment(Pos.CENTER);
		boxSecundario.getChildren().add(btnDecremento);
		boxSecundario.getChildren().add(btnIncremento);

		boxPrincipal.getChildren().add(boxSecundario);

		Scene cena = new Scene(boxPrincipal, 400, 400);

		primaryStage.setScene(cena);
		primaryStage.show();

	}

}
