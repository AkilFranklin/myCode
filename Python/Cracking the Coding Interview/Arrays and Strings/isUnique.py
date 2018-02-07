'''
Will search through a string or any list type object and determine if all 
values in the list are unique.
'''
def isUnique(strng):
	if len(strng) ==0:
		return
	if len(strng)==1:
		return True
	d = {}
	for s in strng:
		if s in d:
			return False
		else:
			dict[s] = 1
	return True