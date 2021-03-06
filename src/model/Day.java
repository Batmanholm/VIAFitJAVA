package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Day implements Serializable
{
  private ArrayList<ScheduledGroup> classes;
  private Date date;

  public Day(int day)
  {
    this.date = new Date(day);
    classes = new ArrayList<ScheduledGroup>();
  }

  public Day(ArrayList<ScheduledGroup> classes, Date date)
  {
    this.classes = classes;
    this.date = date;
  }

  public void addGroup(ScheduledGroup group)
  {
    if (group.getTime().getDay()==date.getDay())
    {
      classes.add(group);
    }
  }
  public void removeGroup(ScheduledGroup group)
  {
    classes.remove(group);
  }
  public boolean containsGroup(ScheduledGroup group)
  {
    return classes.contains(group);
  }

  public ArrayList<ScheduledGroup> getClasses()
  {
    return classes;
  }

  public void setClasses(ArrayList<ScheduledGroup> classes)
  {
    this.classes = classes;
  }

  public Date getDate()
  {
    return date;
  }

  public void setDate(Date date)
  {
    this.date = date;
  }

  @Override public String toString()
  {
    String returned = "Day: "+date.toString();
    for(int i=0;i<classes.size();i++)
    {
      returned+="\n"+classes.get(i).toString();
    }
    return returned;
  }

  @Override public boolean equals(Object obj)
  {
    if(!(obj instanceof Day)) return false;
    Day day = (Day)obj;
    return day.toString().equals(toString());
  }

//  public static void main(String[] args)
//  {
//    Day day1 = new Day(25);
//    day1.addGroup(new ScheduledGroup(new Group("pilates",20,new Instructor("name","strand",31,"ea",2143,"descript")),new Date(25)));
//    day1.addGroup(new ScheduledGroup(new Group("pilates",20,new Instructor("name","strand",31,"ea",2143,"descript")),new Date(25)));
//    day1.addGroup(new ScheduledGroup(new Group("pilates",20,new Instructor("name","strand",31,"ea",2143,"descript")),new Date(25)));
//    day1.addGroup(new ScheduledGroup(new Group("pilates",20,new Instructor("name","strand",31,"ea",2143,"descript")),new Date(25)));
//    System.out.println(day1);
//  }
}
