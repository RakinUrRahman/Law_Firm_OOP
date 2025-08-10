package turan;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class GenerateReport
{
    @javafx.fxml.FXML
    private CheckBox feedbackkCheckB;
    @javafx.fxml.FXML
    private CheckBox PevaluationCheckB;
    @javafx.fxml.FXML
    private CheckBox LsummaryCheckb;
    @javafx.fxml.FXML
    private ComboBox<String> monthcb;
    @javafx.fxml.FXML
    private CheckBox employeeattendanceCheckboc;
    @javafx.fxml.FXML
    private Label errormsglabel;

    @javafx.fxml.FXML
    public void initialize() {
        monthcb.getItems().addAll("January","February","March","April","May","June","July","August","September","October","November","December");

    }

    @javafx.fxml.FXML
    public void generatereportbuttonhandle(ActionEvent actionEvent) {
        String month = monthcb.getValue();

        if (month == null || month.isEmpty()) {
            errormsglabel.setText("Please select a month.");
            return;
        }
        if (!employeeattendanceCheckboc.isSelected() && !PevaluationCheckB.isSelected() && !feedbackkCheckB.isSelected() && !LsummaryCheckb.isSelected()) {
            errormsglabel.setText("Please select at least one report.");
            return;

        }

    }

    @javafx.fxml.FXML
    public void backbuttonhandle(ActionEvent actionEvent) {
    }
}