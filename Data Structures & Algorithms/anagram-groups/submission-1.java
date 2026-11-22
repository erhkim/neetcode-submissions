class Solution {
public List<List<String>> groupAnagrams(String[] strs) {
    // 26 arr
    // create sequence list
    // map sequence string to list

    Map<String, List<String>> map = new HashMap<>();

    int[] arr = new int[26];

    for (var s : strs) {
                Arrays.fill(arr, 0);

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sb.append((char) ('a' + i));
                sb.append(arr[i]);
            }
        }

        var l = map.get(sb.toString());
        if (l == null) {
            map.put(sb.toString(), new ArrayList<>(List.of(s)));
        } else {
            l.add(s);
        }
    }

return map.values().stream().toList();}
}
