module com.fm.financemanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires nitrite;

    opens com.fm.financemanager to javafx.fxml;
    exports com.fm.financemanager;
    exports com.fm.financemanager.controller;
    opens com.fm.financemanager.controller to javafx.fxml;
}