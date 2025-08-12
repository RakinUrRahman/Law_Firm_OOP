package mainpkg.lawfirm.arafat;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PayFeesController {
    @javafx.fxml.FXML
    private TableColumn methodColumn;
    @javafx.fxml.FXML
    private TextField cardNumberTextField;
    @javafx.fxml.FXML
    private TableColumn amountColumn;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private ComboBox paymentMethodComboBox;
    @javafx.fxml.FXML
    private TableColumn cardNoColumn;
    @javafx.fxml.FXML
    private TableColumn dateColumn;

    @javafx.fxml.FXML
    public void makePaymentButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboardButton(ActionEvent actionEvent) {
    }
}
