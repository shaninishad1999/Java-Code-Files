import java.util.Scanner;
class Solution {
    public boolean isHappy(int n) {
        
       int num=n;
       int s=0;
       while(num!=0)
       {
        int d=num%10;
        s=s+d*d;
        num/=10;
       }
      int k=s,r=0;
      while(k!=0)
      {
         int d=k%10;
        r=r+d*d;
        k/=10;
      }
      int m=r;
      int x=0;
      while(m!=0)
      {
        int d=m%10;
        x=x+d*d;
        m/=10;
      }
      int p=x;
      int y=0;
      while(p!=0)
      {
        int d=p%10;
        y=y+d*d*d;
        p/=10;
      }

    if(n==y)
    {

      return true;
    }
    else
    {
        return false;
    }


    }
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
int s=obj.nextInt();
System.out.prntln(isHappy(s));


}
}

