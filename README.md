

#  ๐ก ์๊ณ ๋ฆฌ์ฆ ์คํฐ๋ ๐ก

SSAFY 5๊ธฐ ์์ธ 15๋ฐ ์๊ณ ๋ฆฌ์ฆ ์คํฐ๋ ๊ธฐ๋ก

 - [ ] ์์ธ 15๋ฐ ์์นํ
 - [ ] ์์ธ 15๋ฐ ์ง๊ฐํ
 - [ ] ์์ธ 15๋ฐ ์ด์ข๋ฏผ
 - [ ] ์์ธ 15๋ฐ ์ ๋์ฐ
 - [ ] ์์ธ 15๋ฐ ์ํฌ์ 
 - [ ] ์์ธ 15๋ฐ ๊น์ง์
<br><br>

## ๐ Rule
์์์ผ ๋ฐค12์๊น์ง ๋ฌธ์ ๋ฅผ ํ์ด์ฃผ์ธ์.
ํ์์ผ ์คํ๋ผ์ธ ์คํฐ๋์์ ์๋ก์ด ๋ฌธ์ ๋ฅผ ์ถ์ ํฉ๋๋ค.
* โโ ๋ฌธ์ ํ์ด ๋ง๊ฐ : ๋งค์ฃผ ์์์ผ 24:00 ๊น์ง
* โโ ๋ฌธ์  ์ถ์  : ๋งค์ฃผ ํ์์ผ ์จ๋ผ์ธ ์คํฐ๋

<br><br>

## ๐ Convention
###  1๏ธโฃ Code Convention
๊ฐ ์ฝ๋ ๋ณ ๋ชฉ์ ์ ์ฃผ์์ผ๋ก ์์ฑํฉ๋๋ค.
๋ณ์์ ํจ์ ์ด๋ฆ ๋ํ ์ญํ ์ ์ ์ ์๋๋ก ๊ฐ๋จํ ์ฃผ์์ ๋ง๋ถ์๋๋ค.

<br>

### 2๏ธโฃ Project Convention

๊ฐ ๋ฉค๋ฒ๋ณ ํ๋ก์ ํธ ๊ตฌ์กฐ๋ ๋ค์๊ณผ ๊ฐ์ต๋๋ค
**ํ๋ก์ ํธ์ด๋ฆ/week๋ฒํธ/ํ๋ซํผ_๋ฌธ์ ๋ฒํธ_๋ ๋ฒจ_๋ฌธ์ ์ด๋ฆ/...**

    baekjoon/username/week15/BOJ_1051_S3_์ซ์์ ์ฌ๊ฐํ/...

<br>

### 3๏ธโฃ Commit Convention
ํ๋ฒ์ ๋ชจ๋  ํ์ผ์ addํ์ง ์๊ณ  type๋ณ๋ก ๋ถ๋ฆฌํ์ฌ commit ํฉ๋๋ค.

    docs : README.md ๋ฑ ๋ฌธ์ ์์ฑ ๋ฐ ์์ 
    code : ์ฝ๋ ์์ฑ
    fix : ์ฝ๋ ์์ 
    add : ๊ธฐ์กด์ ํผ ๋ฌธ์ ์ ๋ํ ์ถ๊ฐ
    remove : ์ฝ๋ ๋ฐ ๋ฌธ์ ์ญ์ 
    merge : pr(pull request)์ ํตํด ์์ ์ repo์์ ์๋ณธ repo๋ก mergeํ๊ธฐ
  <br>

์ ์ฉ ์์ ::
1. BOJ์ 1051๋ฒ ์ซ์ ์ ์ฌ๊ฐํ (silver3) ๋ฌธ์ ๋ฅผ ํ์๋ค๋ฉด
ํด๋น ์ฝ๋๋ฅผ ํ๋์ commit์ผ๋ก ๋ถ๋ฆฌํฉ๋๋ค.  
์ด ๋์ commit message๋ ๋ค์๊ณผ ๊ฐ์ด ํต์ผํฉ๋๋ค
		
		 git commit -m "code : BOJ 1051 S3 ์ซ์์ ์ฌ๊ฐํ"

	ํด๋น ์ฝ๋๋ฅผ ์์ ํ  ๋์ commit message๋ ๋ค์๊ณผ ๊ฐ์ด ํต์ผํฉ๋๋ค.
		
		 git commit -m "fix : BOJ 1051 S3 ์ซ์์ ์ฌ๊ฐํ"

2.  ์ฝ๋์ ๋ํ ์ค๋ช์ ์์ฑํ๊ณ 
ํด๋น ๋ฌธ์๋ฅผ ํ๋์ commit์ผ๋ก ๋ถ๋ฆฌํฉ๋๋ค.  
์ด ๋์ commit message๋ ๋ค์๊ณผ ๊ฐ์ต๋๋ค.
		
		 git commit -m "docs : BOJ 1051 S3 ์ซ์์ ์ฌ๊ฐํ"

3. main README.md ํ์ผ์ ์์ ํ  ๋์ commit message๋ ๋ค์๊ณผ ๊ฐ์ต๋๋ค.
		
		 git commit -m "docs : main README update"

5. ํ์ผ์ ์ญ์ ํ  ๊ฒฝ์ฐ commit message๋ ๋ค์๊ณผ ๊ฐ์ต๋๋ค
		
		 git commit -m "remove : ์ญ์ ํ์ผ"
		
<br>

### 4๏ธโฃ Review Convention
1. Pull Request์ ์ ๋ชฉ์ ๋ค์๊ณผ ๊ฐ์ด ํต์ผํฉ๋๋ค.
**์ด๋ฆ : ๋ฌธ์ ํ๋ซํผ ๋ฌธ์ ๋ฒํธ ๋ฌธ์ ๋ฑ๊ธ ๋ฌธ์ ์ ๋ชฉ** 
		
		 DAUN JO : BOJ 1051 S3 ์ซ์์ ์ฌ๊ฐํ
		
2. Pull Request์ comment์๋ ๋ณธ์ธ์ด ์์ฑํ README.md์ ๋ด์ฉ์ ์ถ๊ฐํฉ๋๋ค. 

3. ๋ฌธ์ ์ ํด๋นํ๋ ์ ํ์ ์ ํํ์ฌ PR์ label์ attachํ๊ณ ,   
 ์์ ์ PR์ assignee์ ์์ ์ ์ถ๊ฐ ํ ๋ฌธ์ ํ์ด week์ ํด๋นํ๋ Milestones์ ์ ํํฉ๋๋ค.

4. ๊ธฐ์กด์ PR์ ์์ฑ ํ ์๋ก์ด ๋ฌธ์ ๋ฅผ ํ์์ ๊ฒฝ์ฐ, ์๋ก์ด ๋ฌธ์ ์ ๋ํ commit์ ํ๊ธฐ ์  ๋ค์ ๊ณผ์ ์ ์ํํฉ๋๋ค.

	- โ ์ฝ๋๋ฆฌ๋ทฐ๊ฐ ์๋ฃ ๋์์ ๊ฒฝ์ฐ  
		์์ ์ PR์์ merge ๋ฒํผ์ ๋๋ฌ merge ํฉ๋๋ค. 
		
	- โ ๋ฆฌ๋ทฐ ์๋ฃ ์  ์๋ก์ด ๋ฌธ์ ๋ฅผ ํ ๊ฒฝ์ฐ
		1. ์์ ์ local์์ ์๋ก ํผ ๋ฌธ์ ์ ๋ํ branch๋ฅผ ์์ฑํฉ๋๋ค.  
		์ด ๋ branch์ ์ด๋ฆ์ **๋ฌธ์ ํ๋ซํผ-๋ฌธ์ ๋ฒํธ**๊ณผ ๊ฐ์ด ์์ฑํ๋ ๊ฒ์ ๊ถ์ฅํฉ๋๋ค.
		
			    boj-1051
		
		2. ์๋ก์ด ๋ฌธ์ ์ ๋ํ code์ README.md์ ๋ํ commit์ ์ถ๊ฐ ํ pushํฉ๋๋ค.   
		์ด ๋์ commit message๋ 2๏ธโฃ Commit Convention์์ ์ธ๊ธํ ๊ท์น์ ๋ง๊ฒ ์ค์ ํฉ๋๋ค.
		3. ์ด ๋ ๋ฐ๋์ (a)์์ ์์ฑํ branch๋ก push ๋๋์ง ํ์ธํฉ๋๋ค.
		4. ๋ณธ์ธ ๊ณ์ ์ fork๋ repo์์ Pull Request์ ์์ฑํ  ๋,   
		์ฝ๋๊ฐ push๋ ๋ธ๋์น(a์์ ์์ฑํ jodawoooon/boj-1051)์์   
		organization repo์ main ๋ธ๋์น๋ก Pull Request๋ฅผ ๋ณด๋๋๋ค.


<br><br>

## ๐ Solved Problems
### ๐ฉ week 1
| Type | ๋ฌธ์  | ์ ๋ชฉ | ์ ํ | rank |
| -- |--| -- |--|--|
| BOJ |  5555 | [๋ฐ์ง](https://www.acmicpc.net/problem/5555) | ๋ฌธ์์ด | silver5 |
| BOJ |  2504 | [๊ดํธ์ ๊ฐ](https://www.acmicpc.net/problem/2504) | ์คํ | silver1 |
| BOJ |  1260 | [DFS์ BFS](https://www.acmicpc.net/problem/1260) | ํ์ | silver2 |
| BOJ |  1051 | [์ซ์ ์ ์ฌ๊ฐํ](https://www.acmicpc.net/problem/1051) | ๋ธ๋ฃจํธํฌ์ค| silver4 |
| BOJ | 18352 | [ํน์  ๊ฑฐ๋ฆฌ์ ๋์ ์ฐพ๊ธฐ](https://www.acmicpc.net/problem/18352) | ๋ค์ต์คํธ๋ผ ๋ฒจ๋งํฌ๋| silver2 |


### ๐ฉ week 2
| Type | ๋ฌธ์  | ์ ๋ชฉ | ์ ํ | rank |
| -- |--| -- |--|--|
| BOJ |  5397 | [ํค๋ก๊ฑฐ](https://www.acmicpc.net/problem/5397) | ์คํ,ํ,์ ๋ ฌ | silver2 |
| BOJ |  1182 | [๋ถ๋ถ์์ด์ํฉ](https://www.acmicpc.net/problem/1182) | ๋ธ๋ฃจํธํฌ์ค | silver2 |
| BOJ |  2644 | [์ด์๊ณ์ฐ](https://www.acmicpc.net/problem/2644) | ํ์ | silver2 |
| BOJ | 17502 | [ํด๋ ์ด์ ํฐ๋ฆฐ๋๋กฌ ](https://www.acmicpc.net/problem/17502) | ๋ฌธ์์ด| bronze4 |
| BOJ | 11724 | [์ฐ๊ฒฐ ์์์ ๊ฐ์](https://www.acmicpc.net/problem/11724) | BFS์ DFS| silver2 |

### ๐ฉ week 3
| Type | ๋ฌธ์  | ์ ๋ชฉ | ์ ํ | rank |
| -- |--| -- |--|--|
| BOJ |  7576 | [ํ ๋งํ ](https://www.acmicpc.net/problem/7576) | DFS์ BFS | gold5 |
| BOJ |  9372 | [์๊ทผ์ด์ ์ฌํ](https://www.acmicpc.net/problem/9372) | ๋ถ๋ถ์งํฉ | silver4 |
| BOJ | 17070 | [ํ์ดํ ์ฎ๊ธฐ๊ธฐ 1](https://www.acmicpc.net/problem/17070) | aํ ๊ธฐ์ถ | gold5 |
| BOJ |  1406 | [์๋ํฐ](https://www.acmicpc.net/problem/1406) | ๋ฌธ์์ด, ์คํ, ์ ๋ ฌ| silver2 |
| BOJ | 15649 | [N๊ณผ M (1)](https://www.acmicpc.net/problem/15649) | ๋ธ๋ฃจํธํฌ์ค | silver3 |
| BOJ | 15650 | [N๊ณผ M (2)](https://www.acmicpc.net/problem/15650) | ๋ธ๋ฃจํธํฌ์ค | silver3 |

### ๐ฉ week 4
| Type | ๋ฌธ์  | ์ ๋ชฉ | ์ ํ | rank |
| -- |--| -- |--|--|
| BOJ | 17136 | [์์ข์ด ๋ถ์ด๊ธฐ](https://www.acmicpc.net/problem/17136) | ๋ธ๋ฃจํธํฌ์ค | gold2 |
| BOJ | 15684 | [์ฌ๋ค๋ฆฌ ์กฐ์](https://www.acmicpc.net/problem/15684) | ๋ธ๋ฃจํธํฌ์ค | gold3 |
| SWEA|  2383 | [์ ์ฌ ์์ฌ์๊ฐ](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5-BEE6AK0DFAVl&categoryId=AV5-BEE6AK0DFAVl&categoryType=CODE&problemTitle=%EC%A0%90%EC%8B%AC+%EC%8B%9D%EC%82%AC%EC%8B%9C%EA%B0%84&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1) | ๋ชจ์ SW ์ญ๋ํ์คํธ |  |

### ๐ฉ week 5
| Type | ๋ฌธ์  | ์ ๋ชฉ | ์ ํ | rank |
| -- |--| -- |--|--|
| BOJ | 17140 | [์ด์ฐจ์ ๋ฐฐ์ด๊ณผ ์ฐ์ฐ](https://www.acmicpc.net/problem/17140) | ๊ตฌํ | gold4 |
| BOJ | 16235 | [๋๋ฌด ์ฌํํฌ](https://www.acmicpc.net/problem/16235) | ๊ตฌํ | gold3 |
| SWEA | 2382 | [๋ฏธ์๋ฌผ ๊ฒฉ๋ฆฌ](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV597vbqAH0DFAVl) | ๋ชจ์ SW ์ญ๋ํ์คํธ |  |

### ๐ฉ week 6
| Type | ๋ฌธ์  | ์ ๋ชฉ | ์ ํ | rank |
| -- |--| -- |--|--|
| BOJ | 19238 | [์คํํธ ํ์](https://www.acmicpc.net/problem/19238) | ๊ตฌํ, BFS | gold2 |
| BOJ | 20055 | [์ปจ๋ฒ ์ด์ด ๋ฒจํธ ์์ ๋ก๋ด](https://www.acmicpc.net/problem/20055) | ๊ตฌํ | gold5 |

### ๐ฉ week 7
| Type | ๋ฌธ์  | ์ ๋ชฉ | ์ ํ | rank |
| -- |--| -- |--|--|
| BOJ | 20061 | [๋ชจ๋ธ๋ฏธ๋ธ๋๋ฏธ๋ธ 2](https://www.acmicpc.net/problem/20061) | ๊ตฌํ | gold2 |
| BOJ | 17142 | [์ฐ๊ตฌ์ 3](https://www.acmicpc.net/problem/17142) | ๋ธ๋ฃจํธํฌ์ค | gold4 |
| SWEA | 4014 | [ํ์ฃผ๋ก ๊ฑด์ค](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWIeW7FakkUDFAVH&) | ๋ชจ์ SW ์ญ๋ํ์คํธ |  |

### ๐ฉ week 8
| Type | ๋ฌธ์  | ์ ๋ชฉ | ์ ํ | rank |
| -- |--| -- |--|--|
| SWEA | 2112 | [๋ณดํธํ๋ฆ](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5V1SYKAaUDFAWu) | ๋ชจ์ SW ์ญ๋ํ์คํธ |  |
| SWEA | 2115 | [๋ฒ๊ฟ์ฑ์ทจ](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5V4A46AdIDFAWu) | ๋ชจ์ SW ์ญ๋ํ์คํธ |  |
| SWEA | 2105 | [๋์ ํธ ์นดํ](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5VwAr6APYDFAWu) | ๋ชจ์ SW ์ญ๋ํ์คํธ |  |
| SWEA | 1949 | [๋ฑ์ฐ๋ก ์กฐ์ฑ](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PoOKKAPIDFAUq) | ๋ชจ์ SW ์ญ๋ํ์คํธ |  |

### ๐ฉ week 9
| Type | ๋ฌธ์  | ์ ๋ชฉ | ์ ํ | rank |
| -- |--| -- |--|--|
| programmers | 84021 | [ํผ์ฆ์กฐ๊ฐ์ฑ์ฐ๊ธฐ](https://school.programmers.co.kr/learn/courses/30/lessons/84021) | DFS/BFS | Level3 |
| programmers | 43164 | [์ฌํ๊ฒฝ๋ก](https://school.programmers.co.kr/learn/courses/30/lessons/43164) | DFS/BFS | Level3 |
| programmers | 49191 | [์์](https://school.programmers.co.kr/learn/courses/30/lessons/49191) | ๊ทธ๋ํ | Level3 |
| programmers | 49189 | [๊ฐ์ฅ ๋จผ ๋ธ๋](https://school.programmers.co.kr/learn/courses/30/lessons/49189) | ๊ทธ๋ํ | Level3 |
| programmers | 42895 | [N์ผ๋ก ํํ](https://school.programmers.co.kr/learn/courses/30/lessons/42895) | DP | Level3 |
| programmers | 42747 | [H-Index](https://school.programmers.co.kr/learn/courses/30/lessons/42747) | ์ ๋ ฌ | Level2 |
| programmers | 42746 | [๊ฐ์ฅ ํฐ ์](https://school.programmers.co.kr/learn/courses/30/lessons/42746) | ์ ๋ ฌ | Level2 |
| programmers | 42576 | [์์ฃผํ์ง ๋ชปํ ์ ์](https://school.programmers.co.kr/learn/courses/30/lessons/42576) | ํด์ | Level1 |
| programmers | 1845 | [ํฐ์ผ๋ชฌ](https://school.programmers.co.kr/learn/courses/30/lessons/1845) | ํด์ | Level1 |
| programmers | 42862 | [์ฒด์ก๋ณต](https://school.programmers.co.kr/learn/courses/30/lessons/42862) | ๊ทธ๋ฆฌ๋ | Level1 |

### ๐ฉ week 10
| Type | ๋ฌธ์  | ์ ๋ชฉ | ์ ํ | rank |
| -- |--| -- |--|--|
| programmers | 12906 | [๊ฐ์ ์ซ์๋ ์ซ์ด](https://school.programmers.co.kr/learn/courses/30/lessons/12906) | ์คํ/ํ | Level1 |
| programmers | 42586 | [๊ธฐ๋ฅ๊ฐ๋ฐ](https://school.programmers.co.kr/learn/courses/30/lessons/42586) | ์คํ/ํ | Level2 |
| programmers | 86491 | [์ต์์ง์ฌ๊ฐํ](https://school.programmers.co.kr/learn/courses/30/lessons/86491) | ์์ ํ์ | Level1 |
| programmers | 42842 | [์นดํซ](https://school.programmers.co.kr/learn/courses/30/lessons/42842) | ์์ ํ์ | Level2 |
| programmers | 43165 | [ํ๊ฒ๋๋ฒ](https://school.programmers.co.kr/learn/courses/30/lessons/43165) | DFS/BFS | Level2 |

### ๐ฉ week 11
| Type | ๋ฌธ์  | ์ ๋ชฉ | ์ ํ | rank |
| -- |--| -- |--|--|
| programmers | 49189 | [๊ฐ์ฅ ๋จผ ๋ธ๋](https://school.programmers.co.kr/learn/courses/30/lessons/49189) | ๊ทธ๋ํ | Level3 |
| programmers | 43162 | [๋คํธ์ํฌ](https://school.programmers.co.kr/learn/courses/30/lessons/43162) | DFS/BFS | Level3 |
| programmers |  1844 | [๊ฒ์ ๋งต ์ต๋จ๊ฑฐ๋ฆฌ](https://school.programmers.co.kr/learn/courses/30/lessons/1844) | DFS/BFS | Level2 |
| programmers | 42577 | [์ ํ๋ฒํธ๋ชฉ๋ก](https://school.programmers.co.kr/learn/courses/30/lessons/42577) | ํด์ | Level2 |
| programmers | 42583 | [๋ค๋ฆฌ๋ฅผ ์ง๋๋ ํธ๋ญ](https://school.programmers.co.kr/learn/courses/30/lessons/42583) | ์คํ/ํ | Level2 |
| programmers | 42587 | [ํ๋ฆฐํฐ](https://school.programmers.co.kr/learn/courses/30/lessons/42587) | ์คํ/ํ | Level2 |
| programmers | 87946 | [ํผ๋ก๋](https://school.programmers.co.kr/learn/courses/30/lessons/87946) | ์์ ํ์ | Level2 |

### ๐ฉ week 12
| Type | ๋ฌธ์  | ์ ๋ชฉ | ์ ํ | rank |
| -- |--| -- |--|--|
| SWEA | 4193 | [์์๋ํ ๊ฒฐ์น์ ](https://swexpertacademy.com/main/code/userProblem/userProblemDetail.do?contestProbId=AWKaG6_6AGQDFARV&categoryId=AWKaG6_6AGQDFARV&categoryType=CODE) | ์์ ํ์ | D4 |
| programmers | 87694 | [์์ดํ ์ค๊ธฐ](https://school.programmers.co.kr/learn/courses/30/lessons/87694) | DFS/BFS | Level3 |
| programmers | 86971 | [์ ๋ ฅ๋ง์ ๋๋ก ๋๋๊ธฐ](https://school.programmers.co.kr/learn/courses/30/lessons/86971) | ์์ ํ์ | Level2 |
| programmers | 84512 | [๋ชจ์์ฌ์ ](https://school.programmers.co.kr/learn/courses/30/lessons/84512) | ์์ ํ์ | Level2 |
| programmers | 42861 | [์ฌ์ฐ๊ฒฐํ๊ธฐ](https://school.programmers.co.kr/learn/courses/30/lessons/42861) | ๊ทธ๋ฆฌ๋ | Level3 |
