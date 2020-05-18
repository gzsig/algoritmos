# hn​ = { ½ × hn-1 if hn-1 is even;

# hn​ = { 3 × hn-1 + 1 if hn-1 is odd.


x = int(input())
while(x!=0):
  max = x
  while(x != 1):
    if((x) % 2 == 0):
      x = 0.5 * x
      if(x > max):
        max = x
    else:
      x = 3 * x + 1
      if(x > max):
        max = x
  max = int(max)
  print(max)
  x = int(input())
