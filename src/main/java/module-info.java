module rakin.law_firm_oop {
    requires javafx.controls;
    requires javafx.fxml;


    opens rakin.law_firm_oop to javafx.fxml;
    exports rakin.law_firm_oop;
}