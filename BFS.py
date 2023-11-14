import sys
import copy
import config
from generating_children import *

depth = 1
def DLS(i,f):
    if i in f:
        print(f)
        print(i[1])
        print(len(config.visited))
        return
    
    c = copy.deepcopy(i)
    global depth
    
    while(true):
        if c[1] <= depth:
            children = generate_children(c[0])
            print(c)
            
        if c[0] == f:
            print(f)
            print(c[1])
            print(len(config.visited))
            return
        else:
            config.q += children
            
        if len(config.q) == 0:
            print(not possible)
            print(c[1])
            print(len(config.visited))
            return
        else:
            c[0] = config.q[len(config.q) - 1]
            config.visited = config.visited + c
            del config.q[len(config.q) - 1]