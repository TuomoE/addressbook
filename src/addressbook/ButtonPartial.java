/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import javafx.application.Platform;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class ButtonPartial extends HBox implements EventHandler<ActionEvent> {
    
    
    private final Button closeButton = new Button("Sulje");
    private final Button saveButton = new Button("Tallenna");
    private final Button printButton = new Button("Tulosta");
    
    
    public ButtonPartial () {
        this.setStyle("-fx-spacing:10;-fx-padding:10");
        this.getChildren().add(closeButton);
        this.getChildren().add(saveButton);
        this.getChildren().add(printButton);
        closeButton.setOnAction(this);
        saveButton.setOnAction(this);
        printButton.setOnAction(this);
    }
    
    public void handle(ActionEvent t) {
        if (t.getSource().equals(printButton)) {
            System.out.println("Ohjelma: " );
        }
        if(t.getSource().equals(closeButton)) {
            Platform.exit();
        }
        if  (t.getSource().equals(saveButton)) {
            System.out.println("********Tallennus****");
        }
    }
}