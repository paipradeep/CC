t = int(raw_input().strip())
while t!=0:
    t-=1
    n,k = map(int,raw_input().strip().split())
    l = map(int,raw_input().strip().split())
    if(k>min(l)):
        print k-min(l)
    else:
        print 0
