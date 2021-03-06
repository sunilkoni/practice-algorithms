package com.data.linkedlist;

import java.util.HashSet;
import java.util.PriorityQueue;

public class DuplicatesInLL {

	public static void main(String[] args) {
		LinkedNode head = new LinkedNode(1);
		head.next = new LinkedNode(2);
		head.next.next = new LinkedNode(3);
		head.next.next.next = new LinkedNode(4);
		head.next.next.next.next = new LinkedNode(3);
		head.next.next.next.next.next = new LinkedNode(5);
		head.next.next.next.next.next.next = new LinkedNode(1);
		head.next.next.next.next.next.next.next = new LinkedNode(6);
		
		System.out.println("Before Removing");
		LinkedNode.printLinkedList(head);
		head = removeDuplicates(head);
		System.out.println();
		System.out.println("After Removing");
		LinkedNode.printLinkedList(head);
	}

	private static LinkedNode removeDuplicates(LinkedNode head) 
	{
		HashSet<Integer> set = new HashSet<>();
		LinkedNode curr = head;
		LinkedNode pre = curr;
		
		set.add(curr.data);
		//head = pre;
		curr = curr.next;
		while(curr != null)
		{
			if(!set.add(curr.data)) 
			{
				curr =curr.next;
				pre.next = curr;
				
			}
			else
			{
				pre = curr;
				curr = curr.next;
			}
			
		}
		PriorityQueue<Integer> p = new PriorityQueue<>();
		p.offer(3);
		p.offer(1);
		p.offer(2);
		p.offer(4);
		p.offer(5);
		/*
		 * while (!p.isEmpty()) { System.out.println(p.remove()); }
		 */
		return head;
	}

}
