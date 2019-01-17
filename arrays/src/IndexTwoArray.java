import java.util.*;

class IndexTwoArray
{
  public static void main(String args[])
    {
	  Scanner scan = new Scanner(System.in);
	  int a,b,c=0;
	  int arr[]= new int[5];
	  System.out.println(" any 5 integer nos.");
	  for(a=0;a<5;a++)
	    {
		  arr[a]= scan.nextInt();
		}
	  System.out.println(" enter the number for index to be found ");
	  b=scan.nextInt();
	  System.out.println(" the elements are");
	  for(a=0;a<5;a++)
		{
		  System.out.println(arr[a]);
		}
	  System.out.println("Index :");
	  for(a=0;a<5;a++)
		{
		  if(arr[a]==b)
			{
			  System.out.println(a);
			  c++;
			}
		}

		  if(c==0)
	  System.out.println("-1");
	}
} 