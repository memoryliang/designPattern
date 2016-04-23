package com.memoryliang.designPattern.factory.abstractFactory.factory;

import com.memoryliang.designPattern.factory.abstractFactory.BenzBusinessCar;
import com.memoryliang.designPattern.factory.abstractFactory.BenzCar;
import com.memoryliang.designPattern.factory.abstractFactory.TeslaBusinessCar;
import com.memoryliang.designPattern.factory.abstractFactory.TeslaCar;

/**
 * Created by memoryliang on 2016/4/23.
 */
public class BusinessCarFactory implements CarFactory {
  @Override
  public BenzCar getBenzCar() {
    return new BenzBusinessCar();
  }

  @Override
  public TeslaCar getTeslaCar() {
    return new TeslaBusinessCar();
  }
}
