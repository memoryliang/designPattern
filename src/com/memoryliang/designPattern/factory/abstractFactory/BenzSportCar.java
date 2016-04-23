package com.memoryliang.designPattern.factory.abstractFactory;

/**
 * Created by memoryliang on 2016/4/23.
 */
public class BenzSportCar implements BenzCar {
  @Override
  public void gasUp() {
    System.out.println("给奔驰运动车加最好的汽油");
  }
}
