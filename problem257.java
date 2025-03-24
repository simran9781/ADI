import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class problem257 {
    public void findpaths(TreeNode root, String path, List<String> ans)
    {
        if(root==null)
        {
            return;
        }

        path+=root.val;

        if(root.left!=null || root.right!=null)
        {
            path+="->";
        }

        if(root.left==null && root.right==null)
        {
            ans.add(path);
        }
        else
        {
            findpaths(root.left,path,ans);
            findpaths(root.right,path,ans);
        }
        path = path.substring(0,path.length()-1);
    }
    public List<String> binaryTreePaths(TreeNode root)
     {
        List<String> ans = new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        
        String path = "";

        findpaths(root,path,ans);
        return ans;
    }
}
