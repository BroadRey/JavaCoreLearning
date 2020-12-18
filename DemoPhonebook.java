/*
 * Простейший автоматизированный телефонный справочник,
 * для корректной работы которого необходимо передать в качестве
 * аргумента командной строки имя абонента
 */

class DemoPhonebook {
    public static void main(String[] args) {
        String[][] numbers = {
                {"Мария", "666-3434"},
                {"Андрей", "357-274"},
                {"Ольга", "354-777"},
        };

        if (args.length != 1) {
            System.out.println("Использование: java DemoPhonebook <Имя>");
        } else {
            int iterator = 0;
            
            for (String[] x : numbers) {
                if (x[0].equals(args[0])) {
                    System.out.println(x[1]);
                    break;
                }
                
                iterator++;
            }

            if (iterator == numbers.length)
                System.out.println("Элемент не найден!");
        }
    }
}
