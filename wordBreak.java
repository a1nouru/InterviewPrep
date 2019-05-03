/*
Given an input string and a dictionary of words, find out if the input string can be segmented into a space-separated sequence of dictionary words. See following examples for more details.
This is a famous Google interview question, also being asked by many other companies now a days.

Consider the following dictionary 
{ i, like, sam, sung, samsung, mobile, ice, 
  cream, icecream, man, go, mango}

Input:  ilike
Output: Yes 
The string can be segmented as "i like".

Input:  ilikesamsung
Output: Yes
The string can be segmented as "i like samsung" 
or "i like sam sung".
*/

class Solution {
    // visited keeps track of invalid substrings. 
    Set visited = new HashSet();
    public boolean wordBreak(String s, List<String> wordDict) {
        if(visited.contains(s)) return false;
        
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                
                int len = word.length();
                if (s.length() == len || wordBreak(s.substring(len), wordDict)) 
                    return true;
            }
        }
        visited.add(s);
        return false;
    }
}
