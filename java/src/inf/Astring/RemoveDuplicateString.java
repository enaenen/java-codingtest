package inf.Astring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDuplicateString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); ++i){
            System.out.println(input.charAt(i) + " " + i + " " + input.indexOf(input.charAt(i)));
            if (i == input.indexOf(input.charAt(i)))
                sb.append(input.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
