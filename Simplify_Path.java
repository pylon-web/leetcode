class Solution {
    public String simplifyPath(String path) {
       
        Stack<String> stack=new Stack<>();
        String []ch=path.split("/");
        
        for(int i=0;i<ch.length;i++){
          
            if(!ch[i].equals(".") && !ch[i].equals("..") && !ch[i].equals("")){
                stack.push(ch[i]);
            }else if(ch[i].equals("..")){
                if(!stack.isEmpty())stack.pop();
            }
        }
       
        String str="";
        
        while(!stack.isEmpty()){
            String s=stack.pop();
            str="/"+s+str;
                   }
        
        return str.equals("")? "/":str;
    }
}
