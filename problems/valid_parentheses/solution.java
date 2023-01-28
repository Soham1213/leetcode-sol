class Solution {
    public boolean isValid(String s) {
        Stack<Character> p = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                p.push(s.charAt(i));
            } else {
                if (s.charAt(i) == ')')  {
                    if (p.isEmpty() || p.pop() != '(') {
                        return false;
                    }
                } 
                if (s.charAt(i) == '}') {
                    if (p.isEmpty() || p.pop() != '{') {
                        return false;
                    }
                } 
                if(s.charAt(i) == ']') {
                    if (p.isEmpty() || p.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        return p.isEmpty();
        
    }
}