package com.example.lawfirmproject.Sojib.Client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class BookConsultationController {

    @FXML
    private ComboBox<?> consultationTypeComboBox;

    @FXML
    private TableColumn<?, ?> dateColumn;

    @FXML
    private DatePicker preferredDatePicker;

    @FXML
    private TextArea problemTextArea;

    @FXML
    private TableColumn<?, ?> slotColumn;

    @FXML
    private TableView<?> tableViewColumn;

    @FXML
    private ComboBox<?> timeSlotComboBox;

    @FXML
    private TableColumn<?, ?> typeColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void backButton(ActionEvent event) {

    }

    @FXML
    void submitButton(ActionEvent event) {

    }

}





