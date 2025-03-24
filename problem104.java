public class problem104 {
     public int maxDepth(TreeNode root) {
        return height(root);   
    }
    private static int height(TreeNode node){
        if(node==null) return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        return 1 + Math.max(lh,rh);
    }
}
