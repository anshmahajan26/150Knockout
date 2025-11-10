import java.util.HashMap; // to use HashMap
class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Step 1: if lengths are not same, it can't be isomorphic
        if (s.length() != t.length()) return false;

        // Step 2: Create 2 maps (like two small dictionaries)
        // mapST -> stores how s maps to t
        // mapTS -> stores how t maps to s
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        // Step 3: Loop through each character of both strings
        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i); // character from s
            char chT = t.charAt(i); // character from t

            // Step 4: Check mapping from s → t
            if (mapST.containsKey(chS)) {
                // if already mapped, check if it maps to the same character
                if (mapST.get(chS) != chT) {
                    return false; // if it maps to a different one, not isomorphic
                }
            } else {
                // if not mapped yet, add this new mapping
                mapST.put(chS, chT);
            }

            // Step 5: Check mapping from t → s
            if (mapTS.containsKey(chT)) {
                if (mapTS.get(chT) != chS) {
                    return false;
                }
            } else {
                mapTS.put(chT, chS);
            }
        }

        // Step 6: If we reach here, everything matches
        return true;
    }
    // Testing the function
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isIsomorphic("egg", "add"));   // true
        System.out.println(sol.isIsomorphic("foo", "bar"));   // false
        System.out.println(sol.isIsomorphic("paper", "title"));// true
    }
}
