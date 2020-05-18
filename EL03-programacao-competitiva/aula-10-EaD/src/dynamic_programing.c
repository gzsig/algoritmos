#include <stdio.h>

int main()
{
  int sum, n, j, i;
  scanf("%d", &n);
  sum = 0;
  for (i = 0; i <= n; i++)
  {
    for (j = 0; j <= i; j++)
    {
      sum += j;
    }
  }
  printf("%lf\n", 2.0 / n * sum + n);
  return 0;
}