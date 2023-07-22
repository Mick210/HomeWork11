import Servise.Distance;
import Servise.Os;
import Servise.Year;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();
        Year.checkYear(year);
    }

    public static void task2() {
        System.out.println("Задача 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип операционной систеиы: 0 - IOS, 1- Android");
        int clientOs = scanner.nextInt();
        System.out.println("Введите год выпуска устройств");
        int yearRelease = scanner.nextInt();
        Os.printOS(yearRelease, clientOs);
    }

    public static void task3() {
        System.out.println("Задача 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние до адреса доставки");
        int deliveryDistance = scanner.nextInt();
        Distance.deliveryDay(deliveryDistance);
    }
}

