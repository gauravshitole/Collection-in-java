  import java.util.*;
  class Vector1
  {
    public static void main(String args[])
    {
    Vector<Integer> v=new Vector<Integer>();
    v.add(11);
    v.add(1);
    v.add(21);
    v.add(71);
    v.add(2);
    v.add(21);
   
    
    Iterator<Integer> itr=v.iterator();
    while(itr.hasNext())
    {
        System.out.println(itr.next());
    }
    }
  }
  //vector are allow to the dublicate element
  //vector are follw the insertion sequence
  //vector are not accept the hetrogenus element