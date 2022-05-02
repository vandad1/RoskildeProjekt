import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MyCalendercontroller implements AppContact {

    public javafx.scene.control.DatePicker DatePicker;
    public ChoiceBox timepicker;

    @FXML
    private APPHANDLER app;

    @FXML
    private Label myLabel;


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
    public void setApp(APPHANDLER app) {
        timepicker.getItems().addAll(time);
    }
}
