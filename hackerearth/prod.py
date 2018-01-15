p = int(raw_input().strip())
l = raw_input().strip().split(' ')
s = 1
for t in l:
    s *= int(t)
    s = s % (pow(10,9)+7)
print s
