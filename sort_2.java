package leetcode;

class ListNode{
	ListNode  next;
	int val;
	ListNode(int val){this.val=val;}
}

public class sort_2 {
	 public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode c1 = l1;
	        ListNode c2 = l2;
	        ListNode sentinel = new ListNode(0);
	        ListNode d = sentinel;
	        int sum = 0;
	        while (c1 != null || c2 != null) {
	            sum /= 10;
	            if (c1 != null) {
	                sum += c1.val;
	                c1 = c1.next;
	            }
	            if (c2 != null) {
	                sum += c2.val;
	                c2 = c2.next;
	            }
	            d.next = new ListNode(sum % 10);
	            d = d.next;
	        }
	        if (sum / 10 == 1)
	            d.next = new ListNode(1);
	        return sentinel.next;
	 }
	 ListNode first;
	 public sort_2(){
		 this.first=null;
	 }
	 public void addnode(int data){
		 ListNode node=new ListNode(data);
		 node.next=first;
		 first=node;
		 
	 }

	public static void main(String[] args) {
		sort_2 listnode1 = new sort_2();
		listnode1.addnode(2);
		listnode1.addnode(4);
		listnode1.addnode(3);
		sort_2 listnode2 = new sort_2();
		listnode2.addnode(5);
		listnode2.addnode(6);
		listnode2.addnode(4);
		ListNode node = addTwoNumbers(listnode1.first, listnode2.first);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

}
