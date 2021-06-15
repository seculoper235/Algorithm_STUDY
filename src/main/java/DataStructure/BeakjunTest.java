package DataStructure;

import java.util.Scanner;


public class BeakjunTest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int s = sc.nextInt();

        for (int i=0; i<s; i++) {
            System.out.println("Check = [ " + correctCheck(sc.next()) +" ]");
        }
    }

    static boolean correctCheck(String s) {
        while(s.length() != 0) {
            if(s.contains("()")) {
                s = s.replace("()", "");
            }
            else { return false; }
        }
        return true;
    }
}
