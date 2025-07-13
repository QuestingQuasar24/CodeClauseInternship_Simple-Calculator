module com.calci.basiccalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.calci.simpleCalculator to javafx.fxml;
    exports com.calci.simpleCalculator;
}