package com.example.lawfirm_oop_officeadmin;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Officeadmindb
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void handleAssignCases(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleBilling(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleScheduleMeetings(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleGenerateReports(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleUpdateCaseStatus(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleManageStaff(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("staffmanage.fxml"));

            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));
            newStage.setTitle("Manage Staff");
            newStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @javafx.fxml.FXML
    public void handlePostNoticeOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleStaffRecordOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleGenerateReportsOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleManageCalendarOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleUpdateCaseStatusOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleScheduleMeetingsOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleInventoryOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleManageStaffOnClicked(ActionEvent actionEvent) {
    }
}