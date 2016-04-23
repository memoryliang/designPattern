package com.memoryliang.designPattern.factory.abstractFactory.factory;

import com.memoryliang.designPattern.factory.abstractFactory.BenzCar;
import com.memoryliang.designPattern.factory.abstractFactory.BenzSportCar;
import com.memoryliang.designPattern.factory.abstractFactory.TeslaCar;
import com.memoryliang.designPattern.factory.abstractFactory.TeslaSportCar;

/**
 * Created by memoryliang on 2016/4/23.
 */
public class SportCarFactory implements CarFactory {
  @Override
  public BenzCar getBenzCar() {
    return new BenzSportCar();
  }

  @Override
  public TeslaCar getTeslaCar() {
    return new TeslaSportCar();
  }
}
