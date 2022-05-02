import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static javafx.scene.paint.Color.BLACK;



public class RESPONSIBLEMENUcontroller extends LogInRController implements AppContact {


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
        app.CreateShift();
    }

    public void EditShift(MouseEvent mouseEvent) throws IOException {
        app.EditShifts();
    }

    public void CreateBOD(MouseEvent mouseEvent) throws IOException{
        app.CreateBod();
    }

    public void CheckUp(MouseEvent mouseEvent) throws IOException{
        app.CheckUp();
    }


}