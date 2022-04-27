import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class CreateShiftsController implements AppContact{

    @FXML
    private APPHANDLER app;

    @Override
    public void setApp(APPHANDLER app) {
        this.app = app;
    }

    public void GoBackMenuR(MouseEvent mouseEvent) throws IOException {
        app.GoBackToRmenu();
    }

    public void logout(MouseEvent mouseEvent) throws IOException {
        app.logout1();
    }




}
