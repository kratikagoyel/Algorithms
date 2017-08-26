import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by zeus on 8/26/2017.
 */
public class TestTree {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int noOfTestCases = Integer.parseInt(br.readLine());
        for(int i=0;i<noOfTestCases;i++){
            String noOfStudents = br.readLine();
            String noOfCandies = br.readLine();
            String[] noOfCandy = noOfCandies.split(" ");
            int[] candy = new int[noOfCandy.length];
            for(int k=0;k<noOfCandy.length; k++){
                candy[k] = Integer.parseInt(noOfCandy[k]);
            }
            int l=0;
            int stuOutside = Integer.parseInt(noOfStudents.split(" ")[0]);
            for( ;l<stuOutside; l++){
                Tree.insetElement(candy[l]);
            }
            stuOutside = Integer.parseInt(noOfStudents.split(" ")[1]);
            for(int m=0+l ;m<l+stuOutside; m++){
                boolean flag =Tree.findElement(candy[m]);
                if(flag){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                    Tree.insetElement(candy[m]);
                }
            }
        }
    }
}
