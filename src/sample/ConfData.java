package sample;

import javafx.beans.property.SimpleStringProperty;

public class ConfData {

    public String getConfiguration() {
        return Configuration.get();
    }

    public SimpleStringProperty configurationProperty() {
        return Configuration;
    }

    public void setConfiguration(String configuration) {
        this.Configuration.set(configuration);
    }

    private SimpleStringProperty Configuration;


    public ConfData(String configuration){

       this.Configuration = new SimpleStringProperty(configuration);
    }





}
