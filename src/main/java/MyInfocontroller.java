import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyInfocontroller implements AppContact {


    @FXML
    private APPHANDLER app;

    @Override
    public void setApp(APPHANDLER apphandler) {
        this.app = apphandler;
    }


    public void logout(MouseEvent mouseEvent) throws IOException {
        app.logout1();
    }

    public void GoBackMenuV(MouseEvent mouseEvent) throws IOException {
        app.GoBackToVMenu();
    }

    public Label email;
    public Label phone;
    public Label address;


    public void show(MouseEvent mouseEvent) throws IOException {
        String username1 = LogInVController.usernameuse;
        File filename = new File("VolunteerData.txt");

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String s;
        while ((s = br.readLine()) != null) {
            if (s.equals(username1)) {
                email.setText(s);
                s = br.readLine();
                phone.setText(s);
                s = br.readLine();
                address.setText(s);
            }
        }

    }
}
