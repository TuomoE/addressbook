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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
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
        
        TabPanePartial tabPane = new TabPanePartial();
        ButtonPartial buttons = new ButtonPartial();
        
        root.setCenter(tabPane);
        root.setBottom(buttons);
        
        BorderPane.setMargin(root.getBottom(), new Insets(10,10,10,10));
        Scene scene = new Scene(root, 600, 400);
        
      
        
     
        
        
        primaryStage.setTitle("Addressbook");
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
