package com.memoryliang.designPattern.singleton.lazy_threadNotSafe;

/**
 * 懒汉，线程不安全
 */
public class Singleton {
  private static Singleton instance;

  private Singleton() {
  }

  private static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}
