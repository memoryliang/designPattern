package com.memoryliang.designPattern.observer;

/**
 * Created by memoryliang on 2016/2/19.
 */
public class JobSeeker implements IObserver {
  private String name;

  public JobSeeker(String name) {
    this.name = name;
  }

  @Override
  public void update(ISubject subject) {
    System.out.println(this.name + " get notify");
    System.out.println(subject);
  }
}
