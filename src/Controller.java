import java.util.Arrays;
import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {

        Caesar caesar = new Caesar( 33);

        Scanner scanner = new Scanner(System.in);


        char[] alph = load();

        int a = scanner.nextInt();
        scanner.nextLine();
        int b = scanner.nextInt();
        scanner.nextLine();

        String text = scanner.nextLine();


        for(int i = 0; i < text.length(); i++) {

            char newChar = text.charAt(i);

            if (Character.isLetter(newChar)) {

                System.out.print(newChar);
                newChar = alph[caesar.encript(linearSearch(alph, newChar), a, b)];

                System.out.print(" ->  " + linearSearch(alph, newChar) + " ->  ");
            }

            System.out.println(newChar);

        }

        scanner.nextLine();

    }

    public static char[] load() {

        char[] arr = new char[33];

        arr[0] = 'а';

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] == 'е') {
                arr[i++] = 'ё';
                arr[i] = (char)(arr[i - 2] + 1);
            } else {
                arr[i] = (char)(arr[i - 1] + 1);
            }


        }

        return arr;
    }

    public static int linearSearch(char[] arr, char find) {

        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {

                result = i;

            }
        }

        return result;
    }

}
