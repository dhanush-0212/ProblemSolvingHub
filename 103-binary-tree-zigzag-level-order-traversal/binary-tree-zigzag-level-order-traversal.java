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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        
        Queue<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        boolean zigzag=false;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(zigzag) temp.add(0,curr.val);
                else temp.add(curr.val);

                if(curr.left !=null){
                    q.add(curr.left);
                }
                if(curr.right !=null){
                    q.add(curr.right);
                }
                
            }
            //if(pos%2!=0) Collections.sort(temp,(a,b)->b-a);
            list.add(new ArrayList<>(temp));
           zigzag=!zigzag;
        }
        return list;
    }
}