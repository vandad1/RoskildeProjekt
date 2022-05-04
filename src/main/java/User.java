public class User {
    private String name;
    private String date;
    private String task;
    private String time;

    public User(String name, String date, String task, String time) {
        this.name = name;
        this.eMail = eMail;
        this.tlfNr = tlfNr;
        this.address = address;
        this.password = password;
        responsible = false;
        shifts = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getTask() {
        return task;
    }

    public String getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String task) {
        this.date = date;
    }

    public void setTask(String date) {
        this.task = task;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
