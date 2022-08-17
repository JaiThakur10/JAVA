import java.util.*;
class numberwords 
{
    public static void main(String args [])
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number (3-digit number )");
        int n=in.nextInt();
        if(n<1 ||n>999) 
            System.out.println("Wrong Input,Sorry");
        else
        {
            int u=n%10;
            int tt=n/10;
            int t=tt%10;
            int h=n/100;
            int a=n%10;
            String uw[]={" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
            String tw[]={" ","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
            String hw=" Hundred ";
            String aw[]={" ","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
            if(t==1 && a>=1 && a<=9)
                System.out.println(uw[h]+hw+aw[a] );
            else 
                System.out.println(uw[h]+hw+tw[t]+" "+uw[u]);
        }
    }
}
    