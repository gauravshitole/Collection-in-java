import java.util.*;
public class Deque1
{
    public static void main(String args[])
    {
        Deque<Integer> deque= new ArrayDeque<Integer>();  
        deque.add(11);
        deque.add(1);
        deque.add(13);
        deque.add(2);
        deque.add(21);
        deque.add(21);
  
 for (Integer str : deque) {  
System.out.println(str);  
}  

    }
}
//arrayDeque are allow the dublicate element
//arrayDeque are follow the insertion sequence
//arrayDeque are are not allow hetrogenus element