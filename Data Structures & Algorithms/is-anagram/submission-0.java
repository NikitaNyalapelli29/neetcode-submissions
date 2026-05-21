class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        StringBuilder st = new StringBuilder(t);

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            int index = st.indexOf(String.valueOf(ch));

            if (index == -1)
                return false;

            st.deleteCharAt(index);
        }

        return true;
    }
}