#include <stdio.h>
#include <string.h>
#include <math.h>
int main()
{
  int aBinary[32]; // = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
  int bBinary[32]; //= {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
  int rBinary[32]; //= {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
  memset(aBinary, 0, sizeof(aBinary));
  memset(bBinary, 0, sizeof(bBinary));
  memset(rBinary, 0, sizeof(rBinary));
  long long int a, b, i;
  long long int r, helper;
  // while (getchar() != EOF)
  // {
  scanf("%lld %lld", &a, &b);
  for (i = 0; a > 0; i++)
  {
    aBinary[i] = a % 2;
    a = a / 2;
  }
  for (i = 0; b > 0; i++)
  {
    bBinary[i] = b % 2;
    b = b / 2;
  }
  // for (i = 31; i >= 0; i--)
  // {
  //   printf("%d", aBinary[i]);
  // }
  // printf("\n");
  // for (i = 31; i >= 0; i--)
  // {
  //   printf("%d", bBinary[i]);
  // }
  // printf("\n");

  for (i = 31; i >= 0; i--)
  {
    if (aBinary[i] == 1 && bBinary[i] == 1)
    {
      rBinary[i] = 0;
    }
  for (i = 31; i >= 0; i--)
  {
    if (aBinary[i] != bBinary[i])
    {
      rBinary[i] = 1;
    }
  }
    {
      rBinary[i] = 0;
    }
  }

  // for (i = 31; i >= 0; i--)
  // {
  //   printf("%d", rBinary[i]);
  // }
  // printf("\n");
  r = 0;
  helper = pow(2, 31);
  for (i = 31; i >= 0; i--)
  {
    r += rBinary[i] * helper;
    helper = helper / 2;
  }
  printf("%lld\n", r);
  // }
  return 0;
}