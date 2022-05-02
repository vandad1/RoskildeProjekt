import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import org.w3c.dom.Text;

import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
class shiftCalendar extends BorderPane {
    private Calendar currentMonth;
    private int DayOfWeek;

    public shiftCalendar() {
        currentMonth = new GregorianCalendar();
        currentMonth.set(Calendar.DAY_OF_MONTH, 1);

        drawCalendar();
    }

    private void drawCalendar() {
        drawHeader();
        drawBody();
        drawFooter();
    }

    private void drawFooter() {
        Button btPrev = new Button("Prev");
        Button btNext = new Button("Next");

        btPrev.setOnAction(e -> previous());
        btNext.setOnAction(e -> next());

        HBox footerHB = new HBox(10);
        footerHB.getChildren().addAll(btPrev, btNext);
        footerHB.setAlignment(Pos.CENTER);

        setBottom(footerHB);
        setMargin(footerHB, new javafx.geometry.Insets(15));

    }


    private void previous() {
        getChildren().clear();
        currentMonth = getPreviousMonth(currentMonth);
        drawCalendar();
    }

    private void next() {
        getChildren().clear();
        currentMonth = getNextMonth(currentMonth);
        drawCalendar();
    }

    private GregorianCalendar getPreviousMonth(Calendar cal) {
        int currentMonth = cal.get(Calendar.MONTH);
        int pastMonth = currentMonth == 0 ? 11 : currentMonth - 1;
        int pastYear = currentMonth == 0 ? cal.get(Calendar.YEAR) - 1 : cal.get(Calendar.YEAR);
        return new GregorianCalendar(pastYear, pastMonth, 1);
    }

    private GregorianCalendar getNextMonth(Calendar cal) {
        int currentMonth = cal.get(Calendar.MONTH);
        int pastMonth = currentMonth == 11 ? 0 : currentMonth + 1;
        int pastYear = currentMonth == 11 ? cal.get(Calendar.YEAR) + 1 : cal.get(Calendar.YEAR);
        return new GregorianCalendar(pastYear, pastMonth, 1);
    }

    private String getNameDay(int n) {
        StringBuilder sb = new StringBuilder();
        switch (n) {
            case 1 -> sb.append("Sunday");
            case 2 -> sb.append("Monday");
            case 3 -> sb.append("Tuesday");
            case 4 -> sb.append("Wednesday");
            case 5 -> sb.append("Thursday");
            case 6 -> sb.append("Friday");
            case 7 -> sb.append("Saturday");
        }
        return sb.toString();
    }

    private String getMonthName(int n) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return monthNames[n];
    }

    private void drawBody() {
        GridPane gridBody = new GridPane();
        gridBody.setHgap(10);
        gridBody.setVgap(10);
        gridBody.setAlignment(Pos.CENTER);
        gridBody.setMinHeight(300);

        //Days of the week:
        for (int day = 1; day <= 7; day++) {
            Text nameDay = new Text(getNameDay(day));
            gridBody.add((Node) nameDay, day - 1, 0);
        }

        //Days of month:
        int currentDay = currentMonth.get(Calendar.DAY_OF_MONTH);
        int daysInMonth = currentMonth.getActualMaximum(Calendar.DAY_OF_MONTH);
        int dayOfWeek = currentMonth.get(Calendar.DAY_OF_WEEK);
        int row = 1;
        for (int i = currentDay; i <= daysInMonth; i++) {
            if (dayOfWeek == 8) {
                dayOfWeek = 1;
                row++;
            }

            Text dateT = new Text(String.valueOf(currentDay));
            Node tDate = null;
            gridBody.add(tDate, DayOfWeek - 1, row);
            currentDay++;
            dayOfWeek++;
        }

        //Previous month days:
        dayOfWeek = currentMonth.get(Calendar.DAY_OF_WEEK);
        if (currentDay != 1) {
            Calendar monthPrev = getPreviousMonth(currentMonth);
            int daysInMonthPrev = monthPrev.getActualMaximum(Calendar.DAY_OF_MONTH);
            for (int i = dayOfWeek - 2; i >= 0; i--) {
                Text dateT = new Text(String.valueOf(daysInMonthPrev));
                dateT.setFill(Color.GRAY);
                gridBody.add((Node) dateT, i, 1);
                daysInMonthPrev--;
            }
        }

        //Next month days;
        currentMonth.set(Calendar.DAY_OF_MONTH, currentMonth.getActualMaximum(Calendar.DAY_OF_MONTH));
        dayOfWeek = currentMonth.get(Calendar.DAY_OF_WEEK);
        if (dayOfWeek != 7) {
            int day = 1;
            for (int i = dayOfWeek; i < 7; i++) {
                Text dateT = new Text(String.valueOf(day));
                dateT.setFill(Color.GRAY);
                gridBody.add((Node) dateT, i, row);
                day++;
            }
        }

        setCenter(gridBody);
        setMargin(gridBody, new javafx.geometry.Insets(30));
    }

    private void drawHeader() {
        String monthString = getMonthName(currentMonth.get(Calendar.MONTH));
        String yearString = String.valueOf(currentMonth.get(Calendar.YEAR));
        Text tHeader = new Text(monthString + ", " + yearString);

        setTop((Node) tHeader);
        setAlignment((Node) tHeader, Pos.CENTER);
        setMargin(tHeader, new Insets(15));
    }
}

 */

