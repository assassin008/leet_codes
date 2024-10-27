from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs):
        anagram_groups = defaultdict(list)
        
        for s in strs:
            count = [0] * 26  # Count for each letter a-z
            for char in s:
                count[ord(char) - ord('a')] += 1  # Increment the count based on character
            
            anagram_groups[tuple(count)].append(s)  # Use tuple of counts as key
        
        return list(anagram_groups.values())