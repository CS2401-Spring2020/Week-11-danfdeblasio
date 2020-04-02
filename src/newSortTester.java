import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

public class newSortTester {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] numbers = {7,-22,15,0,-8,0,12};
    System.out.print("Unsorted: ");
    printArr(numbers);
    newSorting.newSorting(numbers, 3);
    System.out.print("  Sorted: ");
    printArr(numbers);
  }
  
  @Test
  public void oneItem(){
    int[] numbers = {7};
    int[] numbers_sorted = {7};
    newSorting.newSorting(numbers, 5);
    assertArrayEquals(numbers_sorted, numbers);
  }
  
  @Test
  public void allQuick(){
    int[] numbers = {7,-22,15,0,-8,0,12};
    int[] numbers_sorted = {-22,-8,0,0,7,12,15};
    newSorting.newSorting(numbers, numbers.length+1);
    assertArrayEquals(numbers_sorted, numbers);
  }
  
  @Test
  public void allMerge(){
    int[] numbers = {7,-22,15,0,-8,0,12};
    int[] numbers_sorted = {-22,-8,0,0,7,12,15};
    newSorting.newSorting(numbers, 0);
    assertArrayEquals(numbers_sorted, numbers);
  }
  
  @Test
  public void reverse(){
    int[] numbers = {15,12,7,0,0,-8,-22};
    int[] numbers_sorted = {-22,-8,0,0,7,12,15};
    newSorting.newSorting(numbers, numbers.length/2);
    assertArrayEquals(numbers_sorted, numbers);
  }
  
  
  @Test
  public void alreadySorted(){
    int[] numbers = {-22,-8,0,0,7,12,15};
    int[] numbers_sorted = {-22,-8,0,0,7,12,15};
    newSorting.newSorting(numbers, numbers.length/2);
    assertArrayEquals(numbers_sorted, numbers);
  }
  
  @Test
  public void allNeg(){
    int[] numbers = {-7,-22,-15,-1,-8,-28,-12};
    int[] numbers_sorted = {-28, -22, -15, -12, -8, -7, -1};
    newSorting.newSorting(numbers, numbers.length/2);
    assertArrayEquals(numbers_sorted, numbers);
  }
  
  @Test
  public void sameNumber(){
    int[] numbers = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
    int[] numbers_sorted = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
    newSorting.newSorting(numbers, numbers.length/2);
    assertArrayEquals(numbers_sorted, numbers); 
  }
  
  public static void printArr(int[] arr) {
    for(int i=0;i<arr.length; i++) {
      if(i!=0) System.out.print(",");
      System.out.print(arr[i]);
    }
    System.out.println();
  }

}
