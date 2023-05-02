package inf.Astring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromicStringArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine().toLowerCase().replaceAll("[^a-z]","");
        String reversed = new StringBuilder(sentence).reverse().toString();
        if (reversed.equals(sentence))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
