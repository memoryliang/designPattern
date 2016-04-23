package com.memoryliang.designPattern.factory.FactoryMethod;

import com.memoryliang.designPattern.factory.Operation;

/**
 * Created by memoryliang on 2016/4/22.
 */
public class Client {
  public static void main(String[] args) {
    IFactory factory = new SubFactory();
    Operation operation = factory.createOperation();
    operation.setValue2(5);
    operation.setValue1(12);
    System.out.println(operation.getResult());
  }
}
