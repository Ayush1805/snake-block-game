package ap_project;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public class snake extends ap_project {

    private Pane root = new Pane();

    private double t = 0;

    private Sprite player1 = new Sprite(350, 500, 10, 40, "player", Color.CYAN);
    private Sprite player2 = new Sprite(350, 480, 10, 40, "player", Color.CYAN);
    private Sprite player3 = new Sprite(350, 460, 10, 40, "player", Color.CYAN);
    private Sprite player4 = new Sprite(350, 440, 10, 40, "player", Color.CYAN);
    
//    private Parent createContent() {
//        root.setPrefSize(600, 800);
//
//        root.getChildren().add(player1);
//        root.getChildren().add(player2);
//        root.getChildren().add(player3);
//        root.getChildren().add(player4);
//      
//        return root;
//    }

    @Override
    public void start(Stage stage) throws Exception {
    	root.setPrefSize(600, 800);

        root.getChildren().add(player1);
        root.getChildren().add(player2);
        root.getChildren().add(player3);
        root.getChildren().add(player4);
        Button btn1= new Button();
		btn1.setText("BACK");
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("START NEW GAME");
				//stage.setScene(scene);
			}
		});
		String style = "-fx-background-color: rgba(305, 300, 305, 0.2);";
		root.setStyle(style);
		
        Scene scene2 = new Scene(root,700,800,Color.BLACK);
        scene2.setFill(Color.BLACK);
        scene2.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case A:
                	player4.moveLeft();
                	player3.moveLeft();
                    player2.moveLeft();
                    player1.moveLeft();
                    break;
                case D:
                	player4.moveRight();
                	player3.moveRight();
                    player2.moveRight();
                    player1.moveRight();
                    break;
                case SPACE:
                    //shoot(player);
                    break;
            }
        });
        stage.setTitle("GAME");
        stage.setScene(scene2);
        stage.show();
    }

    private static class Sprite extends Circle {
        boolean dead = false;
        final String type;

        Sprite(int x, int y, int w, int h, String type, Color color) {
            super(w, color);

            this.type = type;
            setTranslateX(x);
            setTranslateY(y);
        }

        void moveLeft() {
            setTranslateX(getTranslateX() - 5);
        }

        void moveRight() {
            setTranslateX(getTranslateX() + 5);
        }

        void moveUp() {
            setTranslateY(getTranslateY() - 5);
        }

        void moveDown() {
            setTranslateY(getTranslateY() + 5);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
