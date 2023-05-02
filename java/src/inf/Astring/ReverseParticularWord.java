package inf.Astring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseParticularWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int rt = arr.length - 1;
        int lt = 0;
        while (lt < rt){
            if (!Character.isAlphabetic(arr[lt]))
                ++lt;
            if (!Character.isAlphabetic(arr[rt]))
                --rt;
            if (Character.isAlphabetic(arr[lt]) && Character.isAlphabetic(arr[rt])){
                char tmp = arr[rt];
                arr[rt] = arr[lt];
                arr[lt] = tmp;
                ++lt;
                --rt;
            }
        }
        System.out.println(arr);
    }
}
