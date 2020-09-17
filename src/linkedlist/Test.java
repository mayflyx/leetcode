package linkedlist;

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


    public static ListNode inputListNode() {
        ListNode node = null;
        while (node == null) {
            node = new ListNode();
            Scanner scanner = new Scanner(System.in);
            String str =  scanner.nextLine();
            int[] nums = str2Array(str);
            node = node.createNode(nums, 0);
        }
        return node;
    }

    public static void main(String[] args) {
        System.out.println("input:");
        ListNode node = inputListNode();
        System.out.println("output:");
        node.print(node);
    }

}