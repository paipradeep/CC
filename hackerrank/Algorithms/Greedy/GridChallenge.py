
import sys

def gridChallenge(grid):
    for i in range(len(grid)):
        temp = sorted(grid[i])
        grid[i] = "".join(temp)
    
    for i in range(1,len(grid)):
        for j in range(len(grid)):
            #print(grid[i][j] + " " + grid[i-1][j])
            if grid[i][j]< grid[i-1][j]:
                return "NO"
    return "YES"
if __name__ == "__main__":
    t = int(raw_input().strip())
    while t!=0:
        t-=1
        n = int(raw_input().strip())
        grid = []
        grid_i = 0
        for grid_i in xrange(n):
            grid_t = str(raw_input().strip())
            grid.append(grid_t)
        result = gridChallenge(grid)
        print result
