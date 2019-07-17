import org.junit.jupiter.api.Test;

import javax.sound.sampled.Line;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void test1() {
        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
        int n = 1;
        assertEquals("Sheldon", Main.WhoIsNext(names, n));
    }
    @Test
    public void test2() {
        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
        int n = 6;
        assertEquals("Sheldon", Main.WhoIsNext(names, n));
    }

}
