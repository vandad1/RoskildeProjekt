import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class EditShiftsController implements AppContact {

    @FXML
    private APPHANDLER app;


    @Override
    public void setApp(APPHANDLER app) {
        this.app = app;
    }


    public void logout(MouseEvent mouseEvent) throws IOException {
        app.logout1();
    }


    public void GoBackMenuR(MouseEvent mouseEvent) throws IOException {
        app.GoBackToRmenu();
    }



    private void datepickerSetDate() throws ParseException {


        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateInString = "2022-04-30";
        Date date = formatter.parse(dateInString);

        Instant instant = date.toInstant();
        LocalDate localDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();

        ObservableList<LocalDate> selectedDates = FXCollections.observableArrayList();
        selectedDates.addAll(localDate);

        DatePicker datePicker_1 = new DatePicker();
        datePicker_1.setOnAction(event -> selectedDates.add(datePicker_1.getValue()));

        datePicker_1.setDayCellFactory(new Callback<DatePicker, DateCell>() {
            @Override
            public DateCell call(DatePicker param) {
                return new DateCell() {
                    @Override
                    public void updateItem(LocalDate item, boolean empty) {
                        super.updateItem(item, empty);
                        boolean alreadySelected = selectedDates.contains(item);
                        setDisable(alreadySelected);
                        setStyle(alreadySelected ? "-fx-background-color: lightblue;" : "");
                    }
                };
            }
        });
    }
}
