package tree;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static int[] str2Array(String str) {
        if (str != null) {
            String[] strings = str.split(",");
            return Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
        }
        return null;
    }


    public static TreeNode inputTreeNode() {
        TreeNode node = null;
        while (node == null) {
            node = new TreeNode();
            Scanner scanner = new Scanner(System.in);
            String str =  scanner.nextLine();
            int[] nums = str2Array(str);
            node = node.createTree(nums, 0);
        }
        return node;
    }

    public static void main(String[] args) {
        System.out.println("input:");
        TreeNode node1 = inputTreeNode();
        TreeNode node2 = inputTreeNode();
        System.out.println("output:");
        boolean res = new Solution().isSameTree(node1, node2);
        System.out.println(res);
    }

}

class Solution {
    public  boolean isSameTree(TreeNode p, TreeNode q) {
        if (p== null && q== null) {
            return true;
        }
        if (p== null || q== null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}


