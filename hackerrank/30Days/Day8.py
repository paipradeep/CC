#Given  names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. You will then be given an unknown number of names to query your phone book for. For each queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; if an entry for  is not found, print Not found instead.

myDict = {}
t = int(raw_input())
p = t
while t:
    s = raw_input()
    l = s.split(' ')
    myDict[l[0]] = l[1]
    t-=1
while p:
    name = raw_input()
    try:
        q = name
        q += "={0}".format(myDict[name])
    except:
        q = "Not found"
    print q
    p-=1
