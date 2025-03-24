public class problem25 {
    public ListNode findkthnode(ListNode head,int k)
    {
        ListNode temp = head;
        k-=1;
        while(temp!=null && k>0){
            k--;
            temp = temp.next;
        }
        return temp;
    }
    public ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null)
        {
            ListNode nextnode = temp.next;
            temp.next = prev;
            prev = temp;
            temp= nextnode;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevnode =null;

        while(temp!=null)
        {
            ListNode kthnode = findkthnode(temp,k);

            if(kthnode==null)
            {
                if(prevnode!=null){
                    prevnode.next = temp;
                }
                break;
            }

            ListNode nextnode = kthnode.next;
            kthnode.next = null;
            reverse(temp);

            if(temp==head)
            {
                head = kthnode;
            }else{
                prevnode.next = kthnode;
            }

            prevnode = temp;
            temp = nextnode;
        }
        return head;
    }
}
