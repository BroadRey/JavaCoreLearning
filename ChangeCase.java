/*
* Данная программа должна преобразовывать строчные буквы в прописные,
* а прописные — в строчные. Остальные символы не должны меняться.
* Работа программы должна завершаться после того, как пользователь введет с клавиатуры точку.
* И наконец, сделайте так, чтобы программа отображала количество символов, для которых
* был изменен регистр.
*/


public class ChangeCase {
    public static void main(String[] args) throws java.io.IOException {
        char letter, ignore;
        int counter = 0;

        do {
            System.out.println("Введите букву:");
            letter = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (letter >= 'a' && letter <= 'z') {
                System.out.println("Вы ввели строчкую букву: " + letter);
                letter -= 32;
                counter++;
                System.out.println("Теперь ваша буква прописная: " + letter);
                System.out.println();
            } else if (letter >= 'A' && letter <= 'Z') {
                System.out.println("Вы ввели прописную букву: " + letter);
                letter += 32;
                counter++;
                System.out.println("Теперь ваша буква строчная: " + letter);
                System.out.println();
            }
        } while (letter != '.');

        System.out.println("Количество выволненных преобразований: " + counter);
    }
}