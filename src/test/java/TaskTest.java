import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class TaskTest {

    @Test
    public void findMatchingTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

       boolean actual = simpleTask.matches("Позвонить");
       boolean expected = true;
       Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findNotMatchingTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Напиши");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void findMatchingSubtask() {
        String[] subtasks = { "написать метод", "сделать дз", "отправить дз" };
        Epic epic = new Epic(55, subtasks);


        boolean actual = epic.matches("метод");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void findNotMatchingSubtask() {
        String[] subtasks = { "написать метод", "сделать дз", "отправить дз" };
        Epic epic = new Epic(55, subtasks);


        boolean actual = epic.matches("задание");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    public void findMatchingTime() {
        Meeting meeting = new Meeting(5, "мама", "обед", "15.00");

        boolean actual = meeting.matches("15");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    public void findNoMatching() {
        Meeting meeting = new Meeting(5, "мама", "обед", "15.00");

        boolean actual = meeting.matches("встреча");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void findMatchingProject() {
        Meeting meeting = new Meeting(5, "мама", "обед", "15.00");

        boolean actual = meeting.matches("обед");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
}
