package com.memoryliang.designPattern.factory;

/**
 * Created by memoryliang on 2016/4/22.
 */
public class OperationDiv extends Operation {
  @Override
  public double getResult() {
    if(this.getValue2() != 0){
      return this.getValue1() / this.getValue2();
    }
    throw new IllegalArgumentException("除数不能为0");
  }
}
