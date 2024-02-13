package org.example.demooop2_shapes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import shapes.*;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        MyCircle circle1 = new MyCircle(new MyPoint(300,300), 100);
        MyCircle circle2 = new MyCircle(new MyPoint(50,200), 160);
        MyRectangle myR = new MyRectangle(new MyPoint(400,600), 150, 60);
        MyRectangle myR1 = new MyRectangle(new MyPoint(100,600), 250, 160);

        SceneOfShapes myScene = new SceneOfShapes();

        myScene.addShape(circle2);
        myScene.addShape(myR);
        myScene.addShape(circle1);
        myScene.addShape(myR1);

        drawShapeUsingJavaFX(myScene, stage);


    }

    private void drawShapeUsingJavaFX(SceneOfShapes sceneOfShapes, Stage stage) {
        Group group = new Group();
        // aici voi desena pe ecranul alb cele n forme care imi vin pe sceneOfShapes

        MyShape[] myShapes = sceneOfShapes.getShapes(); // generice, generalizari

        for(int i = 0;i<myShapes.length;i++) {

            if(myShapes[i] instanceof MyCircle ) { // gasesc ce am in el CONCRET, SPECIALIZAT

                //circle
                Circle circle = new Circle();
                circle.setCenterX(((MyCircle) myShapes[i]).getCenter().getX());
                circle.setCenterY(((MyCircle) myShapes[i]).getCenter().getY());
                circle.setRadius(((MyCircle) myShapes[i]).getRadius());

                group.getChildren().add(circle); // asta de pe net
            }
            else
            if(myShapes[i] instanceof MyRectangle ) { //specializare
                //rectangle
                Rectangle rectangle = new Rectangle();
                rectangle.setX(((MyRectangle) myShapes[i]).getStart().getX());
                rectangle.setY(((MyRectangle) myShapes[i]).getStart().getY());
                rectangle.setWidth(((MyRectangle) myShapes[i]).getWidth());
                rectangle.setHeight(((MyRectangle) myShapes[i]).getHeight());

                group.getChildren().add(rectangle); // asta de pe net
            }
            else {
                int c = i+1;
                System.out.println("nu stiu sa desenez ce a venit pe pozitia " + c);
            }

        }

        // set the scene, as found on internet for java fx
        Scene scene = new Scene(group, 1000, 1000);
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        launch();
    }
}