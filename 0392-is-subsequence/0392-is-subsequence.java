class Solution {
    public boolean isSubsequence(String s, String t) {
        int indexS=0;
        if(s.length()==0){
            return true;
        }
        for(int i=0;i<t.length();i++){
            if(s.charAt(indexS)==t.charAt(i)){
                indexS++;
            }
            if(indexS==(s.length())){
                return true;
            }
        }
        
        
        return false;
    }
}