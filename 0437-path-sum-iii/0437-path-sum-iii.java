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
    public int answer=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
        down(root,0L,targetSum);
        if(root.left!=null){
            pathSum(root.left,targetSum);
        }
        if(root.right!=null){
            pathSum(root.right,targetSum);
        }
        return answer;
    }
    public void down(TreeNode start,long sum,int targetSum){
        if(start==null){
            return ;
        }
        sum+=start.val;
        // System.out.println(start.val+"  "+sum);
        if(sum==targetSum){
            answer++;
        }
        if(start.left!=null){
            down(start.left,sum,targetSum);    
        }
        if(start.right!=null){
            down(start.right,sum,targetSum);
        }
        
    }
}