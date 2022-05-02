import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MyCalendercontroller implements Initializable {

    public ChoiceBox Timepicker;
    public javafx.scene.control.DatePicker DatePicker;

    @FXML
    private APPHANDLER app;

    @FXML
    private Label myLabel;

    @FXML ChoiceBox<String> myChoicebox;

    private String[] time = {"8:00","10:00","12:00","14:00","16:00","18:00","20:00"};

    public MyCalendercontroller() {
    }


    public void logout(MouseEvent mouseEvent) throws IOException {
        app.logout1();
    }

    public void GoBackMenuV(MouseEvent mouseEvent) throws IOException{
        app.GoBackToVMenu();
    }


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        myChoicebox.getItems().addAll(time);
    }
}
