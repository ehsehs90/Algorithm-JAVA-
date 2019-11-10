## BFS



- 목적 : **임의의 정점에서 시작**(시작점)해서, 모든 정점을 한 번씩 방문하는 것이다.
- BFS는 최단 거리를 구하는 알고리즘이다.
  - 언제? 모든 가중치가 1일때 최단거리를 구할 수 있다 . 
  - (단계별로 진행한다는 성질 때문)
- BFS를 이용해 해결할 수 있는 문제는 아래와 같은 조건을 만족해야 한다.
  - 1. 최소 비용 문제이여야 한다
    2. 간선의 가중치가 1이여야한다
    3. 정점과 간선의 개수가 적어야 한다 ( 적다는 것은 문제의 조건에 맞춰서 해결할 수 있다는 것을 의미한다 )
       - 간선의 가중치가 문제에서 구하라고 하는 최소 비용과 의미가 일치해야 한다
       - 즉, 거리의 최소값을 구하는 문제라면 가중치는 거리를 의미해야 하고, 시간의 최소값을 구하는 문제라면 가중치는 시간을 의미해야 한다.



### 숨바꼭질

- 수빈이의 위치 : N
- 동생의 위치 : K
- 동생을 찾는 가장 빠른 시간을 구하는 문제
- 수빈이가 할 수 있는 행동( 위치 : X )
  - 1. 걷기 X+1 또는 X-1로 이동( 1초 )
    2. 순간이동 : 2*X 로 이동 ( 1초 )



- BFS 로 문제를 푼다는 것 : 문제를 그래프로 바꾸어 푼다는 것
- 따라서 무엇이 정점이고 무엇이 간선의 의미를 가지는지 알아야 함

```JAVA
// check[i] = i 를 방문했는지
// dist[i] = i 를 몇 번만에 방문했는지
```

- now -> next 를 갔다고 하면

```java
if (check[next]== false){
    q.push(next);
	check[next]=true;
	dist[next] = dist[now]+1;
}
```

![image-20191111001422658](C:\Users\82109\eclipse-workspace\CodePlus\BFS.assets\image-20191111001422658.png)

- 문제의 정답 : dist[m]





### 숨바꼭질 4

- 앞의 문제와 다 같다
- 이동하는 방법을 추가로 구한다
- 역추적 문제 : 어떤 값이 다른 값에 의해 바뀌었을 때, 왜 바뀌었는지 기록하는 것

```java
if (check[next]== false){
    q.push(next);
	check[next]=true;
    from[next]=now;
	dist[next] = dist[now]+1;
}
```

- 역추적 과정

  - from[i] = 어디에서 왔는지

  - 의미 : from[i] -> i

  - N에서 K를 가는 문제 이기 때문에

  - K부터 from 을 통해서 N까지 가야한다

  - 즉, 역순으로 저장되기 때문에, 다시 역순으로 구하는 것이 필요하다

    - 1. 재귀함수(n -> o -> o -> m)

    ```java
    print(int n, int m){
        if (n!=m){
            print(n, from[m])
        }
    }
    ```

    - 2. 반복문 사용

    ```java
    stack<int> ans;
    for(int i=m; i!=n; i=from[i]){
        ans.push(i);
    }
    ans.push(n);
    while(!ans.empty()){
        print(ans.top()+' ');
        ans.pop()
    }
    print()
    ```

    

![image-20191111002357406](C:\Users\82109\eclipse-workspace\CodePlus\BFS.assets\image-20191111002357406.png)

![image-20191111002505091](C:\Users\82109\eclipse-workspace\CodePlus\BFS.assets\image-20191111002505091.png)