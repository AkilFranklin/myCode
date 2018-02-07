def URLify(string, length):
    '''
    Takes a string, strips all trailing whitespace, and replaces all spaces with %20
    '''
    return string.rstrip().replace(' ', '%20')

s = "i am a cat    "
truth = 10

print (urlify(s,truth))
