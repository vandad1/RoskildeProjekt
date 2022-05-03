public class User {
    public String task;
    public String date;
    public String time;

    public User(String task, String date, String time) {
        this.task = task;
        this.date = date;
        this.time = time;
    }

    public String task() {
        return task;
    }

    public String date() {
        return date;
    }

    public String time() {
        return time;
    }
}
