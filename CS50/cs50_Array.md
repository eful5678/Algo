# Array

## **문자열의 활용**

---
- 문자열을 입력받고, 한 글자씩 출력
1. 입력받은 문자열을 그대로 출력
```c
#include <cs50.h>
#include <stdio.h>

int main(void)
{
    string s = get_string("Input: ");
    printf("Output: ");
    for(int i = 0; s[i] != '\0'; i++)
    {
        printf("%c", s[i]);
    }
    printf("\n");
}
```

## Command-line Arguments
___
