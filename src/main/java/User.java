public class User {
    private String shiftTask;
    private String shiftDate;
    private String shiftTime;

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
