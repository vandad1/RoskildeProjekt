import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.io.*;

public class EDITVController implements AppContact {



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


    public TextField fullname;
    public TextField email;
    public TextField phonenr;
    public TextField address;
    public String name;

    public void search(MouseEvent mouseEvent) throws IOException {

        name = fullname.getText();

        File VolunteerData = new File("VolunteerData.txt");
        BufferedReader br = new BufferedReader(new FileReader(VolunteerData));
        String s;

        while ((s = br.readLine()) != null) {

            if (s.equals(name)) {
                fullname.setPromptText(s);
                email.setPromptText(s = br.readLine());
                phonenr.setPromptText(s = br.readLine());
                address.setPromptText(s = br.readLine());

            }
        }
        br.close();

    }

    public void save(MouseEvent mouseEvent) throws IOException {
        String newemail = email.getText();
        String newnumber = phonenr.getText();
        String newaddress = address.getText();

        File VolunteerData = new File("VolunteerData.txt");
        BufferedReader br = new BufferedReader(new FileReader(VolunteerData));
        String s;
        BufferedWriter bw = new BufferedWriter(new FileWriter(VolunteerData, true));
        PrintWriter pw = new PrintWriter(bw);

        while ((s = br.readLine()) != null) {

            if (s.equals(name)) {


            }


        }
    }


    public void delete(MouseEvent mouseEvent) {

    }





}
