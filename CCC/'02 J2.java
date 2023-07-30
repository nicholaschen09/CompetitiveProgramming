import java.io.*;

public class AmeriCanadian {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            String words = scan.nextLine();
            if (words.equals("quit!")) {
                System.out.println();
                break;
            }

            Set<Character> set = new HashSet<>();
            set.add('a');
            set.add('e');
            set.add('i');
            set.add('o');
            set.add('u');

            if (words.length() > 4 && !set.contains(words.charAt(words.length() - 3)) && words.endsWith("or")) {
                String newWord = words.substring(0, words.length() - 2) + "our";

                System.out.println(newWord);

            }
            else {
                System.out.println(words);
            }

        }
    }
}
