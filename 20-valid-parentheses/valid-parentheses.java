class Solution {
    public boolean isValid(String s) {
        /*Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='['||ch=='{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if(ch==')' && top!='('){
                    return false;
                }
                if(ch=='}' && top!='{'){
                    return false;
                }
                if(ch==']' && top!='['){
                    return false;
                }
            }
        }
        return stack.isEmpty();*/
        int length=-1;
        while(s.length()!=length){
            length=s.length();
            s=s.replace("()","");
            s=s.replace("{}","");
            s=s.replace("[]","");
        }
        return s.isEmpty();
    }
}