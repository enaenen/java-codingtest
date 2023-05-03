package inf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //Buffered Reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        //Scanner
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        int i = sc.nextInt();
        char[] charArray = next.toCharArray();
        System.out.println("Hello world!");
    }
}