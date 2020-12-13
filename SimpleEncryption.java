// Простейшее посимвольное шифрование строки с использование ключа-строки

class SimpleEncryption {
    public static void main(String[] args) {
        String str = "Hello, world!";
        String key = "my key";
        String encStr = "";
        String decStr = "";
        int iterator;

        // Шифрование
        iterator = 0;
        for (int i = 0; i < str.length(); i++) {
            encStr += (char) (str.charAt(i) ^ key.charAt(iterator));

            iterator++;

            if (iterator == key.length())
                iterator = 0;
        }

        // Дешифрование
        iterator = 0;
        for (int i = 0; i < encStr.length(); i++) {
            decStr += (char) (encStr.charAt(i) ^ key.charAt(iterator));

            iterator++;

            if (iterator == key.length())
                iterator = 0;
        }

        System.out.println("Оригинальная строка:\n" + str + "\n");
        System.out.println("Зашифрованная строка:\n" + encStr + "\n");
        System.out.println("Дешифрованная строка:\n" + decStr);
    }
}