package mainpkg.lawfirm.turan;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.time.LocalDate;

<<<<<<<< HEAD:src/main/java/mainpkg/lawfirm/turan/EmployeeAttendace.java
public class EmployeeAttendace {

========
public class EmployeeAttendaceController
{
>>>>>>>> ffeee80db2b07aedbd0c59b8b33f1f5bbc29138a:src/main/java/mainpkg/lawfirm/turan/EmployeeAttendaceController.java
    @javafx.fxml.FXML
    private TableView<EmAttendanceModel> attendanceTV;
    @javafx.fxml.FXML
    private TextField employeenametf;
    @javafx.fxml.FXML
    private TableColumn<EmAttendanceModel, String> departmentTVC;
    @javafx.fxml.FXML
    private TableColumn<EmAttendanceModel, String> dateTVC;
    @javafx.fxml.FXML
    private TableColumn<EmAttendanceModel, String> statusTVC;
    @javafx.fxml.FXML
    private TableColumn<EmAttendanceModel, String> employeenameTVC;
    @javafx.fxml.FXML
    private TableColumn<EmAttendanceModel, String> employeeidTVC;
    @javafx.fxml.FXML
    private ComboBox<String> statuscb;
    @javafx.fxml.FXML
    private DatePicker datedp;
    @javafx.fxml.FXML
    private ComboBox<String> deptcb;
    @javafx.fxml.FXML
    private TextField employeeidtf;
    @javafx.fxml.FXML
    private Label errormsglabel;

    @javafx.fxml.FXML
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

    @javafx.fxml.FXML
    public void backbuttonhandle(ActionEvent actionEvent) {
        // TODO: Implement navigation
    }

    @javafx.fxml.FXML
    public void attendancebuttonhandle(ActionEvent actionEvent) {
        String employeeId = employeeidtf.getText();
        String employeeName = employeenametf.getText();
        String department = deptcb.getValue();
        String status = statuscb.getValue();
        LocalDate date = datedp.getValue();

        // Validation with null safety
        if (employeeId == null || employeeId.isEmpty() ||
                employeeName == null || employeeName.isEmpty() ||
                department == null || department.isEmpty() ||
                status == null || status.isEmpty() ||
                date == null) {

            errormsglabel.setText("Please fill in all fields.");
            return;
        }

        // Create and add new record
        EmAttendanceModel attendance = new EmAttendanceModel(employeeId, employeeName, department, date, status);
        attendanceTV.getItems().add(attendance);

        errormsglabel.setText("Attendance recorded successfully!");
    }
}
