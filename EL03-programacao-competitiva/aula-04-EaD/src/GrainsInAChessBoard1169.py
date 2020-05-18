tests = int(input())
for i in range(tests):
  x = int(input())
  grains = 1
  day = 1
  while day <= x:
    grains *= 2
    day += 1
  print("{} kg".format(int(grains/12000)))