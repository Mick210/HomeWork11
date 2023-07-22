package Servise;

public class Os {
    public static void printOS(int yearRelease, int clientOs) {
        switch (clientOs) {
            case 0:
                if (yearRelease >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (yearRelease >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Ваша ОС не поддерживается");
                break;
        }
    }
}
