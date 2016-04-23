package com.memoryliang.designPattern.factory.simpleFactory;

import com.memoryliang.designPattern.factory.*;

/**
 * 优点：
 *      1: 屏蔽产品的具体实现，调用者只关心产品的接口
 *      2: 实现简单
 * 缺点：
 *      1: 增加产品，需要修改工厂类，不符合开放-闭合原则
 *      2: 工厂类集中了所有实例的逻辑创建，违反了高内聚责任分配原则
 */
public class OperationFactory {
  public static Operation createOperation(String operationName){
    Operation operation = null;
    switch (operationName){
      case  "add" :
        operation = new OperationAdd();
        break;
      case "div":
        operation = new OperationDiv();
        break;
      case "sub":
        operation = new OperationSub();
        break;
      case "mul":
        operation = new OperationMul();
        break;
    }
    return operation;
  }
}
