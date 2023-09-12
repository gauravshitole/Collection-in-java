import java.util.*;
public class Stack1
{
    public static void main(String args[])
    {
        Stack<String> stack=new Stack<String>();

        stack.push("aruna");
           stack.push("sanket");
              stack.push("shraddha");
                 stack.push("sachin");
                 stack.push("tejas");
                   
                  
Iterator<String> itr=stack.iterator();

while(itr.hasNext())
{
    System.out.println(itr.next());
}
 Stack<String> stack=new Stack<String>();
 

    }
}
//stack allow to the dublicate element
//stack follow the sequence in insertion
//stack are use homoginus method