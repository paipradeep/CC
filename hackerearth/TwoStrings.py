'''To check whether 2 strings are equal'''
t = int(raw_input())
while t!=0:
    t-=1
    s1,s2 = raw_input().strip().split()
    if(''.join(sorted(s1)) == ''.join(sorted(s2))):
        print "YES"
    else:
        print "NO"
