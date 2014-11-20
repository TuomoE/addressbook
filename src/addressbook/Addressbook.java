/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Ohjelmistokehitys
 */
public class Addressbook extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // root on päälayout
        BorderPane root = new BorderPane();
        
        root.setStyle("-fx-background-color: #339698");
           
        // lisätään komponenttien layoutit roottiin
 //       root.getChildren().add(new TextFieldPartial());
 //       root.getChildren().add(new ButtonPartial());
        VBox vbox = new VBox();
        TextAreaPartial textarea = new TextAreaPartial();
        TextFieldPartial textfield = new TextFieldPartial();
        
     //   root.setLeft(new TextFieldPartial());
        ButtonPartial buttons = new ButtonPartial();
        buttons.setAlignment(Pos.BOTTOM_CENTER);
        vbox.getChildren().add(textfield);
  //      vbox.getChildren().add(buttons);
        root.setBottom(buttons);
        vbox.setSpacing(20);
        root.setLeft(vbox);
        
        root.setRight(textarea);
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Idea");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
