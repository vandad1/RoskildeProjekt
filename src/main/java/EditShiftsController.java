import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EditShiftsController implements Initializable, AppContact {


    @FXML
    public APPHANDLER app;

    @FXML
    public TableView<User> table;

    @FXML
    public TableColumn<User, String> name;

    @FXML
    public TableColumn<User, String> task;

    @FXML
    public TableColumn<User, String> date;

    @FXML
    public TableColumn<User, String> time;

    @FXML
    public void GoBackMenuR(MouseEvent mouseEvent) throws IOException {
        app.GoBackToRmenu();
    }

    @FXML
    public void logout(MouseEvent mouseEvent) throws IOException {
        app.logout1();
    }


    ObservableList<User> List = FXCollections.observableArrayList(
            new User("Peter", "Goere rent", "05/03/2022", "15:00 - 19:00"),
            new User("Vandad", "Diktere opgaver", "5/4/2022", "15:00 - 20:00"),
            new User("Emil", "Ornlig syg kodning", "5/4/2022", "17:00 - 21:00")
    );

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        name.setCellValueFactory(new PropertyValueFactory<User, String>("name"));
        task.setCellValueFactory(new PropertyValueFactory<User, String>("task"));
        date.setCellValueFactory(new PropertyValueFactory<User, String>("date"));
        time.setCellValueFactory(new PropertyValueFactory<User, String>("time"));
        table.setEditable(true);
        name.setEditable(true);
        task.setEditable(true);
        date.setEditable(true);
        time.setEditable(true);
        name.setCellFactory(TextFieldTableCell.forTableColumn());
        task.setCellFactory(TextFieldTableCell.forTableColumn());
        date.setCellFactory(TextFieldTableCell.forTableColumn());
        time.setCellFactory(TextFieldTableCell.forTableColumn());


        table.setItems(List);
    }

    @Override
    public void setApp(APPHANDLER app) {
        this.app = app;
    }
}



