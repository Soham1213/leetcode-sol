class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<ransomNote.length();i++)
        {
            if(!map.containsKey(ransomNote.charAt(i)))
            {
                map.put(ransomNote.charAt(i),1);
            }
            else {
                map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i))+1);
            }
        }
        
        for(int i=0;i<magazine.length();i++)
        {
            if(map.containsKey(magazine.charAt(i)))
            {
                int value=map.get(magazine.charAt(i));  
                if(value==1)
                {
                    map.remove(magazine.charAt(i));
                }
                else
                {
                    
                    map.put(magazine.charAt(i), map.get(magazine.charAt(i)) - 1);
                }

                if (map.isEmpty()) {
                    return true;
                }

            }
        }
        return false;
    }
}
