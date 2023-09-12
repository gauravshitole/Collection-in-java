 import java.util.*;
 class testjavaCollection1
 {
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList <Integer> ();
        list.add(11);
         list.add(21);
          list.add(14);
           list.add(5);
            list.add(01);
            list.add(01);
            

    Iterator itr=list.iterator();
    while(itr.hasNext())
    {
        System.out.println(itr.next());
        
    }
    }
 }
 //arraylist are store only homogenus elememrnt
 //arraylist are all to the dublicate element
 // arraylist are follow the insertion order