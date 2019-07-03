package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

/**
 * Destroys blocks without any damage to itself
 * @author Sony
 */
public class destroybricks extends gameplay {
	ArrayList<ImageView> des;
	/**
	 * @param root
	 * @throws FileNotFoundException If image is not found
	 */
	public destroybricks(Pane root) throws FileNotFoundException {
		des= new ArrayList<ImageView>();
		Random rand= new Random();
		int y= rand.nextInt(2);
		if(y==0) {
			
		}
		else {
		Image image = new Image(new FileInputStream("C:\\des1.png"));
		ImageView iv = new ImageView();
	    iv.setImage(image);
	    iv.setFitHeight(30);
	    iv.setFitWidth(30);
	    int x=rand.nextInt(350);
		int a= rand.nextInt(350);
		x = x-a;
	    iv.setTranslateX(x);
	    iv.setTranslateY(-700);
	    TranslateTransition transition= new TranslateTransition();
		transition.setDuration(Duration.seconds(6.7));
//		transition.setToX(0);
		transition.setToY(550);
		transition.setNode(iv);
		transition.play();
	    root.getChildren().addAll(iv);
	    des.add(iv);
		}
	}
}
