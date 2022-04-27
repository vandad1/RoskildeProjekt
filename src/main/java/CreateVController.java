import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.io.*;
import java.util.Objects;

public class CreateVController implements AppContact {

    public Label missing;
    @FXML
    private APPHANDLER app;

    @Override
    public void setApp(APPHANDLER apphandler) {
        this.app = apphandler;
    }

    public void logout(MouseEvent mouseEvent) throws IOException {
        app.logout1();
    }

    public void GoBackMenuR(MouseEvent mouseEvent) throws IOException {
        app.GoBackToRmenu();
    }

    public TextField name;
    public TextField email;
    public TextField phonenr;
    public TextField address;



    public void submit(MouseEvent mouseEvent) throws IOException {
        String name1 = name.getText();
        String email1 = email.getText();
        String phonenr1 = phonenr.getText();
        String address1 = address.getText();


        while(Objects.equals(name1, "") || Objects.equals(email1, "") || Objects.equals(phonenr1, "")|| Objects.equals(address1, "")){
            missing.setText("Missing information!");
        }




        File volunteerInfo = new File("VolunteerData.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(volunteerInfo, true));
        PrintWriter pw = new PrintWriter(bw);

        bw.write(name1 + "\n");
        bw.write(email1 + "\n");
        bw.write(phonenr1 + "\n");
        bw.write(address1 + "\n");

        bw.close();
    }










}
