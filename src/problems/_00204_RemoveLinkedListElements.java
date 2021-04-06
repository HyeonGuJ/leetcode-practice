package problems;

import com.structure.ListNode;

public class _00204_RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        ListNode result = null;
        ListNode temp = null;

        while (head != null) {
            if (head.val != val) {
                if (result == null) {
                    //first
                    result = new ListNode(head.val);
                    temp = result;

                } else {
                    ListNode newOne = new ListNode(head.val);
                    temp.next = newOne;
                    temp = newOne;
                }
            }
            head = head.next;

        }
        return result;
    }
}
