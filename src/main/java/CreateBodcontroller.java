import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.*;

import static javafx.scene.paint.Color.GREEN;

public class CreateBodcontroller implements AppContact {


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

    public void GoBackMenuR(MouseEvent mouseEvent) throws IOException {
        app.GoBackToRmenu();
    }


    public TextField stallname;
    public Label stallcreates;

    public void confirm(MouseEvent mouseEvent) throws IOException {
        String usernameR = LogInRController.usernameuse;
        String bodnavn = stallname.getText();
        String filename = "ResponsibleData.txt";

        tilføjBod(filename, usernameR, bodnavn);
        stallcreates.setText("Stall created succesfully!");
        stallcreates.setTextFill(GREEN);
    }

    public void tilføjBod(String filename, String username, String bodnavn) throws IOException {
        File oldfile = new File(filename);
        File newfile = new File("tempfile.txt");


        File responsibleData = new File("ResponsibleData.txt");
        FileWriter fw = new FileWriter(newfile, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        BufferedReader br = new BufferedReader(new FileReader(oldfile));
        String s;

        while ((s = br.readLine()) != null) {
            if (s.equals(username)) {
                for (int i = 0; i < 2; i++) {
                    bw.write(s + "\n");
                    s = br.readLine();
                }
                if (s.equals("")) {
                    bw.write(bodnavn + "\n");
                } else {
                    bw.write(s + "\n" + bodnavn + "\n");
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


    }


}
