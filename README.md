# java_practice
3/25 생활 코딩 시작
자바 왜함?  :  
	일반적으로 쓰기 편하다고 들었음 
	백엔드 이런거 하려면 뭔가 쓸 말이 있어야하는데 쓸 건덕지가 하나도 없음
	이번에 자바 좀 공부 하고 프로젝트 하나정도 해보면 좋겟다는 생각에…
	언제까지?
	
	
	
	
	1. 설치 
		a. java IDE 깔았다.
		b. window cmd 로 하는듯
		c. java
		d. javac 명령어가 안먹음
			i. 세팅 jdk 깔았음	(요곤 programfiles 에 있고, jre 버전은 programfiles(x86)에 있음
	
	2. 자바 실행(windows) (21/04/05)
		a. 자바 컴파일 
			
			~.class 가 생성되네
		b. 자바 실행
			
			
			
			
			
			
			아!! 파일만 바꾼다ㅗㄱ 되는게 아니라 컴파일을 해야지만 이게 바뀌네!!! 클래스파일을 보고 
		c. 이클립스(개발환경, 개발도구)
			
			
			
			src는 source, ".java" 확장자를 가진 파일들 , 사용자가 작성 하는 코드
			bin 은 binary , ".class" 확장자를 가진 파일들, compile 되면 이게 실행이 되는것
		d. 패키지
			i. 같은 이름을 가지는 파일들을 분류 시켜주는 녀석
			ii. 만약 패키지 이름이 같으면 어떻게 되나 그럴떄 미연에 방지 위해 도메인 주소를 쓴다네
			iii. 더 많은 내용은 추후에 배울것.
			iv. new package 생성
				
				1) 패키지 이름은 내 맘대로 정하는것.
				2) 각각의 '.' 들은 
		e. 클래스
			i. new class 생성
				
				
				
				1) 클래스와 함께 편리하게 파일이 생성됨
				2) 저장을 하면 bin 파일에 class 가 생성이 됨.
				
			ii. 당분간은 class 생성해서 코드 짠다 생각 하래.
	3. 숫자와 문자
		a. data type
			i. 숫자(정수타입, 실수 타입)
				1) src 에서 new package 생성
					
				2) 새로 생성된 package 에서 class 생성
					
				
				
				3) 실행
					
					
					
			ii. 문자, 문자열(character & string)
				1) 문자 'a' 
					a) 작은따옴표 표기
					b) 만약 문자열을 작은따옴표 ' 로 묶어서 표기 하게 되면 에러가 나게 된다.
						i) 에러 디버깅 
							에러는 problem 을 들어가면 라인 나온다
				2) 문자열 "ab"
					a) 큰따옴표 표기
					b) 한자리짜리의 string 도 가능 ex) println("a");
					c) 문자열끼리 연산가능(+ )(이퀄도 되는듯?)
					d) 문자열에 큰따옴표 표기 하고 싶을땐 \" 
						
					e) 여러줄 표시는 c 와 똑같게 \n
![image](https://user-images.githubusercontent.com/49578522/113694274-7e568a80-970a-11eb-8f2b-65a89f7735c7.png)
