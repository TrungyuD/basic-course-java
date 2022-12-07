package oop;

import java.util.ArrayList;

public class BetuMember {
  public String name;
  public int age;

  public Task review;
  public Task refinement;
  public ArrayList<Task> develop = new ArrayList<Task>();

  public BetuMember(){}

  public BetuMember(String name){
    this.name = name;
  }

  public void assignTaskReview(Task task){
    this.review = task;
  }

  public void assignTaskDevelop(Task task){
    this.develop.add(task);
  }
}
