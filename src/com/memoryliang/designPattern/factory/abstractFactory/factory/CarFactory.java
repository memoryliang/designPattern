package com.memoryliang.designPattern.factory.abstractFactory.factory;

import com.memoryliang.designPattern.factory.abstractFactory.BenzCar;
import com.memoryliang.designPattern.factory.abstractFactory.TeslaCar;

/**
 * Created by memoryliang on 2016/4/23.
 */
public interface CarFactory {
  public BenzCar getBenzCar();
  public TeslaCar getTeslaCar();
}
