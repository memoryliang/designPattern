package com.memoryliang.designPattern.templateMethod;

/**
 * Created by memoryliang on 2016/2/16.
 */
public class Car extends Vehicle {
  @Override
  void start() {
    this.status = true;
  }

  @Override
  void run() {
    System.out.println("car run fast");
  }

  @Override
  void stop() {
    System.out.println("car stop");
  }
}
