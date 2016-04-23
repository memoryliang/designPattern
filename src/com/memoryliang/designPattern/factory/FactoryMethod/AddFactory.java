package com.memoryliang.designPattern.factory.FactoryMethod;

import com.memoryliang.designPattern.factory.Operation;
import com.memoryliang.designPattern.factory.OperationAdd;

/**
 * Created by memoryliang on 2016/4/22.
 */
public class AddFactory implements IFactory {
  @Override
  public Operation createOperation() {
    return new OperationAdd();
  }
}
