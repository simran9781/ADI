import javax.swing.tree.TreeNode;

public class problem98 {
    public boolean checkbst(TreeNode root,long min,long max)
    {
        if(root==null)
        {
            return true;
        }

        if(root.val<=min || root.val>=max)
        {
            return false;
        }

        return checkbst(root.left,min,root.val) && checkbst(root.right,root.val,max);
    }
    public boolean isValidBST(TreeNode root) {
        return checkbst(root,Long.MIN_VALUE,Long.MAX_VALUE);
        
    }
}
