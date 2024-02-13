module org.example.demooop2_shapes {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.demooop2_shapes to javafx.fxml;
    exports org.example.demooop2_shapes;
}