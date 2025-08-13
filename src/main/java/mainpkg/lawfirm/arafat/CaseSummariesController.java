package mainpkg.lawfirm.arafat;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class CaseSummariesController {
    @javafx.fxml.FXML
    private ComboBox selectCaseComboBox;
    @javafx.fxml.FXML
    private TableColumn caseIDcolumn;
    @javafx.fxml.FXML
    private TableColumn lastUpdatedColumn;
    @javafx.fxml.FXML
    private TextArea caseSummaryTextArea;
    @javafx.fxml.FXML
    private TableColumn summaryColumn;
    @javafx.fxml.FXML
    private TableView tableView;

    @javafx.fxml.FXML
    public void backToDashbpardButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveUpdateButton(ActionEvent actionEvent) {
    }
}
