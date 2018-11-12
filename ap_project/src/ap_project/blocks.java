package ap_project;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class blocks extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Rectangle cir= new Rectangle();
		cir.setFill(Color.RED);
		cir.setHeight(50);
		cir.setWidth(50);
		cir.setLayoutX(0);
		cir.setLayoutY(0);
		
		TranslateTransition transition= new TranslateTransition();
		transition.setDuration(Duration.seconds(5));
		transition.setToX(0);
		transition.setToY(1000);
		transition.setNode(cir);
		transition.play();
		
		Pane root= new Pane();
		root.getChildren().add(cir);
		Scene scene = new Scene(root, 700, 800, Color.BLACK);
		
		primaryStage.setTitle("BLOCK");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	
	 public static void main(String[] args) {
	        launch(args);
	    }
}
