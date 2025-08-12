package mainpkg.lawfirm.ronon;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class Staffmanage
{
    @javafx.fxml.FXML
    private TableColumn<Staff, String> accessCol;
    @javafx.fxml.FXML
    private TableColumn<Staff, Integer> contactCol;
    @javafx.fxml.FXML
    private TableColumn<Staff,String> nameCol;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private ComboBox<String> roleComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> accessComboBox;
    @javafx.fxml.FXML
    private TextField contactTextField;
    @javafx.fxml.FXML
    private TableColumn<Staff,String> roleCol;
    @javafx.fxml.FXML
    private TableView<Staff> staffTable;

    private ArrayList<Staff> arrayList= new ArrayList<>();
    @javafx.fxml.FXML
    private Label outputLabel;

    @javafx.fxml.FXML
    public void initialize() {
        nameCol.setCellValueFactory(new PropertyValueFactory<>("nameTextField"));
        roleCol.setCellValueFactory(new PropertyValueFactory<>("roleComboBox"));
        contactCol.setCellValueFactory(new PropertyValueFactory<>("contactTextField"));
        accessCol.setCellValueFactory(new PropertyValueFactory<>("accessComboBox"));

        roleComboBox.getItems().addAll("Lawyer", "Admin","HR","Paralegal","Intern");
        accessComboBox.getItems().addAll("Read ", "Full Access", "Limited Access");

    }

    @javafx.fxml.FXML
    public void handleSaveOnClicked(ActionEvent actionEvent) {

    }
}