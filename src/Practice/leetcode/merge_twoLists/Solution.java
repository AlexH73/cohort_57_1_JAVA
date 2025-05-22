package Practice.leetcode.merge_twoLists;

import java.util.LinkedList;

public class Solution {
    public ListNode mergeTwoList(ListNode list1, ListNode list2) {
        // Вспомогательный стартовый узел
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Пока оба списка не пусты
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Один из списков может не закончиться — добавляем остаток
        current.next = (list1 != null) ? list1 : list2;

        // Пропускаем dummy и возвращаем начало нового списка
        return dummy.next;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        Solution solution = new Solution();
        ListNode merged = solution.mergeTwoList(list1, list2);

        printList(merged);

    }
}
