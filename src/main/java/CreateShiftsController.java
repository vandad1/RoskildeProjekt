import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.*;
import java.time.LocalDate;
import java.util.Date;

import static javafx.scene.paint.Color.GREEN;
import static javafx.scene.paint.Color.RED;

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

    public Label foundor;
    public TextField fullname;
    public DatePicker date;
    public TextField hours;
    public TextField task;
    public Label succesfully;

    public void confirm(MouseEvent mouseEvent) throws IOException{

        File VolunteerData = new File("VolunteerData.txt");
        BufferedReader br = new BufferedReader(new FileReader(VolunteerData));
        String s;
        String name = fullname.getText();

        while((s = br.readLine()) != null){
            if(s.equals(name)){
                foundor.setText("Person found!");
                foundor.setTextFill(GREEN);
                break;
            }
            else{
                foundor.setText("Person not found in system");
                foundor.setTextFill(RED);
            }

        }
    }

    public void submitS(MouseEvent mouseEvent) throws IOException{
        String navn = fullname.getText();
        addshift(navn);
    }

    public void addshift(String name) throws IOException{
        LocalDate dato = date.getValue();
        String task1 = task.getText();
        String timer = hours.getText();

        String filename = "VolunteerData.txt";
        File newfile = new File("temp.txt");
        File oldfile = new File(filename);

        FileWriter fw = new FileWriter(newfile, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        BufferedReader br = new BufferedReader(new FileReader(oldfile));
        String s;


        while((s = br.readLine()) != null){
            if(s.equals(name)){
                bw.write(name + "\n");
                for(int i = 0; i < 4; i++){
                    s = br.readLine();
                    bw.write(s + "\n");
                }
                s = br.readLine();
                if(s.equals("")){
                    bw.write(dato + ", " + task1 + ", " + timer + "\n");
                }
                else{
                    bw.write(s + "  -  " + dato + ", " + task1 + ", " + timer + "\n");
                }

            }
            else{
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
        succesfully.setText("Shift added succesfully!");
    }




}
