package com.zhk.leetcode;

import java.util.ArrayList;
import java.util.List;
///**
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int add = 0;
        ListNode headNode=new ListNode(0);
        ListNode p1=l1;
        ListNode p2=l2;
        ListNode resNode = headNode;

        //ArrayList res = new ArrayList<ListNode>();

        while(p2!=null||p1!=null){
            int sum =0;
            sum=(p1==null?0:p1.val)+(p2==null?0:p2.val)+add;
            if(sum>=10){
                sum=sum-10;
                add=1;
            }else{
                add=0;
            }

            resNode.next = new ListNode(sum) ;
            resNode=resNode.next;
            //res.add(resNode);
                /*if(res.size()>=2){
                    ListNode pre = (ListNode) res.get(res.size()-2);
                    pre.next=resNode;
                }*/

            if(p1!=null)p1=p1.next;
            if(p2!=null)                p2=p2.next;




        }
        if(add>0){
            resNode.next=new ListNode(add);
        }

        return headNode.next;
    }
   public static void main(String[] args){
        ListNode l1= new ListNode(9);
     ListNode l2= new ListNode(9);
//       ListNode l3= new ListNode(3);
       l1.next=l2;
//       l2.next=l3;
       ListNode l4= new ListNode(5);
//       ListNode l5= new ListNode(6);
//       ListNode l6= new ListNode(4);
//       l4.next=l5;
//       l5.next=l6;
       ListNode res = new Solution().addTwoNumbers(l1,l4);
       while (res!=null){
           System.out.println(res.val + "next---->" + res.next);
           res=res.next;
       }

   }

}
