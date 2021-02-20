import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThanosSortTest {

    @Test
    public void firstTest() { //Положительные числа, чётное количество
        int[] a = {46, 3, 3285, 289, 421, 1520, 250, 24};
        int[] expectedArray = {3, 24, 46, 250, 289, 421, 1520, 3285};
        ThanosSort.sort(a, 0, a.length - 1);
        Assertions.assertArrayEquals(expectedArray, a);
    }

    @Test
    public void secondTest() { //Положительные числа, нечётное количество
        int[] a = {46, 3, 3285, 25, 289, 421, 1520, 250, 24};
        int[] expectedArray = {3, 24, 25, 46, 250, 289, 421, 1520, 3285};
        ThanosSort.sort(a, 0, a.length - 1);
        Assertions.assertArrayEquals(expectedArray, a);
    }

    @Test
    public void thirdTest() { //Положительные числа и ноль
        int[] a = {46, 3, 3285, 25, 0, 289, 421, 1520, 250, 24};
        int[] expectedArray = {0, 3, 24, 25, 46, 250, 289, 421, 1520, 3285};
        ThanosSort.sort(a, 0, a.length - 1);
        Assertions.assertArrayEquals(expectedArray, a);
    }

    @Test
    public void fourthTest() { //Любые целые числа
        int[] a = {46, 3, 3285, 24, 289, 421, 1520, -300, 250, 7, 0, -12};
        int[] expectedArray = {-300, -12, 0, 3, 7, 24, 46, 250, 289, 421, 1520, 3285};
        ThanosSort.sort(a, 0, a.length - 1);
        Assertions.assertArrayEquals(expectedArray, a);
    }

    @Test
    public void firthTest() { //Любые целые числа с повторениями
        int[] a = {46, 24, 3, 0, 3285, 24, 289, -12, 421, 0, 1520, -300, 250, 7, 0, 250, 24};
        int[] expectedArray = {-300, -12, 0, 0, 0, 3, 7, 24, 24, 24, 46, 250, 250, 289, 421, 1520, 3285};
        ThanosSort.sort(a, 0, a.length - 1);
        Assertions.assertArrayEquals(expectedArray, a);
    }
}
