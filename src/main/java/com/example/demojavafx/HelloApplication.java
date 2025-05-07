package com.example.demojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //Add java vm option --enable-native-access=javafx.graphics

//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");


        Canvas canvas = new Canvas( 400, 200 );
        Group root = new Group();
        root.getChildren().add( canvas );
        Scene theScene = new Scene( root );
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill( Color.RED );
        gc.setStroke( Color.BLACK );
        gc.setLineWidth(2);
        Font theFont = Font.font( "Times New Roman", FontWeight.BOLD, 48 );
        gc.setFont( theFont );
        gc.fillText( "Hello, World!", 60, 50 );
        gc.strokeText( "Hello, World!", 60, 50 );

        Image player = new Image( System.getProperty("user.dir") + "\\earth.png" );
        gc.drawImage( player, 48, 48 );

        stage.setScene(theScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}