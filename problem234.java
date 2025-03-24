public class problem234 {
    public ListNode reverse(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
       
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null)
        {
            ListNode newnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newnode;
        }

        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newhead = reverse(slow);

        ListNode first = head;
        ListNode second = newhead;

        while(second!=null)
        {
            if(first.val!=second.val){
                reverse(newhead);
                return false;
            }

            first = first.next;
            second = second.next;
        }

        reverse(newhead);
        return true;

    }
}
