import javax.swing.tree.TreeNode;

public class problem112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
        {
            return false;
        }

        if(root.left==null && root.right==null)
        {
            return targetSum==root.val;
        }

        boolean leftsum = hasPathSum(root.left,targetSum-root.val);
        boolean rightsum = hasPathSum(root.right,targetSum-root.val);

        return leftsum || rightsum;
    }
}
