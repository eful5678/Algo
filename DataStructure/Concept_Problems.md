# Data Structure

## Problem #1 - Jolly Jumpers

---

- Jolly Jumpers
  - n개의 정수(n>0)로 이루어진 수열에 대해 서로 인접해 있는 두 수의 차가 1에서 n-1까지의 값을 가지는 수열
    - 1 4 2 3
    - 앞 뒤에 있는 수자 차의 절대 값이 각각 3, 2, 1
- 어떤 수열이 Jolly Jumper인지 판단할 수 있는 프로그램 작성

  - Input
    - 각 줄 맨 앞에는 3,000 이하의 정수가 있으며 그 뒤에는 수열을 나타내는 n개의 정수가 입력된다.
  - Output
    - 입력된 각 줄에 대해 "Jolly" 또는 "Not jolly"를 한 줄씩 출력한다.

- Example
  - Input
    - 4 1 4 2 3<br>
      5 1 4 2 -1 6
  - Output
    - Jolly<br>
      Not Jolly
