import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayChanger {
    public static int[] changeArray(int[] arr){

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4){
                return Arrays.copyOfRange(arr, i + 1, arr.length);
            }
        }
            throw new RuntimeException("Нет четверок");


//        int destArrSize = arr.length - indexes.get(indexes.size()-1)-1;
//        int[] destArr = new int[destArrSize];
//        System.arraycopy(arr,indexes.get(indexes.size()-1)+1,destArr,0,destArrSize);
//        return destArr;
    }

    public void printArray(int[] arr){
        for (int i = 0; i < changeArray(arr).length; i++) {
            System.out.print(changeArray(arr)[i] + " ");


        }
    }
}
