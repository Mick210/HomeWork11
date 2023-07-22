package Servise;

public class Distance {
    public static void deliveryDay (int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня");
        } else {
            System.out.println("Доставки нет");
        }
    }
}