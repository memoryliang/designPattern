package com.memoryliang.designPattern.observer;

import java.util.ArrayList;

/**
 * Created by memoryliang on 2016/2/19.
 */
public class HeadHunter implements ISubject {
  private ArrayList<IObserver> userList;
  private ArrayList<String> jobs;

  public HeadHunter() {
    this.userList = new ArrayList<>();
    this.jobs = new ArrayList<>();
  }

  @Override
  public void registerObserver(IObserver observer) {
    userList.add(observer);
  }

  @Override
  public void removeObserver(IObserver observer) {

  }

  @Override
  public void notifyAllObservers() {
    for (IObserver observer : userList) {
      observer.update(this);
    }
  }

  public void addJob(String job) {
    jobs.add(job);
    notifyAllObservers();
  }

  public ArrayList<String> getJobs() {
    return jobs;
  }

  @Override
  public String toString() {
    return "HeadHunter{" +
        "jobs=" + jobs +
        '}';
  }
}
