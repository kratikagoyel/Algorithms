/**
 * Created by zeus on 4/20/2017.
 */
public class Tree<T> {
    int count=0;
    boolean isIdentical = true;
    //Count the leaf nodes in a tree
    int countLeaf(TreeNode root){
        if(root != null){
            if(root.left == null && root.right == null)
                count++;
            if(root.left!=null)
                countLeaf(root.left);
            if(root.right!=null)
                countLeaf(root.right);
        }
        return count;
    }

    //Two trees are identical or not
    boolean isIdentical(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null)
            return isIdentical;
        else if((root1 == null && root2!=null)||(root1!=null && root2==null))
            return isIdentical = false;
        else{
            while(root1!=null || root2!=null){
                if(root1.data != root2.data)
                   return isIdentical = false;
                isIdentical(root1.left, root2.left);
                isIdentical(root1.right, root2.right);
            }
        }
         return isIdentical;
    }
}
