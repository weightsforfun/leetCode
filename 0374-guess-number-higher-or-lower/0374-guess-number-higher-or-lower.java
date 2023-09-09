/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start=0;
        int end=n;
        while(true){
            int middle=start+(end-start)/2;
            int result=guess(middle);
            if(result==0){
                return middle;
            }
            else if(result==-1){
                end=middle-1;
            }
            else{
                start=middle+1;
            }
        }
    }
}