class Solution(object):
    def mergeAlternately(self, word1, word2):
        ans = str()
        word1_new = str()
        word2_new = str()
        len_lar = (max(len(word1), len(word2)))
        # print(len_lar)
        for i in range(0, len_lar):
            # print(len_lar)
            if (i < len(word1)) and (i < len(word2)):
                ans += word1[i]
                word1_new += word1[i]
                ans += word2[i]
                word2_new += word2[i]
                # print(i)
            elif (i >= len(word1)) or (i >= len(word2)):
                ans += word1[len(word1_new):]
                print(word1[len(word1_new):])
                # print(word1, word1_new)
                ans += word2[len(word2_new):]
                print(word2[len(word2_new):])
                break
            # print("he")
    
        return ans
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        