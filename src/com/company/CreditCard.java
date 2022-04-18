package com.company;

public class CreditCard {

    // Поля
    String cardNumber;
    String owner;
    String type;

    public static void main(String[] args) {

        // Инициализация полей
        CreditCard creditCard = new CreditCard();
        creditCard.cardNumber = "2400 5656 2333 0989";
        creditCard.owner = "Пупкин Иван Ивановыч";
        creditCard.type = "VISA";

        // Проверка нужной карты
        switch (creditCard.type) {
            case "VISA":
                System.out.println("Уважаемый " + creditCard.owner + ",поздравляем, Вы используете нормальную карту");
                break;
            case "MASTERCARD":
                System.out.println("Уважаемый " + creditCard.owner + ",поздравляем, Вы используете нормальную карту");
                break;
            case "МИР":
                System.out.println(creditCard.owner + " пошел ты на х#й со своим русским кораблем! Слава Україні!!");
                break;
            default:
                System.out.println("Неизвестный тип карты");

                // Героям Слава!!
        }
    }
}
