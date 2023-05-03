package inf.Astring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCrypto {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String line = br.readLine();
        line = line.replaceAll("#", "1");
        line = line.replaceAll("[*]", "0");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < line.length() - 6; i += 7){
            sb.append( (char) Integer.parseInt(line.substring(i, i+7), 2));
        }
        System.out.println(sb);
    }
}
