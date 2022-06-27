package kyu6;

import org.junit.jupiter.api.*;

public class AreSameTest {
    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
     Assertions.assertEquals(true, AreSame.comp(a, b));
    }

    @Test
    public void test2() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 36100, 25921, 361, 20736, 361};
        Assertions.assertEquals(false, AreSame.comp(a, b));
    }

}
