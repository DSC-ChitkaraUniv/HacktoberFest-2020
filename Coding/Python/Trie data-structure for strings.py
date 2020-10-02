'''
    Trie data-structure for strings.
'''


#########################################################################

Trie = {}

def add(word):
    temp = Trie
    for ch in word:
        if ch not in temp:
            temp[ch] = [0, {}]
        temp[ch][0] += 1
        temp = temp[ch][1]

def remove(word):
    # Assumes word is in the Trie
    temp = Trie
    for ch in word:
        temp[ch][0] -= 1
        temp = temp[ch][1]

def count_prefix(prefix):
    # Counts number of inserted words with a given prefix
    temp = Trie
    n = 0
    for c in prefix:
        if c not in temp:
            return 0
        n = temp[c][0]
        if n == 0:
            break
        temp = temp[c][1]
    return n
#########################################################################






'''    Verification test    '''
if __name__ == "__main__":
    # Passed https://www.hackerrank.com/challenges/contacts/problem
    pass