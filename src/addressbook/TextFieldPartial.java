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
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class TextFieldPartial extends VBox {
    
    
    private final static Label fNameLabel = new Label("Etunimi");
    private final static TextField firstNameField = new TextField();
    
    private final static Label lNameLabel = new Label("Sukunimi");
    private final static TextField lastNameField = new TextField();

    private final static Label addressLabel = new Label("Osoite");
    private final static TextField addressField = new TextField();

    private final static Label phoneLabel = new Label("Puhelin");
    private final static TextField phoneField = new TextField();
    
    private final static Label emailLabel = new Label("Sähköposti");
    private final static TextField emailField = new TextField();
    
 
    public TextFieldPartial () {
        this.setSpacing(5.0f);
 //       VBox.setMargin(this, new Insets(10,10,10,10));
        this.getChildren().add(fNameLabel);
        this.getChildren().add(firstNameField);
        this.getChildren().add(lNameLabel);
        this.getChildren().add(lastNameField);
        this.getChildren().add(addressLabel);
        this.getChildren().add(addressField);
        this.getChildren().add(phoneLabel);
        this.getChildren().add(phoneField);
        this.getChildren().add(emailLabel);
        this.getChildren().add(emailField);
    }
    
    public static User getUserInfo () {
        User user = new User();
        user.setFirstName(firstNameField.getText());
        user.setLastName(lastNameField.getText());
        user.setAddress(addressField.getText());
        user.setPhone(phoneField.getText());
        user.setEmail(emailField.getText());
        return user;
    } 
    
    public static void clearFields () {
        firstNameField.clear();
        lastNameField.clear();
        addressField.clear();
        phoneField.clear();
        emailField.clear();
    }
    public static final boolean isEmptyFields(){
            
            if(firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() ||
               addressField.getText().isEmpty() || phoneField.getText().isEmpty() || emailField.getText().isEmpty()){
                return true;
            }
            return false;
        }
 
}
