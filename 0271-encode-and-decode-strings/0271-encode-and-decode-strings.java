public class Codec {
    
    HashMap<String,List<String>> hm=new HashMap<>();
   
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        
        hm.put(strs.toString() , strs);
        
        return strs.toString();
        
        
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        
        return hm.get(s);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));