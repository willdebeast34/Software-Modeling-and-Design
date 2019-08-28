import java.util.Scanner;


public class Finder {
    static Integer findMax(int[] intArray) {

        if (intArray == null)
            return null;
        if (intArray.length == 0)
            return null;

        int max = intArray[0];

        for (int i = 1; i < intArray.length; i++){
            if(intArray[i] > max)
                max = intArray[i];
            }
        return max;
    }

    static Integer findMin(int[] intArray){
        if (intArray == null)
            return null;
        if (intArray.length == 0)
            return null;
        int max = intArray[0];

        for (int i = 1; i < intArray.length; i++){
            if(intArray[i] < max)
                max = intArray[i];

        }
        return max;
    }
}
