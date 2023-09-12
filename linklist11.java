import java.util.*;
public class linklist11
{
    public static void main(String args[])
    {
        LinkedList<Integer>b1=new LinkedList<Integer> ();

        b1.add(11);
         b1.add(1);
          b1.add(4);
           b1.add(13);
            b1.add(7);
    b1.add(7);
            Iterator itr=b1.iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }

    }
}
//linklist allow to the dublicate element
//linklist follow the sequence in insertion
//linklist are use homoginus method
