import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayChanger arrayChanger = new ArrayChanger();
        arrayChanger.printArray(new int[]{1,2,3,4,5,9,19,6});
        System.out.println(Arrays.equals(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}));
        System.out.println();
        arrayChanger.printArray(new int[]{1,4,3,10,5,4,8,7});
        System.out.println();
        arrayChanger.printArray(new int[]{1,3,10,5,8,4});


        ArrayOf1And4 array = new ArrayOf1And4();
        System.out.println(array.checkArray(new int[]{1,2,3}));
        System.out.println(array.checkArray(new int[]{1,4,1}));
        System.out.println(array.checkArray(new int[]{1,4,4}));
    }
}
