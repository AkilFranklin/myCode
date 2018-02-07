def oneAway(s1, s2):
	for s in range(0,len(s1)):
		if s1[s] in s2:
			s2 = s2.replace(s1[s], '')
			print (s2)
	if len(s2) > 1:
		return False
	else:
		return True

		'''
		works, needs the intial tests, size check, blank, etc.
		'''