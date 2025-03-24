public class PrimeSeive {
    public static void main(String[] args) {
        //what is Prime Sieve?
        //The prime seive is an algo to efficiently generate all the prime numbers upto a specified limit N.

        //Steps:
        //1.Create a boolean array isPrime[] where each index represent if the number is prime
        //2.Initially mark all the numbers from 2 to N as true
        //3.Starting from the first prime(2) mark all multiples of 2 as false
        //4.Move to the next number that is still mark true, and mark its all multiples as false
        //5.Continue this until you reached square root of N.
        int s = 0;
        int n = 10;
        System.out.println(countP(s, n));
    }
    public static void Sieve(int n)
    {
        boolean[] isprime = new boolean[n+1];
        for(int i=0;i<=n;i++)
        {
            isprime[i] = true;
        }   

        isprime[0] = isprime[1] = false;

        for(int p=2;p*p<=n;p++)
        {
            if(isprime[p])
            {
                for(int i = p*p;i<=n;i+=p)
                {
                    isprime[i]= false;
                }
            }
        }

        System.out.println("Prime numbers upto :"+n+" :");
        for(int i=2;i<=n;i++)
        {
            if(isprime[i])
            {
                System.out.print(i+" ");
            }
        }
    }
    public static int countP(int l,int r)
    {
        int[] prime = new int[r+1];
        for(int i=0;i<=r;i++)
        {
            prime[i]=1;
        }

        prime[0]=prime[1]=0;

        for(int i=2;i*i<=r;i++)
        {
            if(prime[i]==1)
            {
                for(int j = i*i;j<=r;j+=i)
                {
                    prime[j]=0;
                }
            }
        }

        int count=0;
        for(int i=l;i<=r;i++)
        {
            if(prime[i]==1)
            {
                count++;
            }
        }

        return count;
    }
}
