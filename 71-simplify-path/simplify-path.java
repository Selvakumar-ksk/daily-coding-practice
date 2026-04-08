class Solution {
    public String simplifyPath(String path) {
       Stack<String> st=new Stack<>();
       String arr[]=path.split("/");
       for(String s:arr){
        if(s.equals(".")){
            continue;
        }else if(!st.isEmpty()&&s.equals("..")){
            st.pop();
        }else if(!s.equals("")&&!s.equals("..")){
            st.push(s);
        }
       }
       if(st.size()==0)return "/";
       System.out.println(st);
        StringBuilder sb=new StringBuilder("");
       while(!st.isEmpty()){
        sb.insert(0,st.pop());
        sb.insert(0,'/');
       }
       return sb.toString();
    }
}