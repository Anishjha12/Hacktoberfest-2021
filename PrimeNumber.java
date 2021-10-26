public class PrimeNumber{    
    static void checkPrime(int n)
    {  
        int i,l=0,flag=0;      
        l=n/2;
        if(n==0||n==1)
        {  
        System.out.println(n+" is not a prime number");      
        }
        else
        {  
        for(i=2;i<=l;i++)    // l is half of the given number, divisibility of numbers 2-l is checked with n
        {      
        if(n%i==0)
        {      
            System.out.println(n+" is not a prime number");      
            flag=1;      
            break;      
        }      
        }      
        if(flag==0) 
        { 
            System.out.println(n+" is a prime number"); 
        }  
        }
    }  
    public static void main(String args[])
    {    
    checkPrime(5);  
    checkPrime(4);  
    checkPrime(15);  
    checkPrime(3);  
    }    
  }   
