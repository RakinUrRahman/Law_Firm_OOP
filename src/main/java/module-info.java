module rakin.law_firm_oop {
    requires javafx.controls;
    requires javafx.fxml;


    opens rakin to javafx.fxml;
    exports rakin;
}