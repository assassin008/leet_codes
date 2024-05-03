class Solution {
    public boolean isPalindrome(int x) {

    String s = Integer.toString(x);
    StringBuilder sb = new StringBuilder(s);
    sb.reverse();
    String reversed = sb.toString();
    return s.equals(reversed);
}

}