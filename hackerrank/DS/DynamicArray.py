n,k = map(int,raw_input().strip().split())
sequence = []
lastans = 0
for i in range(n):
    p = []
    sequence.append(p)
for i in range(k):
    q,x,y = map(int,raw_input().strip().split())
    if(q==1):
        res = (x^lastans)%n
        sequence[res].append(y)
    else:
        res = (x^lastans)%n
        temp = y%len(sequence[res])
        a = sequence[res]
        lastans = a[temp]
        print lastans
