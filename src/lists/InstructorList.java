package lists;

import model.Instructor;

import java.io.Serializable;
import java.util.ArrayList;

public class InstructorList implements Serializable
{
  private ArrayList<Instructor> instructors;

  public InstructorList()
  {
    instructors = new ArrayList<Instructor>();
  }
  public int size()
  {
    return instructors.size();
  }
  public int indexOfPhoneNumber(int phone)
  {
    for(int i=0;i<instructors.size();i++)
    {
      if(instructors.get(i).getPhone()==phone) return i;
    }
    return -1;
  }
  public Instructor getInstructor(int index)
  {
    return instructors.get(index);
  }
  public Instructor getInstructorByPhone(int phone)
  {
    if(indexOfPhoneNumber(phone)!=-1) return instructors.get(indexOfPhoneNumber(phone));
    return null;
  }
  public void addInstructor(Instructor instructor)
  {
    instructors.add(instructor);
  }
  public void removeInstructor(Instructor instructor)
  {
    instructors.remove(instructor);
  }
  public void removeInstructor(int index)
  {
    instructors.remove(index);
  }

  @Override public String toString()
  {
    String returned = "Instructors: ";
    for(int i=0;i<instructors.size();i++)
    {
      returned+="\n"+instructors.get(i).toString();
    }
    return returned;
  }
}
