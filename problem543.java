import javax.swing.tree.TreeNode;

public class problem543 {
     public int height(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left,right)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        {
            return 0;
        }

        int d1 = diameterOfBinaryTree(root.left);
        int d2 = diameterOfBinaryTree(root.right);
        int d3 = height(root.left)+height(root.right);

        return Math.max(d1,Math.max(d2,d3));
        
    }
}
