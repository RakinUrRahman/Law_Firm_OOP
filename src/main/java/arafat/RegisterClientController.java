package com.example.lawfirmproject.Sojib.Client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Objects;

public class RegisterClientController {

    @FXML
    private TableColumn<RegisterClient, LocalDate> DateOfRegColumn;

    @FXML
    private TextArea addressTextArea;

    @FXML
    private DatePicker dobPicker;

    @FXML
    private TableColumn<RegisterClient, String> emailColumn;

    @FXML
    private TextField emailTextField;

    @FXML
    private TableColumn<RegisterClient, String> genderColumn;

    @FXML
    private ComboBox<String> genderComboBox;

    @FXML
    private TableColumn<RegisterClient, String> nameColumn;

    @FXML
    private TextField nameTextField;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private TableColumn<RegisterClient, Integer> phoneNoColumn;

    @FXML
    private TextField phoneNoTextField;

    @FXML
    private TableView<?> tableView;

    @javafx.fxml.FXML
    public void initialize() {
        genderComboBox.getItems().addAll("Male", "Female", "Others");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("clientname"));
        phoneNoColumn.setCellValueFactory(new PropertyValueFactory<>("phonenumber"));
        genderColumn.setCellValueFactory(new PropertyValueFactory<>("gender"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        DateOfRegColumn.setCellValueFactory(new PropertyValueFactory<>("phonenumber"));


    }


    @FXML
    void registerButton(ActionEvent event) {

    }

}


@FXML
    void backButton(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/lawfirmproject/Sojib/Client/DashboardClient.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("ClientRegistration");
        window.setScene(scene2);
        window.show();
    }


