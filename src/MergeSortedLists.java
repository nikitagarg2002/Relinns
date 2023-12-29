public class MergeSortedLists {
    public static void main(String[] args) {
    }
    public ListNode mergelists(ListNode l1, ListNode l2){
        if(l1==null) return l2; //if list1 is null
        if(l2==null) return l1; //if list2 is null
        if(l1.val>l2.val){
            ListNode temp = l1;
            l1=l2;
            l2=temp;
        }
        ListNode res = l1;
        while (l1!=null && l2!=null){
            ListNode tmp = null;
            while (l1!=null && l1.val<=l2.val){
                tmp=l1;
                l1=l1.next;
            }
            tmp.next=l2;

            ListNode temp = l2;
            l1=l2;
            l2=temp;
        }
        return res;
    }
}
  class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
