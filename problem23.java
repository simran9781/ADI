public class problem23 {
    public ListNode merge2lists(ListNode list1,ListNode list2)
    {
        ListNode dummyNode = new ListNode(-1);
        ListNode res = dummyNode;

        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                res.next = list1;
                res = list1;
                list1 = list1.next;
            }
            else
            {
                res.next = list2;
                res = list2;
                list2 = list2.next;
            }
            res.next=null;
        }
        if(list1!=null)
        {
            res.next=list1;
        }
        else
        {
            res.next=list2;
        }

        return dummyNode.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
        {
            return null;
        }
        ListNode head = lists[0];
        for(int i=1;i<lists.length;i++)
        {
            head = merge2lists(head,lists[i]);
        }
        return head;
    }
}
