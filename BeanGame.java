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
		
		//add the button that invoke the bean game
		Button bt = new Button("Press");
		bt.setLayoutX(155);
		bt.setLayoutY(280);
		bt.setPrefSize(100,20);
		p.getChildren().add(bt);
		
		//set the action that the bean game can work
		bt.setOnAction(e ->{
			
				Circle ball = new Circle(3);
				Color  co = new Color(Math.random(),Math.random(),Math.random(),0.6);
				ball.setFill(co);
				
				p.getChildren().add(ball);
				ball.relocate(200,45);
				tl(ball);
				
				
		});
	}	
	
	//set the method that the way which balls fall
	void tl(Circle ball){
		Timeline animation = new Timeline(
		new KeyFrame(Duration.millis(10),e->move(ball)));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
	}
	void move(Circle ball){
		SecureRandom srand = new SecureRandom();
		int x, y, P;
		x = (int)ball.getLayoutX() - (int)ball.getRadius();
		y = (int)ball.getLayoutY() - (int)ball.getRadius() + 1; 
		if (y <=230)
		{
			if (y == 50 || y == 75 || y == 100 || y == 125 || y == 150 || y == 175 || y ==200)
			{
				P = srand.nextInt(2);
				if (P == 0)
				{
					x-=11.5;
					ball.relocate(x, y);
				}
				else
				{
					x+=11.5;
					ball.relocate(x, y);
				}
			}
			else
				ball.relocate(x, y);
		}
	}
	public static void main (String[] args){
		launch(args);
	}
	
}
