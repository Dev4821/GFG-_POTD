
class Solution {
    public int maxInstance(String s) {
          
        int countb=0,counta=0,countl=0,counto=0;
        
        for(char c: s.toCharArray()){
            
            if(c=='b'){
                countb++;
            }else if(c=='a'){
                counta++;
            }
            else if(c=='l'){
                countl++;
            }
            else if(c=='o'){
                counto++;
            }
        }
        
        return Math.min(Math.min(countb,counta),Math.min(countl/2,counto/2));
    }
}
