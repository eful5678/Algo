#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    int n = 50;
    printf("%p\n", &n); // & -> address is~

    printf("%i\n", *&n);// opposite of & : * -> go to address
}

// n's address : 0x7ffca6451acc -> pointer value
// hexadecimal
