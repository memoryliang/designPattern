package com.memoryliang.designPattern.factory;

/**
 * Created by memoryliang on 2016/4/22.
 */
public class OperationAdd extends Operation {
  @Override
  public double getResult() {
    return this.getValue1() + this.getValue2();
  }
}
