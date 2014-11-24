/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;

/**
 *
 * @author KONE
 */
public class BrowseAddressPartial extends HBox {
    
    private final ListView<String> list = new ListView<>();
    private ObservableList<String> address;
    private TextArea users = new TextArea();
    
    public void BrowseAddressPartial () {address = FXCollections.observableArrayList();
        
        address = FXCollections.observableArrayList();
        if(ButtonPartial.userInfo.size() == 0){
            address.add("No Data Available");
        }
        else{
            for(User temp:ButtonPartial.userInfo){
                address.add(temp.getFirstName() + " " + temp.getLastName());
            }
        } 
        list.setItems(address);
        list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                // Your action here
                if(newValue != null)
                {
                    String[] temp = newValue.split(" ");
                    for(User person:ButtonPartial.userInfo){
                        if(person.getFirstName().equals(temp[0]) && person.getLastName().equals(temp[1])){
                            users.setText("Etunimi:" + person.getFirstName() + "\n" +
                                          "Sukunimi:" + person.getLastName() + "\n" +   
                                          "Osoite:" + person.getAddress() + "\n" +
                                          "Puhelin:" + person.getPhone() + "\n" + 
                                          "Sähköposti:" + person.getEmail());
                        }
                    }
                }
            }
        });
        this.setStyle("-fx-padding:10px");
        users.setEditable(false);
        HBox.setMargin(users, new Insets(0,0,0,10));
        this.getChildren().add(list);
        this.getChildren().add(users);
    }
    
    public void updateList(){
        address.clear();
        for(User temp:ButtonPartial.userInfo){
                address.add(temp.getFirstName() + " " + temp.getLastName());
        }
    }
}
