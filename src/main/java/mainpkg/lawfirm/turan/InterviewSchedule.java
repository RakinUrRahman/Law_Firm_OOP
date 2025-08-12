package mainpkg.lawfirm.turan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

<<<<<<<< HEAD:src/main/java/mainpkg/lawfirm/turan/InterviewSchedule.java
public class InterviewSchedule {

    @FXML
========
public class InterviewScheduleController
{
    @javafx.fxml.FXML
>>>>>>>> ffeee80db2b07aedbd0c59b8b33f1f5bbc29138a:src/main/java/mainpkg/lawfirm/turan/InterviewScheduleController.java
    private TableColumn<Interview, String> interviewtypeTVC;
    @FXML
    private TextField candidatetb;
    @FXML
    private DatePicker interviewdp;
    @FXML
    private RadioButton onlinerb;
    @FXML
    private TableColumn<Interview, String> positionTVC;
    @FXML
    private ComboBox<String> positioncb;
    @FXML
    private ComboBox<String> interviewercb;
    @FXML
    private TableColumn<Interview, String> candidatenameTVC;
    @FXML
    private RadioButton inpersonrb;
    @FXML
    private TableColumn<Interview, String> DateTVC;
    @FXML
    private TableView<Interview> interviewTV;
    @FXML
    private Label errormsglabel;

    @FXML
    public void initialize() {
        candidatenameTVC.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        positionTVC.setCellValueFactory(new PropertyValueFactory<>("position"));
        DateTVC.setCellValueFactory(new PropertyValueFactory<>("date"));
        interviewtypeTVC.setCellValueFactory(new PropertyValueFactory<>("interviewType"));

        positioncb.getItems().addAll("Lawyer", "Paralegal", "Legal Assistant", "Case Manager");
        interviewercb.getItems().addAll("Turan", "Rafsan", "Rakin", "Muhit", "Ronon", "Sojib", "Arafat");

        errormsglabel.setText("");
    }

    @FXML
    public void backbuttonhandle(ActionEvent actionEvent) {
        // TODO: Implement back navigation
    }

    @FXML
    public void schedulebuttonhandle(ActionEvent actionEvent) {
        String candidateName = candidatetb.getText();
        String position = positioncb.getValue();
        String interviewer = interviewercb.getValue();
        LocalDate interviewDate = interviewdp.getValue();
        String interviewType = null;

        if (inpersonrb.isSelected()) {
            interviewType = "In Person";
        } else if (onlinerb.isSelected()) {
            interviewType = "Online";
        }

        // Validate inputs
        if (candidateName == null || candidateName.isEmpty() ||
                position == null || position.isEmpty() ||
                interviewer == null || interviewer.isEmpty() ||
                interviewDate == null ||
                interviewType == null || interviewType.isEmpty()) {

            errormsglabel.setText("Please fill all fields.");
            return;
        }

<<<<<<<< HEAD:src/main/java/mainpkg/lawfirm/turan/InterviewSchedule.java
        // Pass LocalDate directly instead of String
        Interview interview = new Interview(candidateName, position, interviewDate, interviewType);
        interviewTV.getItems().add(interview);
========
                errormsglabel.setText("Please fill all fields.");
                return;
            }
>>>>>>>> ffeee80db2b07aedbd0c59b8b33f1f5bbc29138a:src/main/java/mainpkg/lawfirm/turan/InterviewScheduleController.java

        errormsglabel.setText("Interview scheduled successfully!");
    }

    @FXML
    public void editbuttonhandle(ActionEvent actionEvent) {
    }
}
<<<<<<<< HEAD:src/main/java/mainpkg/lawfirm/turan/InterviewSchedule.java
========


>>>>>>>> ffeee80db2b07aedbd0c59b8b33f1f5bbc29138a:src/main/java/mainpkg/lawfirm/turan/InterviewScheduleController.java
