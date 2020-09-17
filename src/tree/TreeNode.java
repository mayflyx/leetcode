package tree;

import java.util.Arrays;
import java.util.Scanner;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode createTree(int[] nums, int index) {
      TreeNode node = null;
      if (index < nums.length && nums[index]!= -1) {
          node = new TreeNode();
          if (node == null) {
              return null;
          }
          node.val = nums[index];
          node.left = createTree(nums, 2 * index + 1);
          node.right = createTree(nums, 2 * index + 2);
      }
      return node;
    }

    public void print(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        print(node.left);
        print(node.right);
    }


}


