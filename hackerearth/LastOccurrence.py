t = int(raw_input().strip())
while t!=0:
    t -= 1
    n = int(raw_input().strip())
    arr = map(int,raw_input().strip().split())
    myDict = {}
    for i in range(n):
        myDict[arr[i]] = i
    q = int(raw_input().strip())
    while q!=0:
        q -= 1
        inp = int(raw_input().strip())
        if inp in myDict:
            print myDict[inp]+1
        else:
            print -1
        
        
