/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

/**
 *
 * @author KONE
 */
public class TabPanePartial extends TabPane implements ChangeListener<Tab> {
 
    private Tab tab1 = new Tab();
    private Tab tab2 = new Tab();
    
    BrowseAddressPartial browseaddress = new BrowseAddressPartial();

    public TabPanePartial () {
        this.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
            this.setStyle("-fx-padding:10px");
            
            tab1.setText("Uusi osoite");
            tab1.setContent(new TextFieldPartial());
            tab2.setText("Selaa osoitteita");
            tab2.setContent(browseaddress);
            this.getTabs().add(tab1);
            this.getTabs().add(tab2);
            
            this.getSelectionModel().selectedItemProperty().addListener(this);
    }
    
    @Override
    public void changed(ObservableValue<? extends Tab> ov, Tab t, Tab t1) {
        if(this.getSelectionModel().getSelectedItem().equals(tab2)){
        ButtonPartial.toggleSaveButton(false);
        browseaddress.BrowseAddressPartial();
        }
        else{
            ButtonPartial.toggleSaveButton(true);
        }
    }
}

