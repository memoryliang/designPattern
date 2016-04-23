package com.memoryliang.designPattern.factory.simpleFactory;

import com.memoryliang.designPattern.factory.Operation;

/**
 * Created by memoryliang on 2016/4/22.
 */
public class Client {
  public static void main(String[] args) {
    Operation add = OperationFactory.createOperation("add");
    add.setValue1(1.5);
    add.setValue2(2.4);
    System.out.println(add.getResult());
  }
}
