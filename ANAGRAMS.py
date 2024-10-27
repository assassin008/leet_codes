from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs):
        anagram_groups = defaultdict(list)
        
        for s in strs:
            sorted_str = ''.join(sorted(s))
            anagram_groups[sorted_str].append(s)
        
        return list(anagram_groups.values())
