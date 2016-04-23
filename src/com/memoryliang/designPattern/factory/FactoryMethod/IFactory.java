package com.memoryliang.designPattern.factory.FactoryMethod;

import com.memoryliang.designPattern.factory.Operation;

/**
 * 优点：
 *     1: 继承了简单工厂的优点
 *     2: 符合开放-闭合原则
 * 缺点：
 *     1: 增加产品时，需要增加新的工厂类，导致系统类的个数成对增加，在一定程度上增加了系统的复杂度
 *
 */
public interface IFactory {
  Operation createOperation();
}
