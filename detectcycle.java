import java.util.*;
class Linked{
    int val;
    Linked next;
    Linked(int val)
    {
        this.val = val;
        next=null;
    }
    //Detect if a cycle is present in the linkedlist,if present remove it

    //Approach: Floyd's Cycle Algorithm:

    //use two pointers,slow moves one step,fast moves two steps.

    //if they meet,a cycle exists.
    //to remove the cycle.
    //start the pointer fro the head
    //move the pointers at the same speed until they meet at the start of the 
    // find the last node and remove the cycle.
}
public class detectcycle{
    public static boolean hascycle(Linked head)
    {
        Linked slow = head,fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }

    public static void remcycle(Linked head)
    {
        Linked slow = head,fast =head;
        boolean cycleExi = false;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast)
            {
                cycleExi = true;
                break;
            }
        }

        if(!cycleExi)return;

        slow = head;

        while(slow.next!=fast.next)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        fast.next=null;
    }
    public static void main(String[] args) {
        Linked head = new Linked(1);
        head.next = new Linked(2);
        head.next.next = new Linked(3);
        head.next.next.next = new Linked(4);
        head.next.next.next.next = head.next;
        System.out.println("C D "+hascycle(head));
        remcycle(head);
        System.out.println("C R "+hascycle(head));
    }
}
