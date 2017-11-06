package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 整数数组按绝对值排序
 * @author yujiansong
 *	  @date 2017年11月6日
 */
public class SortArray {

    public static void main(String[] args) {
        int[] array = {0,-1,2,6,-5,8,12,-3};
        
        int[] resultArray = sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }
    
    public static int[] sort(int[] array){
        Map<Integer, Integer> map = new HashMap<>();
        int[] newArray = new int[array.length];
        int[] resultArray = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            newArray[i] = Math.abs(array[i]);
            map.put(newArray[i], array[i]);
        }
        
        Arrays.sort(newArray);
        
        for (int i = 0; i < array.length; i++) {
            resultArray[i] = map.get(newArray[i]);
        }
        
        return resultArray;
    }
}
