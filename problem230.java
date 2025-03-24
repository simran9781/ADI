import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class problem230 {
    static void inorder(TreeNode root,List<Integer> l)
  {
      if(root==null)
      {
          return;
      }
      
      inorder(root.left,l);
      l.add(root.val);
      inorder(root.right,l);
  }
    public int kthSmallest(TreeNode root, int k) {
         List<Integer> l = new ArrayList<>();
      inorder(root,l);
    for(int i=0;i<l.size();i++)
    {
        if(i+1==k)
        {
            return l.get(i);
        }
    }
      return 0;
    }
}
