import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class VOLUNTEERMENUcontroller implements AppContact{

    @FXML
    private APPHANDLER app;

    @Override
    public void setApp(APPHANDLER apphandler) {
        this.app = apphandler;
    }


    public void logout(MouseEvent mouseEvent) throws IOException {
        app.logout1();
    }


    public void myinfo(MouseEvent mouseEvent) {

    }

    public void mycalender(MouseEvent mouseEvent) {

    }

    public void contactR(MouseEvent mouseEvent) {

    }
}
