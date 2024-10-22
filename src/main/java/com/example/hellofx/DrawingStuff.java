package com.example.hellofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DrawingStuff extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.SKYBLUE);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Drawing Stuff");

        Text text = new Text();
        text.setText("JEEEEEEEEEZ \t LOUISE!!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Papyrus", 30));
        text.setFill(Color.GREENYELLOW);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.5);
        line.setRotate(45);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.WHITE);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLACK);
        rectangle.setOpacity(0.5);
        rectangle.setRotate(45);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(200.0, 200.0, 300.0, 300.0, 200.0, 300.0);
        triangle.setFill(Color.YELLOW);

        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);

        Image image = new Image("Pizza.png");
        ImageView imageview = new ImageView(image);
        imageview.setX(350);
        imageview.setY(350);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageview);

        stage.setScene(scene);
        stage.show();

    }
}
