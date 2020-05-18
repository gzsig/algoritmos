#include <stdio.h>
#include <math.h>

int main()
{
    int x, casos;
    double y;
    unsigned long z;
    scanf("%d", &casos);
    for (casos; casos > 0; casos--)
    {
        scanf("%d", &x);
        y = 0;
        for (x = x - 1; x >= 0; x--)
        {
            y += pow(2, x);
        }
        z = y / 12000;
        printf("%ld kg\n", z);
    }
    return 0;
}