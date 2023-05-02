package inf.Astring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordInSentence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String answer="";
        int max = 0;
        for (String str : input){
            if (max < str.length()) {
                answer = str;
                max = str.length();
            }
        }
        System.out.println(answer);
    }
}
