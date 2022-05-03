public class User {
    public String shiftTask;
    public String shiftDate;
    public String shiftTime;

    public User(String shiftTask, String shiftDate, String shiftTime) {
        this.shiftTask = shiftTask;
        this.shiftDate = shiftDate;
        this.shiftTime = shiftTime;
    }

    public String getShiftTask() {
        return shiftTask;
    }

    public String getShiftDate() {
        return shiftDate;
    }

    public String getShiftTime() {
        return shiftTime;
    }
}
