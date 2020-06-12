#include <stdio.h>

int main()
{
  int n;
  int p, q, r, s, x, y;
  int i, j;
  int helper;
  long long res;

  scanf("%d", &n);
  scanf("%d %d %d %d %d %d", &p, &q, &r, &s, &x, &y);
  scanf("%d %d", &i, &j);

  // printf("n: %d\np: %d\nq: %d\nr: %d\ns: %d\nx: %d\ny: %d\ni: %d\nj: %d\n", n, p, q, r, s, x, y, i, j);
  res = 0;
  for (helper = 1; helper <= n; helper++)
  {
    res += ((p * i + q * helper) % x) * ((r * helper + s * j) % y);
  }
  printf("%lld\n", res);
  return 0;
}