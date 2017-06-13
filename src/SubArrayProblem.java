import java.util.HashMap;

/**
 * Created by zeus on 6/13/2017.
 */
public class SubArrayProblem {
    public static void main(String[] args) {
        int[] arr = new int[]{4,5, 1, 2, 3};
        HashMap<Integer, Integer> sum = new HashMap<>();
        int tot = 0;
        for(int i=0; i< arr.length ; i++){
            tot = tot + arr[i];
            if(arr[i] == 0){
                System.out.println("start index = "+ i+ " end index "+i);
                break;
            }
            else if(sum.containsKey(tot)){
                System.out.println("start index = "+ (sum.get(tot)+1)+ " end index "+i);
                break;
            }
            else
                sum.put(tot, i);
        }
        System.out.println("No sub array whose sum is 0");
    }
}
