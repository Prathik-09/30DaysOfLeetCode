class Solution {
    public char getVal(char ch){
        switch(ch){
            case ')':return '(';
            case ']':return '[';
            case '}':return '{';
            default:return ' ';
        }
    }
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        String open="[{(";
        String close="]})";
        for(char ch:s.toCharArray()){
            if(open.indexOf(ch)!=-1){
                st.push(ch);
            }
            else{
                if(st.size()==0){
                    return false;
                }
                char t=st.pop();
                if(getVal(ch)!=t){
                    return false;
                }
            }
        }
        return st.size()==0;
    }
}
