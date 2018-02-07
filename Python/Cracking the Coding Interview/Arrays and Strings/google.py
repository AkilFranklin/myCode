def searchForSubstring(searchString, stringToSearchIn, index = 0):
    if len(searchString) == 0:
        raise BaseException("Search string is empty!")
    if len(stringToSearchIn) == 0:
        raise BaseException("String to search is empty!")
    if len(searchString) > len(stringToSearchIn):
        raise BaseException("The search string is larger than the string to search in!")
    if len(searchString) == len(stringToSearchIn):
        if searchString != stringToSearchIn:
            raise BaseException("Search string is not a substring of the string to search in!")
    for i in searchString:
        if i == stringToSearchIn[0]:
            if searchString == stringToSearchIn[0:len(searchString)]:
                print (index)
                return index
        else:
            index+=1
            searchForSubstring(searchString, stringToSearchIn[1:], index)

searchForSubstring("gle", "google")