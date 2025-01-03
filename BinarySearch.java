/*To implement binary search algorihtm using java*/

import java.util.Scanner;
import java.util.Arrays;

public class Binarysearch {
  static void Binary(int low,int up,int key) {
    int mid;
    int flag = 0,index = 0;
    while (low <= up) {
      mid=(low + up)/2;
      if (ar[mid] == key) {
        flag = 1;
        index = mid + 1;
        break;
      }
      else if (ar[mid] < key) {
        low = mid + 1;
      }
      else {
        up = mid - 1;
      }
    }
    if (flag == 1) {
      System.out.println("Element found at position " + index);
    }
    else {
      System.out.println("Element not found");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number of Elements : ");
    int n = sc.nextInt();
    int[] ar = new int[n];
    System.out.println("Enter "+ n +" Elements to the array : ");
    for(int i=0; i<n; i++) {
      ar[i] = sc.nextInt();
    }
    Array.sort(ar);
    System.out.print("Enter Search Element : ");
    int key = sc.nextInt();
    Binary(ar,0,n-1,key);
    sc.close();
  }
}
