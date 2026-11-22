class Solution {
public boolean isAnagram(String s, String t) {
    int[][] arr = new int[26][2];

    if (s == null || t == null || s.length() != t.length()) {
        return false;
    }

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);

        arr[c - 'a'][0]++;
    }

    for (int i = 0; i < s.length(); i++) {
        char c = t.charAt(i);

        arr[c - 'a'][1]++;
    }
    
    for (int i = 0; i < 26; i++) {
        if (arr[i][0] != arr[i][1]) {
            return false;
        }
    }

    return true;

}
}
