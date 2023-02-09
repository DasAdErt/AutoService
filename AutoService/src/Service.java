import java.util.Scanner;

public class Service{
    boolean choiceEnd = false;
    String choice;
    int price;
    int money;
    int result;
    boolean moneyCheck = false;

    public void runService() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ваш баланс: ");
        try {
            money = scanner.nextInt();
            moneyCheck = true;
        } catch (Exception e) {
            System.out.println("Вы ввели неправильное значение! Перезапустите программу!");
            runService();
        }
        if (money <= 1000) {
            System.out.println("У вас не хватает денег, приходите попозже");
            runService();
        }

        System.out.println("Список услуг:");
        System.out.println(
                "1. Починка бокового крыла                   Цена: 1500\n" +
                        "2. Починка лобового стекла                  Цена: 5000\n" +
                        "3. Починка тормозов                         Цена: 3000\n" +
                        "4. Починка рулевой рейки                    Цена: 4000\n" +
                        "5. Починка зеркал                           Цена: 4500\n" +
                        "6. Починка фонарей                          Цена: 12000\n" +
                        "7. Покраска автомобиля                      Цена: 21000\n" +
                        "8. Замена колёс                             Цена: 8000\n" +
                        "9. Замена поршней                           Цена: 9000\n" +
                        "10. Калибровка бортового компьютера         Цена: 15000\n" +
                        "0.Для завершения выбора услуг в сервисе\n");

        while (!choiceEnd) {
            System.out.print("Ваш выбор услуги: ");

            choice = scanner.next();

            switch (choice) {
                case "1":
                    price = price + 1500;
                    System.out.println("Вы выбрали: Починка бокового крыла\nИтоговая цена составляет: " + price);
                    break;
                case "2":
                    price = price +  5000;
                    System.out.println("Вы выбрали: Починка лобового стекла\nИтоговая цена составляет: " + price);
                    break;
                case "3":
                    price = price +  3000;
                    System.out.println("Вы выбрали: Починка тормозов\nИтоговая цена составляет: " + price);
                    break;
                case "4":
                    price = price +  4000;
                    System.out.println("Вы выбрали: Починка рулевой рейки\nИтоговая цена составляет: " + price);
                    break;
                case "5":
                    price = price +  4500;
                    System.out.println("Вы выбрали: Починка зеркал\nИтоговая цена составляет: " + price);
                    break;
                case "6":
                    price = price +  12000;
                    System.out.println("Вы выбрали: Починка фонарей\nИтоговая цена составляет: " + price);
                    break;
                case "7":
                    price = price +  21000;
                    System.out.println("Вы выбрали: Покраска автомобиля\nИтоговая цена составляет: " + price);
                    break;
                case "8":
                    price = price +  8000;
                    System.out.println("Вы выбрали: Замена колёс\nИтоговая цена составляет: " + price);
                    break;
                case "9":
                    price = price +  9000;
                    System.out.println("Вы выбрали: Замена поршней\nИтоговая цена составляет: " + price);
                    break;
                case "10":
                    price = price +  15000;
                    System.out.println("Вы выбрали: Калибровка бортового компьютера\nИтоговая цена составляет: " + price);
                    break;
                case "0":
                    choiceEnd = true;
                    break;
                default:
                    System.out.println("Такого выбора не существует!");
            }

            result = money - price;

            if (result >= 0) {
                System.out.println("Ваша сдача составляет: " + result);
            } else {
                System.out.println("Вы должны нашему автосервису: " + (-result));
            }

            System.out.println();
        }
    }
}