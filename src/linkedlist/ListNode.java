package linkedlist;
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode createNode(int[] nums, int index) {
        ListNode node = null;
        if (index < nums.length && nums[index]!= -1) {
            node = new ListNode(nums[index]);
            node.next = createNode(nums,  index + 1);
        }
        return node;
    }

    public void print(ListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
