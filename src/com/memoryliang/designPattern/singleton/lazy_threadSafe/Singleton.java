package com.memoryliang.designPattern.singleton.lazy_threadSafe;

/**
 * 懒汉，线程安全
 */
public class Singleton {
  private static Singleton instance;

  private Singleton() {
  }

  public synchronized static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}
