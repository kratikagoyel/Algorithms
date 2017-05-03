/**
 * Created by zeus on 4/20/2017.
 */
public class Tree<T> {
    int count=0;
    //Count the leaf nodes in a tree
    int countLeaf(TreeNode root){
        if(root.left == null && root.right == null)
            count++;
        if(root.left!=null)
            countLeaf(root.left);
        if(root.right!=null)
            countLeaf(root.right);
        return count;
    }
}
