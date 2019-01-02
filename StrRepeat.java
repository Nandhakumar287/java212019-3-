import java.io.*;
import java.util.*;
  public class StrRepeat{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter String:");
      String str=sc.next();
      int Count=0,c=0,l;
      char Max='\0';
	  l=str.length();
	  System.out.println("String length="+l);
        for(int i=0;i<l;i++)
          {
            for(int j=i+1;j<l;j++)
              {
                if(str.charAt(i)==str.charAt(j))
                  {
                    Count++;
                  }
              }
              if(Count>c)
              {
                Max=str.charAt(i);
                c=Count;
                Count=0;
              }
          }
          System.out.println("Ans:"+Max);
     }
  }   
