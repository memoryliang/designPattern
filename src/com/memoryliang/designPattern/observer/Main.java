package com.memoryliang.designPattern.observer;

import java.util.Iterator;

/**
 * Created by memoryliang on 2016/2/19.
 */
public class Main {
  public static void main(String[] args) {
    HeadHunter headHunter = new HeadHunter();
    IObserver lily = new JobSeeker("lily");
    IObserver lucy = new JobSeeker("Lucy");
    IObserver jim = new JobSeeker("Jim");

    headHunter.registerObserver(lily);
    headHunter.registerObserver(lucy);
    headHunter.registerObserver(jim);

    headHunter.addJob("C#");
    headHunter.addJob("Java");
    headHunter.getJobs().iterator();

  }
}
