package mainpkg.lawfirm.turan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

class EmployeeAttendanceController {

    @FXML
    private TableView<EmAttendanceModel> attendanceTV;
    @FXML
    private TextField employeenametf;
    @FXML
    private TableColumn<EmAttendanceModel, String> departmentTVC;
    @FXML
    private TableColumn<EmAttendanceModel, String> dateTVC;
    @FXML
    private TableColumn<EmAttendanceModel, String> statusTVC;
    @FXML
    private TableColumn<EmAttendanceModel, String> employeenameTVC;
    @FXML
    private TableColumn<EmAttendanceModel, String> employeeidTVC;
    @FXML
    private ComboBox<String> statuscb;
    @FXML
    private DatePicker datedp;
    @FXML
    private ComboBox<String> deptcb;
    @FXML
    private TextField employeeidtf;
    @FXML
    private Label errormsglabel;

    @FXML
    public void initialize() {
        employeeidTVC.setCellValueFactory(new PropertyValueFactory<>("employeeId"));
        employeenameTVC.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        departmentTVC.setCellValueFactory(new PropertyValueFactory<>("department"));
        dateTVC.setCellValueFactory(new PropertyValueFactory<>("date"));
        statusTVC.setCellValueFactory(new PropertyValueFactory<>("status"));

        deptcb.getItems().addAll("HR", "Finance", "Legal", "Operations");
        statuscb.getItems().addAll("Present", "Absent", "Leave");

        errormsglabel.setText("");
    }

    @FXML
    public void backbuttonhandle(ActionEvent actionEvent) {
    }

    @FXML
    public void attendancebuttonhandle(ActionEvent actionEvent) {
        String employeeId = employeeidtf.getText();
        String employeeName = employeenametf.getText();
        String department = deptcb.getValue();
        String status = statuscb.getValue();
        LocalDate date = datedp.getValue();

        if (employeeId == null || employeeId.isEmpty() ||
                employeeName == null || employeeName.isEmpty() ||
                department == null || department.isEmpty() ||
                status == null || status.isEmpty() ||
                date == null) {

            errormsglabel.setText("Please fill in all fields.");
            return;
        }

        EmAttendanceModel attendance = new EmAttendanceModel(employeeId, employeeName, department, date, status);
        attendanceTV.getItems().add(attendance);

        errormsglabel.setText("Attendance recorded successfully!");
    }
}
