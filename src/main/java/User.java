public class User {
    private String name;
    private String task;
    private String date;
    private String time;

    public User(String name, String task, String date, String time) {
        this.name = name;
        this.task = task;
        this.date = date;
        this.time = time;
    }

    public String getName(){
        return name;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
