#!/bin/python

import sys

def angryChildren(k, arr):
    arr.sort()
    diff = 1000000000
    for i in range(len(arr)):
        if i+k-1>=n:
            return diff
        #print arr[i+k-1],arr[i]
        temp = arr[i+k-1] - arr[i]
        if temp<diff:
            diff = temp
    return diff

if __name__ == "__main__":
    n = int(raw_input().strip())
    k = int(raw_input().strip())
    arr = []
    arr_i = 0
    for arr_i in xrange(n):
        arr_t = int(raw_input().strip())
        arr.append(arr_t)
    result = angryChildren(k, arr)
    print result
