import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.input.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class VOLUNTEERMENUcontroller implements AppContact {



    @FXML
    private APPHANDLER app;

    @Override
    public void setApp(APPHANDLER apphandler) {
        this.app = apphandler;
    }


    public void logout(MouseEvent mouseEvent) throws IOException {
        app.logout1();
    }

    public void myinfo(MouseEvent mouseEvent) throws IOException {
        app.MyInfo();
    }

    public void contactR(MouseEvent mouseEvent) throws IOException {
        app.ContactR();
    }

    public Label shifts;
    public Label shift2;
    public Label shift3;

    public void show1(ActionEvent actionEvent) throws IOException{
        String username1 = LogInVController.usernameuse;
        File filename = new File("VolunteerData.txt");

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String s;
        while ((s = br.readLine()) != null) {
            if (s.equals(username1)) {
                for(int i = 0; i < 4; i++){
                    s = br.readLine();
                }
                if(s.equals("")){
                    shifts.setText("No occuring shifts");
                }
                else{
                    if(!s.contains(".")){
                        shifts.setText(s);
                    }
                    else{
                        String shift = s;
                        StringTokenizer st = new StringTokenizer(shift, ".");
                            shifts.setText(st.nextElement().toString());
                    }
                }

            }
        }

    }


    public void show3(ActionEvent actionEvent) throws IOException{
        String username1 = LogInVController.usernameuse;
        File filename = new File("VolunteerData.txt");

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String s;
        while ((s = br.readLine()) != null) {
            if (s.equals(username1)) {
                for(int i = 0; i < 4; i++){
                    s = br.readLine();
                }
                if(s.equals("")){
                    shifts.setText("No occuring shifts");
                }
                else{
                    if(!s.contains(".")){
                        shifts.setText(s);
                        shift2.setText("No more occuring shifts");
                    }
                    else{
                        String shift = s;
                        StringTokenizer st = new StringTokenizer(shift, ".");
                        int antal = st.countTokens();
                        shifts.setText(st.nextElement().toString());
                        shift2.setText(st.nextElement().toString());
                        System.out.println(antal);
                        if(antal < 3){
                            shift3.setText("No more occuring shifts");
                        }
                        else{
                            shift3.setText(st.nextElement().toString());
                        }

                    }

                }


            }
        }
    }



}
