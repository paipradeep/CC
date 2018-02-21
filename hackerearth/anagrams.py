test = int(raw_input().strip())
while test!=0:
    test-=1
    myMap = {}
    s1 = list(raw_input().strip())
    s2 = list(raw_input().strip())
    for t in s1:
        if t not in myMap:
            myMap[t] = 1
        else:
            myMap[t] += 1
    for t in s2:
        if t not in myMap:
            myMap[t] = -1
        else:
            myMap[t] -=1
    #print myMap
    s = 0
    for t in myMap.values():
        s += abs(t)
    print s
