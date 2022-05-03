public class User {
    private String task;
    private String date;
    private String time;

    public User(String task, String date, String time) {
        this.task = task;
        this.date = date;
        this.time = time;
    }

    public String getTask() {
        return task;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}
