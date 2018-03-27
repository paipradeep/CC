#O(n)
#!/bin/python

import sys

def largestPermutation(k, arr):
    hash1 = {}
    hash2 = {}
    for i in range(len(arr)):
        hash1[arr[i]] = i
        hash2[i] = arr[i]
    countK = 0
    i=0
    while countK<k and i<len(arr):
        if arr[i] != n-i:
            countK+=1
            t = hash1[n-i]
            arr[i],arr[t] = arr[t],arr[i]
            hash1[n-i],hash1[arr[t]] = hash1[arr[t]],hash1[n-i]
        i+=1
    return arr

if __name__ == "__main__":
    n, k = raw_input().strip().split(' ')
    n, k = [int(n), int(k)]
    arr = map(int, raw_input().strip().split(' '))
    result = largestPermutation(k, arr)
    print " ".join(map(str, result))
