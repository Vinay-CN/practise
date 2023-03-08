

import java.util.Scanner;


public class rev {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in); 
       int n=scanner.nextInt();   //0 1 2 3 4 5 6 7 8
       int[] arr=new int[n];
       for(int i=0;i<n;i++)
       {
            arr[i]=scanner.nextInt();
        }
        int i=n/2;
        int j=n-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k<n;k++)
        {
            System.out.print(arr[k]+" ");
        }

}
}
