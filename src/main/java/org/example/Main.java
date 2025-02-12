package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "2025/01/01", "Taiwan");

        // 測試 1
        car.showInformation();

        // 測試 2
        car.setCarName("Honda");
        car.showInformation();

    }
}