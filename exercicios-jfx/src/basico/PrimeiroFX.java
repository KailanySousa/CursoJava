package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		Button btnA = new Button("A");
		Button btnB = new Button("B");
		Button btnC = new Button("C");
		
		btnA.setOnAction(e -> System.out.println("A"));
		btnB.setOnAction(e -> System.out.println("B"));
		btnC.setOnAction(e -> System.out.println("C"));
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
		box.getChildren().add(btnA);
		box.getChildren().add(btnB);
		box.getChildren().add(btnC);
		
		Scene cena = new Scene(box, 150, 100);
		
		primaryStage.setScene(cena);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
