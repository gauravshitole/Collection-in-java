import java.util.*;
public class priorityque1
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> que=new PriorityQueue<Integer>();
        que.add(221);
        que.add(21);
        que.add(2112);
        que.add(51);
 que.add(51);
        System.out.println("head:" +que.element());
        System.out.println("head"+que.peek());

System.out.println("iterating the queue elements:");  
Iterator itr=que.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
que.remove();
que.poll();  
System.out.println("after removing two elements:");  
Iterator<Integer> itr2=que.iterator();  
while(itr2.hasNext()){  
System.out.println(itr2.next());  
}  
    }
}
//PriorityQueue are allow the dublicate element
//PriorityQueue are allow homogenus element
//PriorityQue are not follw the insertion sequence
//priortyQueue are head node are small not consider