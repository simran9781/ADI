import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Tree{
    int val;
    Tree left;
    Tree right;

    Tree(int val){
        this.val= val;
        left = right=null;
    }
}
public class levelorder {
    public static List<List<Integer>> levelorder(Tree root){
            List<List<Integer>> res = new ArrayList<>();
            if(root==null)
            {
                return res;
            }
            Queue<Tree> q = new LinkedList<>();
            q.add(root);

            while(!q.isEmpty()){
                int levelsize = q.size();
                List<Integer> l = new ArrayList<>();
                for(int i=0;i<levelsize;i++){
                    Tree node = q.poll();
                    l.add(node.val);

                    if(node.left!=null){
                        q.add(node.left);
                    }
                    if(node.right!=null){
                        q.add(node.right);
                    }
                }
                res.add(l);
            }

            return res;
    }
    public static void main(String[] args) {
        Tree root = new Tree(3);
        root.left = new Tree(9);
        root.right = new Tree(20);
        root.right.left = new Tree (15);
        root.right.right = new Tree(7);

        System.out.println(levelorder(root));
    }
}
