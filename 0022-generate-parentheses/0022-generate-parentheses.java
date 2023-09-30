import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer=new LinkedList<>();
        StringBuilder sb= new StringBuilder();
        Deque<Character> deq=new ArrayDeque<>();
        dfs(answer,sb,deq,n);
        return answer;
        
    }
    public void dfs(List<String> answer,StringBuilder sb,Deque<Character> deq,int n){
        if(sb.length()==2*n){
            if(deq.isEmpty()){
                answer.add(sb.toString());
                return ;
            }
            else{
                return;
            }
        }
        if(deq.isEmpty()){
            sb.append('(');
            deq.addLast('(');
            dfs(answer,sb,deq,n);
            deq.pollLast();
            sb.deleteCharAt(sb.length()-1);
        }
        else{
            sb.append(')');
            deq.pollLast();
            dfs(answer,sb,deq,n);
            deq.addLast('(');
            sb.deleteCharAt(sb.length()-1);
            
            sb.append('(');
            deq.addLast('(');
            dfs(answer,sb,deq,n);
            deq.pollLast();
            sb.deleteCharAt(sb.length()-1);
        }
    }
}