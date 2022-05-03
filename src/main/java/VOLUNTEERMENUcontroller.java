import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class VOLUNTEERMENUcontroller implements AppContact {

    @FXML
    private APPHANDLER app;

    @Override
    public void setApp(APPHANDLER apphandler) {
        this.app = apphandler;
    }


    public void logout(MouseEvent mouseEvent) throws IOException {
        app.logout1();
    }

    public void myinfo(MouseEvent mouseEvent) throws IOException {
        app.MyInfo();
    }

    public void mycalender(MouseEvent mouseEvent) throws IOException {
        app.MyCalender();
    }

    public void contactR(MouseEvent mouseEvent) throws IOException {
        app.ContactR();
    }


    public static Label shifts;


}
