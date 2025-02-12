package org.example;

public class Car {
    protected String carName;
    protected String productionDate;
    protected String country;

    // car 的 construction
    public Car(String name, String productionDate, String country) {
        this.carName = name;
        this.productionDate = productionDate;
        this.country = country;
    }

    // 獲取 car name
    public String getCarName() {
        return this.carName;
    }

    // 設定 car name
    public void setCarName(String name) {
        carName = name;
    }

    // 獲取 car production date
    public String getProductionDate() {
        return this.productionDate;
    }

    // 設定 car production date
    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    // 獲取 car production date
    public String getCountry() {
        return this.country;
    }

    // 設定 car production date
    public void setCountry(String country) {
        this.country = country;
    }

    // 輸出 car name
    void showCarName() {
        System.out.println("Car Name is " + getCarName());
    }

    // 輸出 car production date
    private void showCarProductionDate() {
        System.out.println("Car production date is " + this.productionDate);
    }

    void showCountry() {
        System.out.println("Car country is " + getCountry());
    }

    // 輸出 car 所有資訊
    public void showInformation() {
        System.out.println("-------");
        showCarName();
        showCarProductionDate();
        showCountry();
        System.out.println("-------");
    }
}