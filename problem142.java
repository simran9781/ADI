public class problem142 {
    public ListNode position(ListNode fast,ListNode slow)
    {
        while(fast!=slow)
        {
            slow = slow.next;
            fast = fast.next;

            if(slow==fast)
            {
                break;
            }
        }
        return fast;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast)
            {
                slow = head;
                return position(fast,slow);
            }
        }

        return null;
    }
}
