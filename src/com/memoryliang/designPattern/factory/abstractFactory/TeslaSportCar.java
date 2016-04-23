package com.memoryliang.designPattern.factory.abstractFactory;

/**
 * Created by memoryliang on 2016/4/23.
 */
public class TeslaSportCar implements TeslaCar {
  @Override
  public void charge() {
    System.out.println("给特斯拉运动车充满电");
  }
}
