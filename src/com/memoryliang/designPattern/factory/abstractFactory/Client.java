package com.memoryliang.designPattern.factory.abstractFactory;

import com.memoryliang.designPattern.factory.abstractFactory.factory.SportCarFactory;

/**
 * Created by memoryliang on 2016/4/23.
 */
public class Client {
  public static void main(String[] args) {
    SportCarFactory sportCarFactory = new SportCarFactory();
    TeslaCar teslaCar = sportCarFactory.getTeslaCar();
    teslaCar.charge();
  }
}
