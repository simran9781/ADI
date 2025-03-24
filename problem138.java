import org.w3c.dom.Node;

public class problem138 {
     public Node copyRandomList(Node head) {
        Node temp = head;
        while(temp!=null)
        {
            Node copynode = new Node(temp.val);
            copynode.next =temp.next;
            temp.next=copynode;

            temp=temp.next.next;
        }

        temp=head;
        while(temp!=null)
        {
            Node copynode = temp.next;
            if(temp.random!=null)
            {
                copynode.random=temp.random.next;
            }
            else
            {
                copynode.random = null;
            }
            temp = temp.next.next;
        }

        
        Node dnode = new Node(-1);
        Node res = dnode;
        temp=head;

        while(temp!=null)
        {
            res.next = temp.next;
            temp.next = temp.next.next;

            res = res.next;
            temp = temp.next;
        }

        return dnode.next;
    }
}
