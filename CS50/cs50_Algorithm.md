# Algorithm

## 검색 알고리즘

---

1. Linear Search

```
For i from to n-1
    If i'th element is 50
        Return true
Return false
```

2. Binary Search

```
If no item
    Return false
If middle item is 50
    Return true
Else if 50 < middle item
    Search left half
Else if 50 > middle item
    Search righ half
```

## 선형탐색

---

1. 숫자 50을 찾는 프로그램

```c
#include <cs50.h>
#include <stdio.h>

int main(void)
{
    int numbers[6] = {4, 8, 15, 16, 23, 42};

    for(int i = 0; i < 6; i++)
    {
        if(numbers[i] == 50)
        {
            printf("Found\n");
        }
    }
    printf("Not found\n");
}
```

2. 특정 이름을 찾는 프로그램

```c
#include <stdio.h>
#include <string.h>

int main(void)
{
    string names[4] = {"EMMA", "RODRIGO", "BRIAN", "DAVID"};

    for(int i = 0; i < 4; i++)
    {
        if(strcmp(names[i], "EMMA") == 0)
        {
            printf("Found\n");
            return 0;
        }
    }
    printf("Not Found\n");
    return 1;

}
// 0 -> success 1-> failure
```

3. 특정 이름을 찾고 그에 해당하는 전화번호를 찾는 프로그램
   - 새로운 자료형을 만든다 -> person
   ```c
   typedef struct
   {
       ~~~
   }
   person;
   ```

```c
#include <cs50.h>
#include <stdio.h>
#include <string.h>

typedef struct
{
    string name;
    string number;
}
person;

int main(void)
{
    person people[4];

    people[0].name = "EMMA";
    people[0].number = "010-1";

    people[1].name = "RODRIGO";
    people[1].number = "010-2";

    people[2].name = "BRIAN";
    people[2].number = "010-3";

    people[3].name = "DAVID";
    people[3].number = "010-4";


    for(int i = 0; i < 4; i++)
    {
        if(strcmp(people[i].name, "EMMA") == 0)
        {
            printf("%s\n", people[i].number);
            return 0;
        }
    }
    printf("Not Found\n");
    return 1;
}
```
