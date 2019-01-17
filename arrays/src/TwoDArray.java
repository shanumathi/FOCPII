import java.util.Scanner;

public class TwoDArray
{
  public static void main(String args[])
  {
	   
    int x,y,row,col;
    int arr[][] = new int[10][10];
    Scanner scan = new Scanner(System.in);
	   
       
    System.out.print("Enter row (max 10) : ");
    row = scan.nextInt();
    System.out.print("Enter column (max 10) : ");
    col = scan.nextInt();
	   
       
    System.out.println("Enter " +(row*col)+ " Array Elements : ");
    for(x=0; x<row; x++)
    {
        for(y=0; y<col; y++)
      {
          arr[x][y] = scan.nextInt();
      }
    }
	   
       
    System.out.print("Array is :\n");
     for(x=0; x<row; x++)
    {
      for(y=0; y<col; y++)
      {
       System.out.print(arr[x][y]+ "  ");
      }
        System.out.println();
      }

    System.out.println("now the  Array is : ");
      for(x=0;x<row;x++)
      {
        for(y=0;y<col;y++)
      {
        if(arr[x][y]%2==0)
          {
            System.out.print(arr[x][y]+ "  ");
          }
        else
          {
            System.out.print((arr[x][y]*2)+ "  ");
          }       
      }
    System.out.println();
      }   
   }
}