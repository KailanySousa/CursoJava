package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {
	
	private Stage janela;
	private Scene passo1;
	private Scene passo2;
	private Scene passo3;

	public static void main(String[] args) {
		launch(args);
	}
	
	private void criarPasso1() {
		Button btnProxPasso = new Button("Ir p/ passo 2 >>");
		btnProxPasso.setOnAction(e -> {
			janela.setTitle("Wizard:: Passo 02");
			janela.setScene(passo2);
		});
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(btnProxPasso);
		
		passo1 = new Scene(box, 400, 400);
		
	}
	
	private void criarPasso2() {
		Button btnAntPasso = new Button("<< Voltar p/ passo 1");
		btnAntPasso.setOnAction(e -> {
			janela.setTitle("Wizard:: Passo 01");
			janela.setScene(passo1);
		});
		
		Button btnProxPasso = new Button("Ir p/ passo 3 >>");
		btnProxPasso.setOnAction(e -> {
			janela.setTitle("Wizard:: Passo 03");
			janela.setScene(passo3);
		});
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(btnAntPasso);
		box.getChildren().add(btnProxPasso);
		
		passo2 = new Scene(box, 400, 400);
		
	}
	
	private void criarPasso3() {
		Button btnAntPasso = new Button("<< Voltar p/ passo 2");
		btnAntPasso.setOnAction(e -> {
			janela.setScene(passo2);
			janela.setTitle("Wizard:: Passo 02");
		});
		
		Button btnProxPasso = new Button("Finalizar");
		btnProxPasso.setOnAction(e -> {
			System.exit(0);
		});
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(btnAntPasso);
		box.getChildren().add(btnProxPasso);
		
		passo3 = new Scene(box, 400, 400);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		janela = primaryStage;
		
		this.criarPasso1();
		this.criarPasso2();
		this.criarPasso3();
		
		janela.setScene(passo1);
		janela.setTitle("Wizard:: Passo 01");
		janela.show();
		
	}

}
