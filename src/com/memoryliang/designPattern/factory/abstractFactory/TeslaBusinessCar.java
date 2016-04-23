package com.memoryliang.designPattern.factory.abstractFactory;

/**
 * Created by memoryliang on 2016/4/23.
 */
public class TeslaBusinessCar implements TeslaCar {
  @Override
  public void charge() {
    System.out.println("给特斯拉商务车充满电");
  }
}
