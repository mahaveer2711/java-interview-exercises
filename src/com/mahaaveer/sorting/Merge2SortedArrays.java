package com.mahaaveer.sorting;

/**
 * Given two sorted arrays A[], B[], where A has enough buffer to hold B.
 * Merge B in to A in sorted order
 *
 * @author mahaaveer.
 */
public class Merge2SortedArrays {

    public static void mergeArrays(int[] A, int[] B, int lengthOfA, int lengthOfB){

        int idxA = lengthOfA - 1;
        int idxB = lengthOfB - 1;
        int idxMerged = lengthOfA + lengthOfB - 1;

        // Merge A & B, starting from the end (so that we don't have to re-arrange
        while (idxA >= 0 && idxB >= 0){

            // if elem(A) > elem(B)
            if(A[idxA] > B[idxB]){
                A[idxMerged] = A[idxA];
                idxMerged --;
                idxA--;
            }else{
                A[idxMerged] = B[idxB];
                idxMerged--;
                idxB--;
            }
        }

        // For cases where B is larger : copy remaining items
        while(idxB >= 0){
            A[idxMerged] = B[idxB];
            idxMerged--;
            idxB--;
        }

        // For cases where A is larger : items are already in place :P


    }

}
