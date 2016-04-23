package com.memoryliang.designPattern.factory.abstractFactory;

/**
 * Created by memoryliang on 2016/4/23.
 */
public class BenzBusinessCar implements BenzCar {
  @Override
  public void gasUp() {
    System.out.println("给奔驰商务车加油");
  }
}
