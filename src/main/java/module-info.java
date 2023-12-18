module com.example.demo7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ba.unsa.etf.rpr to javafx.fxml;
    exports ba.unsa.etf.rpr;

    opens ba.unsa.etf.rpr to javafx.fxml;
}