package Threads.Ue3;

import java.util.Scanner;

public class ConsoleHelper {

    public static String readLine() {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        return str;
    }
}
