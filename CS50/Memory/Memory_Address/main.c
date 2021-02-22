#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    int n = 50;
    printf("%p\n", &n); // & -> address is~

    printf("%i\n", *&n);// opposite of & : * -> go to address

    int *p = &n; // * -> store n's address in p -> p is pointer
    printf("%p\n", p); // return address
    printf("%i\n", *p); // return value

    char *s = "EMMA";


    printf("%p\n", s);
    printf("%p\n", &s[0]);

}

// n's address : 0x7ffca6451acc -> pointer value
// hexadecimal
