n = int(input())

counter = -1

def fib(n):
    global counter 
    counter += 1
    if(n == 0):
        return 0
    elif(n == 1):
        return 1
    return fib(n - 1) + fib(n - 2)

for i in range(0, n):
    x = int(input())
    result = fib(x)
    print("fib({}) = {} calls = {}".format(x, counter, result))
    counter = -1
