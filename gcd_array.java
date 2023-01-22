
class Solution {
    public static int solve(int N, int K, int[] arr) {
        int resultGCD=1;
        int sum=0;
        int i=0;
        for(;i<N;i++)
        {
            sum+=arr[i];
        }

        ArrayList<Integer> arrDivisor=getAllDivisor(sum);
        int count=0,arrSum=0;

        for(int itemArrDivisor:arrDivisor)
        {
            count=0;arrSum=0;
            for(i=0;i<N;i++)
            {
                arrSum+=arr[i];
                if(arrSum%itemArrDivisor==0)
                {
                    count++;
                }
            }
            if(count>=K)
            {

                resultGCD=Math.max(resultGCD,itemArrDivisor);

            }

        }

        return resultGCD;
    }
        public static ArrayList<Integer> getAllDivisor(int number)
    {
         ArrayList<Integer> resultList=new ArrayList<>();
        int i=1;
        int upperLimit=(int)Math.sqrt(number);
        for(;i<=upperLimit;i++)
        {
            if(number%i==0)
           {
             resultList.add(i);
            }
        }
        for(;i>=1;i--)
        {
            if(number%i==0 && (number/i)>i)
            {
                resultList.add(number/i);
            }
        }

        return resultList;

    }
}
     
