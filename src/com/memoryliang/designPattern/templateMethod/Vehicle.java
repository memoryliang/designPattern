package com.memoryliang.designPattern.templateMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by memoryliang on 2016/2/16.
 */
public abstract class Vehicle {
  public Vehicle() {
  }

  protected boolean status;

  abstract void start();

  abstract void run();

  abstract void stop();

  ArrayList<String> s = null;

  public void testYourVehicle() {
    start();
    if (status) {
      run();
      stop();
    }
  }
}
