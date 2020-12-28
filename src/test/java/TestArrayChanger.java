import org.junit.Assert;
import org.junit.Test;

public class TestArrayChanger {

    @Test
    public void test1After4() {
        int[] in = new int[] {5, 3 ,4, 8, 9, 7};
        int[] out = new int[] {8, 9, 7};
        Assert.assertArrayEquals(out, ArrayChanger.changeArray(in));

    }

    @Test
    public void test3After4() {
        int[] in = new int[] {5, 3 ,4, 8, 4, 7};
        int[] out = new int[] {7};
        Assert.assertArrayEquals(out, ArrayChanger.changeArray(in));

    }
    @Test (expected = RuntimeException.class)
    public void test4After4() {
        int[] in = new int[] {5, 3 , 3, 7};
        ArrayChanger.changeArray(in);
    }

    @Test (expected = RuntimeException.class)
    public void test2After4() {
        int[] in = new int[] {5, 3 ,3, 8, 9, 7};
        ArrayChanger.changeArray(in);
    }

    @Test
    public void test1ArrContainOnly1or4() {
        int[] in = new int[] {1, 1, 1, 4, 4, 1, 4, 1};
        Assert.assertTrue(ArrayOf1And4.checkArray(in));
    }

    @Test
    public void test2ArrContainOnly1or4() {
        int[] in = new int[] {1, 1, 3, 4, 5, 1, 4, 1};
        Assert.assertFalse(ArrayOf1And4.checkArray(in));
    }


}
