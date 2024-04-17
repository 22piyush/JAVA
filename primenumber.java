public class primenumber {

    public static void main(String[] args) 
    {
        
        int n=9;
        boolean value=false;

        for(int i=2; i<=n;i++)
        {
            if(n%i==0)
            {
                value=true;
                break;

            }
        }
        if(value)
        {
            System.out.println("prime number");
        }
       else{
            System.out.println("not prime");
        }
    }

   
}
