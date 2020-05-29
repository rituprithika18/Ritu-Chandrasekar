public class prog2
{
    public static void main(String args[])
    {
        for(int i=1;i<=100;i++)
        {
            int t=i,r1,count=0;
            int s=i,r2,r3,count1=0;
            while(t!=0)
            {
                r1=t%10;
                t=t/10;
                if(r1==0)
                {
                    count++;
                }
                    
            }
            while(s!=0)
            {
                r2=s%10;
                r3=r2%10;
                if(r2==r3)
                {
                    count1++;
                }
                
            }
            if(count!=0)
            {
                System.out.println(i+"is a unique no");
            }
            else if(count1!=0)
            {
               System.out.println(i+"is a unique no"); 
            }
            else
            {
                System.out.println(); 
            }
        }
        
            
    }
}
    