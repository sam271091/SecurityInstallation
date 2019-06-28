import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import sample.ConfData;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private RadioButton InstallKey;

    @FXML
    private ToggleGroup Radio;

    @FXML
    private RadioButton SetNewKey;

    @FXML
    private TableView<ConfData> ConfTable;

    @FXML
    private TableColumn<ConfData,String> Configuration;


    @FXML
    private TabPane TabPane;

    @FXML
    private Tab Tab1;

    @FXML
    private Tab Tab2;



    //private ObservableList<ConfData>  ConfDataTable = FXCollections.observableArrayList();


    public ObservableList<ConfData> getConfDataTable() {

        ObservableList<ConfData>  ConfDataTable = FXCollections.observableArrayList();

        ConfDataTable.add(new ConfData("Test"));
        ConfDataTable.add(new ConfData("Test1"));

        return ConfDataTable;
    }


    @FXML
    void initialize() {



       // ConfData confData = new ConfData();



        Configuration.setCellValueFactory(new PropertyValueFactory<ConfData,String>("Configuration"));

        ConfTable.setItems(getConfDataTable());

        InstallKey.setOnAction(event ->

                SetTabVisible()
                //System.out.println("Hello")
                );
        SetNewKey.setOnAction(event ->
                SetTabVisible()
                //System.out.println("Hello world")
        );


        SetTabVisible();

    }


    void SetTabVisible(){
        TabPane.getTabs().removeAll(Tab1,Tab2);
        if (InstallKey.isSelected()){
            TabPane.getTabs().add(0,Tab1);
        } else {
            TabPane.getTabs().add(0,Tab2);
        }

    }





}
