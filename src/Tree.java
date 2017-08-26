/**
 * Created by zeus on 4/20/2017.
 */
public class Tree<T> {
    int count=0;
    boolean isIdentical = true;
    static TreeNode<Integer> root;
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

    static void createTree(int element){
        if(root == null){
            root = new TreeNode<>();
         root.data = element;
         root.right = null;
         root.left = null;
        }
    }

    static void insetElement(int element){
        TreeNode<Integer> temp= root;
        if(root!=null){
            while (temp!=null) {
                if (element <= temp.data && (temp.left == null)) {
                    temp.left = createNode(element);
                    break;
                }else if((element > temp.data) && (temp.right == null)){
                    temp.right = createNode(element);
                    break;
                }else if(element <= temp.data && (temp.left != null)){
                    temp= temp.left;
                }else if((element > temp.data) && (temp.right != null)){
                    temp= temp.right;
                }
            }
        }else{
            createTree(element);
        }
    }
    static TreeNode<Integer> createNode(int element){
        TreeNode<Integer> temp1 = new TreeNode<>();
        temp1.data = element;
        temp1.left = null;
        temp1.right = null;
        return temp1;
    }

    static void print(TreeNode<Integer> root){
        //Inorder Traversal
        if(root.left!=null)
            print(root.left);
        System.out.println(root.data);
        if(root.right!=null)
            print(root.right);
    }
    static boolean findElement(int element){
        TreeNode<Integer> temp = root;
        boolean flag = false;
        while(temp!=null) {
            if (element == temp.data) {
                flag = true;
                break;
            } else if (element < temp.data) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return flag;
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
