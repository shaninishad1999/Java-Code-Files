import java.util.Scanner;
class NarcissisticNumber {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
          int n = obj.nextInt();
       int num,sum=0,k,count=0;
        for (int i = 1; i <= n; i++) {
             num = i;   
            sum = 0;   
            k = num;   
	count++;
        while (k != 0) {
                int digit = k % 10;       
                sum=sum+ digit * digit * digit;  
                k /= 10;                
            }

            if (sum == num) {
                System.out.println(num);
	
            }
        }
        
  System.out.println("count loop : "+count);
    }
}
