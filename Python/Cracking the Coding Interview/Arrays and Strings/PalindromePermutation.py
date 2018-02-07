from collections import Counter
def palindromePermutation(string):
	counter = Counter(string.lower())
    odds = [letter for letter in counter
            if letter.isalpha() and counter[letter] % 2 == 1]
    return len(odds) <= 1