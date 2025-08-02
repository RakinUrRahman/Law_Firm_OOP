package com.example.lawfirmproject.Sojib.Client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class DashboardClientController {

    @FXML
    void BookConsultationButton(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/lawfirmproject/Sojib/Client/bookConsultation.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("BookConsultation");
        window.setScene(scene2);
        window.show();
    }

    @FXML
    void ContactLawyerButton(ActionEvent event) {

    }

    @FXML
    void PayLegalFeesButton(ActionEvent event) {

    }

    @FXML
    void backButton(ActionEvent event) {

    }

    @FXML
    void registerClientButton(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/lawfirmproject/Sojib/Client/registerClient.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("ClientRegistration");
        window.setScene(scene2);
        window.show();
    }



    @FXML
    void requestCaseClosureButton(ActionEvent event) {

    }

    @FXML
    void submitDocumentsButton(ActionEvent event) {

    }

    @FXML
    void submitFeedbackButton(ActionEvent event) {

    }

    @FXML
    void trackCaseProgressButton(ActionEvent event) {

    }

}
