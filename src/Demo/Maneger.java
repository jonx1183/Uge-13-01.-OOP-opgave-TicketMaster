package Demo;

import java.util.ArrayList;

public class Maneger {

  ArrayList<Event> EList = new ArrayList<>();



  public void list(){

    //Needs to be a constructer, not an object!!!
    Event E1 = new Event("",0,0);

    EList.add(E1.test);


    System.out.println();
  }


}
