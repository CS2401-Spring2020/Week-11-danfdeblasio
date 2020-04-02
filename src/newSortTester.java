
public class newSortTester {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] numbers = {7,-22,15,0,-8,0,12};
    System.out.print("Unsorted: ");
    printArr(numbers);
    newSorting.newSorting(numbers, 0);
    System.out.print("  Sorted: ");
    printArr(numbers);
  }
  
  public static void printArr(int[] arr) {
    for(int i=0;i<arr.length; i++) {
      if(i!=0) System.out.print(",");
      System.out.print(arr[i]);
    }
    System.out.println();
  }

}
