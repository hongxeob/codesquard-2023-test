# 구현과정 상세 설명

[//]: # (~~## 1단계)

[//]: # ()
[//]: # (- 처음 문제를 접근 했을때, **원의 사이즈를 원의 반지름으로 생각**하여, 원의 공식으로 접근을 했다.)

[//]: # (    - 결과는 예시의 그림과는 다른 형태로 나오게 되었다.)

[//]: # (- 단순하게 원의 사이즈 만큼 바둑판에 가로/세로가 형성 되고 그 안에서 공백과 색칠 부분으로 예시와 같게 만드려고 노력했다.)

[//]: # (    1. 주어진 정수의 범위를 지정해주고, 그 범위를 벗어나면 다시 입력받게 해주었다.)

[//]: # (    2. 원의 크기를 `size`라 하고)

[//]: # (    2. 첫번째 for문은 세로를 나타내기로 하였다.)

[//]: # (    2. size*size 크기의 바둑판을 원을 가운데 기준으로 좌/우 나눈다)

[//]: # (    2. 칠해져야 하는 우측을 `size/2` , 좌측을 `size/2-1`로 수학적 방정식을 세웠다.)

[//]: # (    3. size*size 크기의 바둑판을 좌우가 아닌 상하 기준 반으로 나누어 위쪽&#40;색칠 부분이 아래로 늘어 나는곳&#41;을 먼저 접근했다.)

[//]: # (        - i가 `left`보다 작을땐,`left=left-i`는 좌측으로 한칸씩 이동하고,`right=right+i`는 우측으로 한칸씩 이동해야한다)

[//]: # (        - `right`,`left`중 **하나라도** i와 같아지는 경우 `left`는 0 ,`right`는 `size-1`에 칠해진다.)

[//]: # (   4. 가운데를 기준 아래쪽. 즉 아래로 갈수록 줄어드는 부분에 대해서 고민을 해봤다)

[//]: # (      - **i가 우측`right` 값보다 커지는 순간 점차 줄어드는 것을 발견**했다. 그것을 방정식을 세워서 그시점부터는 `left`는 증가시키고 `right`는 감소 시켰다.)

[//]: # (   5. 그렇게 `right`,`left`의 값을 정해준 후 다음 for문에서 j의 인덱스의 각 자리가 같으면 위치를 칠해주는 식으로 구현하였다.)

[//]: # ( )
[//]: # (  )
[//]: # (### 실행 결과)

[//]: # (<img width="288" alt="스크린샷 2022-12-05 오후 5 03 57" src="https://user-images.githubusercontent.com/97447334/205591391-295aa516-7261-41ee-991b-bc4c330c759a.png">)

[//]: # ()
[//]: # ()
[//]: # ()
[//]: # ()
[//]: # ( **즉 i의 변화에 따라 `right`와 `left`의 값이 유동적으로 변화하면 된다!**~~ )

## 2단계
1. 지구는 1년에 한바퀴 태양 주위를 공전한다.(반시계)
2. 달은 한달에 한바퀴 지구 주위를 공전한다. (반시계)
3. 182.5X182.5의 사분면을 만들고 태양의 위치를 (0,0)으로 잡고 하루마다 -1,1씩 이동한다(??)
4. 위의 방식도 맞지만..음…뭔가 있을거 같다..
5. 문제의 마지막인 `평면상에서 공전하며,공전 궤도는 완전한 원이다`?
    1. 겹치는 부분도 각 지구,달의 사이즈 조정이 필요할까..?
    2. 그렇다면 겹치는 부분은 실제 개기일식/개기월식처럼 중복 출력하지 않고 가려진것처럼 표현을 해야한다(?)
