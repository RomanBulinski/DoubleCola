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

    @Test
    public void test3() {
        String[] names = new String[] { "a", "b" };
        int n =4;
        assertEquals("a", Main.WhoIsNext(names, n));
    }

    @Test
    public void test3d() {
        String[] names = new String[] { "a", "b" };
        int e =15;
        assertEquals("a", Main.WhoIsNext(names, e));
    }

    @Test
    public void test3c() {
        String[] names = new String[] { "a", "b" };
        int r =14;
        assertEquals("b", Main.WhoIsNext(names, r));
    }


    @Test
    public void test3b() {
        String[] names = new String[] { "a", "b" };
        int y =10;
        assertEquals("a", Main.WhoIsNext(names, y));
    }


    @Test
    public void test3a() {
        String[] names = new String[] { "a", "b" };
        int m =5;
        assertEquals("b", Main.WhoIsNext(names, m));
    }

    @Test
    public void test4() {
        String[] names = new String[] { "a", "b" };
        int n =31;
        assertEquals("a", Main.WhoIsNext(names, n));
    }

    @Test
    public void test5() {
        String[] names = new String[] { "a", "b","c" };
        int n =21;
        assertEquals("c", Main.WhoIsNext(names, n));
    }

    @Test
    public void test6() {
        String[] names = new String[] { "a", "b","c" };
        int n =22;
        assertEquals("a", Main.WhoIsNext(names, n));
    }


}
