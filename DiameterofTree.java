public class DiameterofTree {
    static int diameter = 0;

    public static int dbot(Tree node){
        height(node);
        return diameter;

    }
    private static int height(Tree root){
        if(root==null){
            return  0;
        }
        int lefth = height(root.left);
        int righth = height(root.right);

        diameter = Math.max(diameter,lefth+righth);
        return 1+Math.max(lefth,righth);
    }
    public static void main(String[] args) {
        Tree root= new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        System.out.println(dbot(root));
    }
}
