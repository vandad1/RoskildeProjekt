import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.*;

import static javafx.scene.paint.Color.*;

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
    public Label notfound;
    public String password;
    public Label changedS;
    public Button areyousure;

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
                s = br.readLine();
                password = s;
                notfound.setText("  ");
                notfound.setTextFill(WHITE);
                break;
            } else {
                notfound.setText("Person not found in system");
                notfound.setTextFill(RED);
            }
        }
        br.close();

    }

    public void save(MouseEvent mouseEvent) throws IOException {
        String filename = "VolunteerData.txt";
        String newemail = email.getText();
        String newnumber = phonenr.getText();
        String newaddress = address.getText();

        redigerP(filename, name, newemail, newnumber, newaddress);

    }

    public void redigerP(String filename, String name, String newemail, String newnumber, String newaddress) throws IOException {
        String tempfile = "temp.txt";
        File oldfile = new File(filename);
        File newfile = new File(tempfile);

        FileWriter fw = new FileWriter(tempfile, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        BufferedReader br = new BufferedReader(new FileReader(oldfile));
        String s;

        while ((s = br.readLine()) != null) {
            if (s.equals(name)) {
                bw.write(name);
                bw.write("\n");
            } else if (s.equals(email.getPromptText())) {
                if (newemail.equals("")) {
                    bw.write(email.getPromptText());
                    bw.write("\n");
                } else {
                    bw.write(newemail);
                    bw.write("\n");
                }
            } else if (s.equals(phonenr.getPromptText())) {
                if (newnumber.equals("")) {
                    bw.write(phonenr.getPromptText());
                    bw.write("\n");
                } else {
                    bw.write(newnumber);
                    bw.write("\n");
                }
            } else if (s.equals(address.getPromptText())) {
                if (newaddress.equals("")) {
                    bw.write(address.getPromptText());
                    bw.write("\n");
                } else {
                    bw.write(newaddress);
                    bw.write("\n");
                }
            } else {
                bw.write(s);
                bw.write("\n");
            }
        }

        br.close();
        bw.close();
        pw.flush();
        pw.close();
        oldfile.delete();
        File dump = new File(filename);
        newfile.renameTo(dump);
        changedS.setText("Information changed succesfully!");
        changedS.setTextFill(GREEN);

    }

    public void delete(MouseEvent mouseEvent) {
        areyousure.setVisible(true);
    }

    public void SLET(MouseEvent mouseEvent) throws IOException {
        String filename = "VolunteerData.txt";
        sletperson(filename, name, password);
    }

    public void sletperson(String filename, String name, String password) throws IOException {
        String tempfile = "temp.txt";
        File oldfile = new File(filename);
        File newfile = new File(tempfile);

        FileWriter fw = new FileWriter(tempfile, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        BufferedReader br = new BufferedReader(new FileReader(oldfile));
        String s;

        while ((s = br.readLine()) != null) {
            if (s.equals(name)) {
                bw.write("");
            } else if (s.equals(email.getPromptText())) {
                bw.write("");
            } else if (s.equals(phonenr.getPromptText())) {
                bw.write("");
            } else if (s.equals(address.getPromptText())) {
                bw.write("");
            } else if (s.equals(password)) {
                bw.write("");
            } else {
                bw.write(s);
                bw.write("\n");
            }
        }

        br.close();
        bw.close();
        pw.flush();
        pw.close();
        oldfile.delete();
        File dump = new File(filename);
        newfile.renameTo(dump);
        changedS.setText("Person deleted succesfully");
        changedS.setTextFill(RED);

    }


}
