package com.amey.problems;

/*
* Rearrange an Array with Duplicates into Consecutive Sequences / Chains
* c = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5
* The goal is to rearrange the elements so that duplicates are separated and consecutive
* increasing sequences are formed (e.g., 1, 2, 3, 4, 5, followed by 2, 3, 4, 5, etc.).
* */

public class RearrangeArray {
    public static void main(String[] args) {
/*        int[] a = new int[10];
        a[0]=0;
        a[1]=1;
        a[2]=2;
        a[3]=3;
        a[4]=4;*/

/*        int[][] b = new int[10][10];
        b[0][0]=0;
        b[0][1]=2;*/

      //  System.out.println(b[0][0]);
        int[] c = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};

        for(int i=0; i< c.length-1; i++){
           if(c[i]+1 != c[i+1])
           {
               for(int j = i+1 ; j< c.length-2; j++){
                   if(c[i]+1 != c[j+1]){
                       continue;
                   }
                   else {
                       int temp = c[i+1];
                       c[i+1] = c[j+1];
                       c[j+1] = temp;
                       continue;

                   }
               }
           }
        }
        System.out.println("--------------------------------------");
        for (int j : c) {
            System.out.print(j + " ");
        }

    }
}
