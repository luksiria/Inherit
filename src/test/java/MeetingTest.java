import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MeetingTest {

    @Test
    public void findMatchingTopic() {
        Meeting meeting = new Meeting(5, "мама", "обед", "15.00");

        boolean actual = meeting.matches("мама");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMatchingProject() {
        Meeting meeting = new Meeting(5, "мама", "обед", "15.00");

        boolean actual = meeting.matches("обед");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMatchingTime() {
        Meeting meeting = new Meeting(5, "мама", "обед", "15.00");

        boolean actual = meeting.matches("15");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void findNoMatching() {
        Meeting meeting = new Meeting(5, "мама", "обед", "15.00");

        boolean actual = meeting.matches("встреча");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
}
