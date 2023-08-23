import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EpicTest {

    @Test
    public void findMatchingSubtask() {
        String[] subtasks = { "написать метод", "сделать дз", "отправить дз" };
        Epic epic = new Epic(55, subtasks);


        boolean actual = epic.matches("метод");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findNotMatchingSubtask() {
        String[] subtasks = { "написать метод", "сделать дз", "отправить дз" };
        Epic epic = new Epic(55, subtasks);


        boolean actual = epic.matches("задание");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
}
