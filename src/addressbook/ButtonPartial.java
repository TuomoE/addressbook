/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import java.util.ArrayList;
import javafx.application.Platform;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Ohjelmistokehitys
 */
public class ButtonPartial extends HBox implements EventHandler<ActionEvent> {
    
    
    private final Button closeButton = new Button("Sulje");
    private static final Button saveButton = new Button("Tallenna");
 
    protected static final ArrayList<User> userInfo = new ArrayList();
    private TextAreaPartial users;
    private TextFieldPartial partial;
    
    public ButtonPartial () {
        this.users = users;
        this.partial = partial;
        this.setStyle("-fx-spacing:10;-fx-padding:10");
        this.getChildren().add(closeButton);
        this.getChildren().add(saveButton);
        closeButton.setOnAction(this);
        saveButton.setOnAction(this);
    }
    
    @Override
    public void handle(ActionEvent t) {
        if(t.getSource().equals(closeButton)) {
            Platform.exit();
        }
        if  (t.getSource().equals(saveButton)) {
            if(TextFieldPartial.isEmptyFields()){
                    JOptionPane.showMessageDialog(null, "All fields must have value!");
            }
            else{
                    //Cache object in arraylist
                   userInfo.add(TextFieldPartial.getUserInfo());
                    TextFieldPartial.clearFields();
            }
        }
    }
    public static final void toggleSaveButton(boolean setVisible){
        
        saveButton.setVisible(setVisible);
    }
}