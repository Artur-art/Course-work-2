import java.time.LocalDate;
import java.time.LocalDateTime;
public class DailyTask extends Task{
    public DailyTask(String title, String description, boolean isWork, LocalDateTime dateTime) {
        super(title, description, isWork, dateTime);
    }

    @Override
    public boolean checkDate(LocalDateTime requestedDate) {
        return false;
    }

    public boolean checkIfSuitable(LocalDate date) {
        return true;
    }
    @Override
    protected String getType() {
        return "Ежедневная";
    }
}