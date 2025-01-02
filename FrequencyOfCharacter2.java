/*To write a java program to find the frequency of a characters in a given string using a constructor.*/

import java.util.Scanner;

public class String_frequency {
    public static void main(String[] args) {
        String str, str1;
        int i, len, count = 0;
        char ch, ch1;

        System.out.print("Enter a string: ");
        Scanner s = new Scanner(System.in);
        str = s.nextLine();
        str1 = str.toLowerCase();
        len = str.length();

        System.out.print("Enter a character to find frequency: ");
        ch = s.next().charAt(0);
        ch1 = Character.toLowerCase(ch);

        for (i = 0; i < len; i++) {
            if (ch1 == str1.charAt(i)) {
                count++;
            }
        }

        System.out.print("Frequency of the character is: " + count);
        s.close();
    }
}