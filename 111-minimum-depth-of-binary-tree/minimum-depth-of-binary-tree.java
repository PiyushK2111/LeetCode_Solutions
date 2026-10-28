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
    class Pair{
        TreeNode node;
        int depth;
        Pair(TreeNode node,int depth){
            this.node=node;
            this.depth=depth;
        }
    }
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        ArrayDeque<Pair> qu=new ArrayDeque<>();
        qu.offer(new Pair(root,1));
        while(qu.size()>0){
            Pair C=qu.poll();
            TreeNode node=C.node;
            int depth=C.depth;
            if(node.left==null && node.right==null){
                return depth;
            }
            if(node.left!=null){ 
                qu.offer(new Pair(node.left,depth+1));
            }
            if(node.right!=null){ 
                qu.offer(new Pair(node.right,depth+1));
            }       
        }
        return -122;
    }
}