package com.memoryliang.designPattern.observer;

/**
 * Created by memoryliang on 2016/2/19.
 */
public interface ISubject {
  void registerObserver(IObserver observer);

  void removeObserver(IObserver observer);

  void notifyAllObservers();
}
