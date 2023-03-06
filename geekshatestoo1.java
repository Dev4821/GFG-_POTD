
public static int noConseBits(int n) {

        int count=0;

        String str=Integer.toBinaryString(n);

        StringBuilder sb = new StringBuilder(str);

        int len=str.length();

        for(int i=0;i<len;i++){

            if(str.charAt(i)=='0'){

                count=0;

                continue;

            }

            else{

                count++;

                if(count==3){

                    count=0;

                    sb.setCharAt(i,'0');

                }

            }

        }

        return Integer.parseInt(sb.toString(),2);

    }
        
