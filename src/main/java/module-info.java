module co.edu.upc.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens co.edu.upc.demo to javafx.fxml;
    exports co.edu.upc.demo;
}