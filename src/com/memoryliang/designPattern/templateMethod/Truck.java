package com.memoryliang.designPattern.templateMethod;

/**
 * Created by memoryliang on 2016/2/16.
 * 卡车
 */
public class Truck extends Vehicle {

  @Override
  void start() {
    this.status = true;
  }

  @Override
  void run() {
    System.out.println("truck run slowly");
  }

  @Override
  void stop() {
    System.out.println("truck rum stop");
  }
}
