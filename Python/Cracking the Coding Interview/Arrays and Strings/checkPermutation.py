'''
takes in two strings and determines if one is a permutation of
the other 

1) Check if both are equal length
2)

'''
def checkPermutation(s, t):
	if len(s) != len(t):
		print ("False")
		return False
	d = {}
	s = ''.join(sorted(s))
	t = ''.join(sorted(t))
	for i in range(len(s)-1):
		if s[i] != t[i]:
			print ("False")
			return False
	print("True")
	return True

s1 = 'asdfghjkl'
s2 = 'lkjhgdfsa'
checkPermutation(s1,s2)