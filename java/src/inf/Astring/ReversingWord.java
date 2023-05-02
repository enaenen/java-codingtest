package inf.Astring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversingWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (-1 < --n){
            StringBuilder sb = new StringBuilder(br.readLine());
            System.out.println(sb.reverse());
        }
    }
}
