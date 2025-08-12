package mainpkg.lawfirm.turan;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MonitorProcess
{
    @javafx.fxml.FXML
    private TableColumn assignedtoTVC;
    @javafx.fxml.FXML
    private TableView tasprogressTV;
    @javafx.fxml.FXML
    private TableColumn caseidTVC;
    @javafx.fxml.FXML
    private TableColumn statustvc;
    @javafx.fxml.FXML
    private TableColumn casenameTVC;
    @javafx.fxml.FXML
    private ComboBox filterrolecb;
    @javafx.fxml.FXML
    private ComboBox filterstatuscb1;
    @javafx.fxml.FXML
    private Label errormsglabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void refreshbuttonhandle(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backbuttonhandle(ActionEvent actionEvent) {
    }
}