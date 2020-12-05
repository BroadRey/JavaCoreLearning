/*
* Напишите программу, которая считывает символы с клавиатуры до тех пор,
* пока не встретится точка. Предусмотрите в программе счетчик пробелов.
* Сведения о количестве пробелов должны выводиться в конце программы.
*/


public class DotFind {
    public static void main(String[] args) throws java.io.IOException {
        char letter, ignore;
        int spaceCounter = 0;

        do {
            letter = (char) System.in.read();

            if (letter == ' ')
                spaceCounter++;

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (letter != '.');

        System.out.println("Количество введённых пробелов: " + spaceCounter);
    }
}