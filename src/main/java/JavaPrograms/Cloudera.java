package JavaPrograms;

public class Cloudera {/*
Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:

'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).
"", "aaaa" "a*" -> True
*/
/*
Example 1:

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
Example 2:

Input: s = "b", p = "*"
Output: true
Explanation: '*' matches any sequence.
Example 3:

Input: s = "cb#$%^&", p = "?b"
Output: false
Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.
Example 4:

Input: s = "adceb", p = "*a*b"
Output: true
Explanation: The first '*' matches the empty sequence, while the second '*' matches the substring "dce".
Example 5:

Input: s = "acdcb", p = "a*c?b"
Output: false
*/
 //   s="", p="*";

        public static void main(String[] args){

            String s = "adceb";
            String p = "*a*b";

            System.out.println(checkPattern(s, p));
        }

        public static boolean checkPattern(String s, String p){

            int pIdx =0;
            int sIdx =0;
            int lastStarIdx = -1;
            int lastSIdxChecked = -1;

            char sChar, pChar;
            // Input: s = "adceb", p = "*"

            while(sIdx < s.length()){

                if (pIdx >= p.length()){
                    if (lastStarIdx == -1)
                        return false;
                    pIdx = lastStarIdx;
                    sIdx = lastSIdxChecked + 1;
                }

                sChar = s.charAt(sIdx);
                pChar = p.charAt(pIdx);

                if (pChar == '*'){
                    lastStarIdx = pIdx;

                    while(pIdx+1 < p.length() && p.charAt(pIdx+1) == '*'){
                        pIdx++;
                        lastStarIdx = pIdx;
                    }
                    //check for other than star values
                    if (pIdx == p.length()-1)
                        return true;
                    while (sIdx < s.length() && s.charAt(sIdx) != p.charAt(pIdx+1) && p.charAt(pIdx+1) != '?'){
                        sIdx++;
                    }
                    lastSIdxChecked = sIdx;
                    pIdx++;
                }

                else if (pChar == '?' || pChar == sChar){
                    pIdx++;
                    sIdx++;
                } else {
                    if (lastStarIdx == -1)
                        return false;
                    pIdx = lastStarIdx;
                    sIdx = lastSIdxChecked + 1;
                }
            }
            while(pIdx < p.length() && p.charAt(pIdx) == '*') pIdx++;
            return pIdx >= p.length();
        }
    }
