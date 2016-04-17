import javafx.application.Application;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.control.Button;
import java.security.SecureRandom;
import javafx.animation.*;

public class BeanGame extends Application{

	public void start(Stage primaryStage) {

		Line[] line = new Line[8];		
		
		//create a pane
		Pane p = new Pane();
		
		//create the outline of interface
		Line upl1 = new Line(175,25,175,50);
		Line upr1 = new Line(225,25,225,50);
		Line ll = new Line(175,50,105,210);
		Line rl = new Line(225,50,305,210);
		Line dl = new Line(105,210,105,240);
		Line dr = new Line(305,210,305,240);
		Line d = new Line(105,240,305,240);
		p.getChildren().add(upl1);
		p.getChildren().add(upr1);
		p.getChildren().add(ll);
		p.getChildren().add(rl);
		p.getChildren().add(dl);
		p.getChildren().add(dr);
		p.getChildren().add(d);
		for(int i =1;i<=7;i++){
			
			line [i] = new Line(105+25*i,210,105+25*i,240);			
			p.getChildren().add(line[i]);
		}

		//create the button of the bean game
		Circle cir = new Circle(4,Color.GREEN);
		cir.relocate(200,50);
		p.getChildren().add(cir);
		Circle[] cir1 = new Circle[2];
		for(int i=0;i<2;i++){
			cir1[i] = new Circle(4,Color.GREEN);
			cir1[i].relocate(188.5+25*i,75);
			p.getChildren().add(cir1[i]);
		}
		Circle[] cir2 = new Circle[3];
		for(int i=0;i<3;i++){
			cir2[i] = new Circle(4,Color.GREEN);
			cir2[i].relocate(177+25*i,100);
			p.getChildren().add(cir2[i]);
		}
		Circle[] cir3 = new Circle[4];
		for(int i=0;i<4;i++){
			cir3[i] = new Circle(4,Color.GREEN);
			cir3[i].relocate(165.5+25*i,125);
			p.getChildren().add(cir3[i]);
		}
		Circle[] cir4= new Circle[5];
		for(int i=0;i<5;i++){
			cir4[i] = new Circle(4,Color.GREEN);
			cir4[i].relocate(154+25*i,150);
			p.getChildren().add(cir4[i]);
		}
		Circle[] cir5 = new Circle[6];
		for(int i=0;i<6;i++){
			cir5[i] = new Circle(4,Color.GREEN);
			cir5[i].relocate(142.5+25*i,175);
			p.getChildren().add(cir5[i]);
		}
		Circle[] cir6 = new Circle[7];
		for(int i=0;i<7;i++){
			cir6[i] = new Circle(4,Color.GREEN);
			cir6[i].relocate(131+25*i,200);
			p.getChildren().add(cir6[i]);
		}
		
		Scene scene = new Scene(p, 400, 400);
		primaryStage.setTitle("Bean Machine");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false); 
		primaryStage.show();
	}
	public static void main (String[] args){
		launch(args);
	}
	
}
