public class User {
    public String task;
    public String date;
    public String time;

    public User(String Task, String Date, String Time) {
        this.task = task;
        this.date = date;
        this.time = time;
    }

    public String Task() {
        return task;
    }

    public String Date() {
        return date;
    }

    public String Time() {
        return time;
    }
}
