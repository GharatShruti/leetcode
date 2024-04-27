class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Check if either list is empty
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        // Determine the head of the merged list
        ListNode head;
        if (list1.val < list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }

        // Traverse both lists and merge them
        ListNode current = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Attach the remaining nodes of either list, if any
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Return the head of the merged list
        return head;
    }
}
