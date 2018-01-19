//To print 256th day of year considering both Julian and gregorian calendar
#!/bin/python

import sys

def solve(year):
    if(year<1918):
        if(year%4==0):
            dateString = "12.09." + str(year)
        else:
            dateString = "13.09." + str(year)
    elif(year>1918):
        if(year%400==0 or year%4==0 and year%100!=0):
            dateString = "12.09." + str(year)
        else:
            dateString = "13.09." + str(year)
    else:
        dateString = "26.09.1918"
    return dateString
            
        

year = int(raw_input().strip())
result = solve(year)
print(result)
