class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        List<List<String>> sol=new ArrayList<>();
        Map<String, List<String>> map=new HashMap<>();
        
        for(String str:strs){
            
            char a[]=str.toCharArray();
            Arrays.sort(a);
            String st=new String(a);
            map.putIfAbsent(st,new ArrayList<>());
            map.get(st).add(str);
        }
        for(List<String> s1:map.values()){
            sol.add(s1);
        }
        
            
        
        return sol;
    }
}
