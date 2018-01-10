#count max number of consecutive 1's in binary repr of a number
#!/bin/python
import sys
n = int(raw_input().strip())
s = ""
i = n
while i:
    if i%2:
        s = "1" + s
    else:
        s = "0" + s
    i/=2
c = 0
d = 0
for t in s:
    if t=="1":
        d+=1
        if d>c:
            c = d
    else:
        d=0
print c

