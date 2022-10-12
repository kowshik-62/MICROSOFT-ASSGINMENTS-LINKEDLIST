class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        else{
            return Symmetric(root.left,root.right);
        }
    }

    public boolean Symmetric(TreeNode left,TreeNode right){
        if(left==null && right==null){
            return true;
        }
        else if(left==null || right==null){
            return false;
        }
        else{
            if(left.val==right.val){
                boolean first = Symmetric(left.left,right.right);
                boolean second = Symmetric(left.right,right.left);
                return first && second;
            }
            return false;
        }
    }
}
