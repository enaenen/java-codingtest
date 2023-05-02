package inf.Astring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShortSpanString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String word = input[0];
        char delim = input[1].charAt(0);
        int[] answer = new int[word.length()];
        int max = 1000;
        for (int i = 0; i < answer.length; ++i) {
            if (word.charAt(i) == delim) {
                max = 0;
                answer[i] = max;
            }
            else
                answer[i] = ++max;
        }
        max = 1000;
        for (int i = answer.length - 1; -1 < i; --i){
            if (word.charAt(i) == delim)
                max = 0;
            else
                answer[i] = Math.min(answer[i], ++max);
        }
        for (int i : answer) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
