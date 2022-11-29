/**
 * ArmStrong_Number
 */
public class ArmStrong_Number 
{

    public static void main(String[] args)
    {
        int num=1000;//15,1,0
        int sum=0;
        int count=0; //1,2,3
        int temp=num;
        while(num!=0)
        {
            count++;
         num=num/10;
        }
        num = temp;
        while(num!=0)   // 153      15 
        {
            int lastDigit = num%10;     // 3 ,      5      
            int exp = 1;    //
            for (int i = 0; i < count; i++)
            {
                exp = exp*lastDigit;    //1*3 = 3 ; 3*3 = 9 ; 9*3 = 27          // 1*5 =5; 5*5=25; 25*5=125;
            }
            sum = sum+exp; // 0+27 = 27 ;       27+125=152
            num = num/10;//15       1
        }
        num = temp;
        if(num==sum)
        {
            System.out.println("Armstrong number");
        }
        else
            System.out.println("not Armstrong number");
    }   
}