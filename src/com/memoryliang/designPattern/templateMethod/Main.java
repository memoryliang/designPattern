package com.memoryliang.designPattern.templateMethod;

/**
 * Created by memoryliang on 2016/2/16.
 */
public class Main {
  public static void main(String[] args) {
    testVehicle(new Car());

    testVehicle(new Truck());
  }

  private static void testVehicle(Vehicle vehicle) {
    vehicle.testYourVehicle();
  }
}
