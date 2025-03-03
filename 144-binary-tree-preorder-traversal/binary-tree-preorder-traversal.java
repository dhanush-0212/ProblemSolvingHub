/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> ans=new ArrayList<>();
        if(root == null){return ans;}
        TreeNode head=root;
        Stack<TreeNode> stck=new Stack<>();
        stck.push(head);
        while(!stck.isEmpty()){
            TreeNode num=stck.pop();
            ans.add(num.val);
            if(num.right!=null){stck.push(num.right);}
            if(num.left != null){stck.push(num.left);}
        }
        return ans;
    }
}