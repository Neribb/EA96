//
// Created by Neribb on 08/01/2025.
//
#include <stdio.h>

int validatePositiveInt()
{
    int number = 0;
    while (number <= 0)
    {
        printf("Introduce un numero entero positivo: ");
        scanf("%d", &number);
        if (number <= 0)
        {
            printf("Numero incorrecro \n");
        }
    }
    return number;
}

void generateEventNumbers(int limit)
{
    printf("Numeros pares %d: \n", limit);
    for (int i = 2; i < limit; i++)
    {
        printf("%d\n", i);
    }
    printf("\n");
}
int main()
{

}



