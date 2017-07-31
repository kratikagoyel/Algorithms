import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by zeus on 7/29/2017.
 */
public class StringPalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        boolean firstTime =true;
        char[] arr = str.toCharArray();
        int i=0;
        int j = arr.length -1;
        int index=0;
        char ch =(char) 0;
        while(i<j){
            if((arr[i]!=arr[j]) && firstTime){
                index=j;
                ch=arr[i];
                j=j;
                i++;
                firstTime = false;
            }else if((arr[i]!=arr[j]) && (!firstTime)){
                System.out.println("NA");
                return;
            }else{
                i++;
                j--;
                continue;
            }
        }

            String s="";
            for(int k=0;k<arr.length;){
                if(k!=index){
                    s+=arr[k];
                    k++;
                }else{
                    s+=arr[k];
                    s+=ch;
                    k++;
                }
            }
            System.out.println(s);

    }
}
