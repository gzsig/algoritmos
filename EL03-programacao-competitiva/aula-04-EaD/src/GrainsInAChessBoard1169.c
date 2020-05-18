#include <stdio.h>

int main()
{
  int numOfTest, x, day, i;
  double grains;
  unsigned long kg;

  scanf("%d", &numOfTest);
  for (i = 0; i < numOfTest; i++)
  {
    scanf("%d", &x);
    grains = 1;
    day = 1;
    while (day <= x)
    {
      grains = grains * 2;
      day = day + 1;
    }
    kg = grains / 12000;
    printf("%lu kg\n", kg);
  }
  return 0;
}