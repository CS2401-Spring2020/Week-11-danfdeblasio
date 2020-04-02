
public class newSorting {
    public static void newSorting(int[] A, int size) {
      // if |A| is one, already sorted, do nothing
      if(A.length <= 1) {
        return;
      }
      //If A has fewer elements than size: 
      else if(A.length < size) {
        // Sort A using recursive QuickSort
        quicksort(A, 0, A.length-1);
      }else {
        //split A into 2 arrays, note that if the length is odd, we put it in the second array 
        // (hence why they are both not |A|/2)
        int[] left = new int[A.length/2];
        int[] right = new int[A.length - (A.length/2)];
        splitUnsortedHalves(A, left, right);
        
        //call newSorting of left half of A
        newSorting(left, size);
        
        //call newSorting of right half of A
        newSorting(right, size);
        
        //call mergeSortedHalves on the two sorted halves of A
        mergeSortedHalves(A, left, right);
        
      }
    }
    
    public static void splitUnsortedHalves(int[] A, int[] left, int[] right) {
      // fill in the left array with the first |A|/2 elements
      for(int i=0; i<left.length; i++) {
        left[i] = A[i];
      }
      
      // fill in the right array with the remaining elements
      for(int j=0; j<right.length; j++) {
        right[j] = A[(A.length/2) + j];
      }
    }
    
    public static void mergeSortedHalves(int[] A, int[] left, int[] right) {
      int l = 0; 
      int r = 0;
      
      // put the smaller element in A[i] unless one of the indexes is out of bounds
      for(int i=0; i<A.length; i++) {
        if(l >= left.length || (l < left.length && r < right.length && left[l] > right[r])) {
          A[i] = right[r++];
        }else {
          A[i] = left[l++];
        }
      }
    }
    
    public static void quicksort(int[] A, int start, int end) {
      //base case for recursion
      if(start >= end) {
        return;
      }
      
      // find the pivot (defined as the middle point)
      int middle = start + (end-start)/2;
      int pivot = A[middle];
      
      // define the seperated sections at the begining and end (initially empty)
      int i = start;
      int j = end;
      
      // if we made a swap (i.e. i and j didn't meet) loop again
      boolean keepGoing = true;
      while(keepGoing) {
        keepGoing = false;
        
        // if elements are already on the correct side, move the pointers
        while(A[i] < pivot) i++;
        while(A[j] > pivot) j--;
        
        // i and j are on the wrong side of the array
        if(i < j) {
          int temp = A[i];
          A[i] = A[j];
          A[j] = temp;
          i++;
          j--;
          keepGoing = true;
        }
      }
      
      quicksort(A, start, j);
      quicksort(A, j+1 , end);
    }
    
}
