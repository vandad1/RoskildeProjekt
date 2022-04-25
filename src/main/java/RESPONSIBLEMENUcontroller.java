import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class RESPONSIBLEMENUcontroller implements AppContact {


    @FXML
    private APPHANDLER app;


    @FXML
    @Override
    public void setApp(APPHANDLER apphandler) {
        this.app = apphandler;
    }


    public void logout(MouseEvent mouseEvent) throws IOException {
        app.logout1();
    }

    public void CREATEVOLUNTEER(MouseEvent mouseEvent) throws IOException {
        app.CreateV();
    }

    public void EDITVOLUNTEER(MouseEvent mouseEvent) throws IOException {
        app.EditV();
    }

    public void CreateShift(MouseEvent mouseEvent) throws IOException {
        app.CreateV();
    }

    public void EditShift(MouseEvent mouseEvent) throws IOException {
        app.EditV();
    }


}