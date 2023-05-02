package inf.Astring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] inputArr = br.readLine().toLowerCase().toCharArray();
        String singleChar = br.readLine().toLowerCase();
        int answer = 0;
        for (char c : inputArr) {
            if(c == singleChar.charAt(0))
                ++answer;
        }
        System.out.println(answer);
    }
}
