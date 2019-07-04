package com.NoCompany;

public class Main
{
    public static void Heapify(int A[], int heapsize, int i)
    {
        int maxIndex = i;
        int leftIndex = 2*i;
        int rightIndex = 2*i+1;

        if(leftIndex <=heapsize && A[leftIndex] > A[maxIndex]) // if the left child of mine is bigger than me
        {
            maxIndex = leftIndex; // then the max is the left
        }

        if (rightIndex <= heapsize && A[rightIndex] > A[maxIndex])
        {
            maxIndex = rightIndex;
        }

        // has the maxIndex changed?? if so we recursively adjust the tree
        if(maxIndex !=i)
        {
            int temp = A[i]; // take the value of index i
            A[i] = A[maxIndex]; // then change the value of index i to the max
            A[maxIndex] = temp;

            Heapify(A,heapsize,maxIndex);

        }

    }

    public static  void MakeHeap(int A[], int heapsize)
    {
        for (int i = heapsize/2;i>=1;i--)
        {
            Heapify(A,heapsize,i);
        }
    }

    public static void main(String[] args)
    {
        int A[] = {-1,4,5,3,7,8,1};
        MakeHeap(A,A.length-1);

        Print(A,A.length-1);
    }

    static void Print(int A[], int size)
    {
        for (int i =1;i<=size;i++)
        {
            System.out.print(A[i] +" ");
        }
    }

}
