/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class TextAreaPartial extends VBox implements EventHandler<ActionEvent>{
    private final Label nameLabel = new Label("Tekstikenttä");
    private final TextArea nameArea = new TextArea();
    
    public TextAreaPartial () {
        VBox.setMargin(this, new Insets(10,10,10,10));
        nameArea.setPrefSize(200, 200);
        this.getChildren().add(nameLabel);
        this.getChildren().add(nameArea);
        
        
    }

    @Override
    public void handle(ActionEvent t) {
        
    }
}
