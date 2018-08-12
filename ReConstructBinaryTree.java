package com.niukebiancheng;

/**
*@Description: 重建二叉树
*@Author： dyy
*/
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x){
        val = x;
    }
}
public class ReConstructBinaryTree {
    public static void main(String[] args) {

    }
    //重建二叉树（pre为先序遍历数组，in为中序遍历数组）
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        //当先序、中序序列一个为空或先序和中序序列长度不一样时，则无法进行重建，返回null
        if(pre.length==0||in.length==0||pre.length!=in.length){
            return null;
        }
        //树的根节点（一定是先序遍历的第一个节点）
        TreeNode root = new TreeNode(pre[0]);
        //根据中序遍历将其划分为左子树和右子树的两个中序遍历
        //用来记录左子树序列的长度
        int len = 0;
        //在中序遍历中找根节点，来进行划分
        while (in[len]!=root.val){
            len++;
        }
        //新的先序遍历左子树
        int[] preLeft = new int[len];
        //新的中序遍历左子树
        int[] inLeft = new int[len];
        //新的先序遍历右子树
        int[] preRight = new int[pre.length-len-1];
        //新的中序遍历右子树
        int[] inRight = new int[in.length-len-1];
        //进行赋值操作
        for(int j = 0; j < in.length;j++){
            if(j<len){
                preLeft[j] = pre[j+1];
                inLeft[j] = in[j];
            }else if(j>len){
                preRight[j-len-1] = pre[j];
                inRight[j-len-1] = in[j];
            }
        }
        //分别在左右子树中进行递归
        root.left = reConstructBinaryTree(preLeft,inLeft);
        root.right = reConstructBinaryTree(preRight,inRight);
        return root;
    }
}
