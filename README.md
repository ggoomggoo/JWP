# JWP

## 링크

### 강좌소개
- http://www.fastcampus.co.kr/dev_camp_jwp/
- http://www.fastcampus.co.kr/dev_camp_jwp_blog_instructor_1/

### 저장소
- https://github.com/slipp/jwp-book
- https://github.com/slipp/web-application-server
- https://github.com/slipp/jwp-basic
- https://github.com/t1t1/jwp-basic/branches/yours

### 커뮤니티 채널
- https://trello.com/b/CxZXgT0h/2016-01-fast-campus-jwp
- fastcampus-jwp1.slack.com
- docs.google.com // qna

## 진행과정

### 01

### 02

### 03

### 04

### 05
- MVC 패턴
- https://github.com/t1t1/jwp-basic/commits/step2-chh-user-with-mvc-framework

### 06
- JDBC 구현
- https://github.com/t1t1/jwp-basic/commits/step2-to-step3-JDBC

### 07
- 이론
- “/”, “/*” 차이
- 가변인자
- try-with-resources
- runtime exception (unckecked exception)
- callback interface
- 익명 클래스; anonymous Class
- 제너릭; generic
- 인터페이스; interface
- 람다; lambda
- Ajax
- https://github.com/t1t1/jwp-basic/commits/step5-chh-qna-with-ajax // 소스꼬임
- jquery
- jackson
- View
- https://github.com/t1t1/jwp-basic/commits/step6-chh-qna-with-mvc-framework

### 08
- 중간점검
- https://github.com/t1t1/jwp-basic/commits/step7-chh-self-check

### 09
- 질문과답변
- 프로그래밍을 잘한다의 기준?
- BASS
- 신기술에 휘둘리지 말 것. 한 가지를 집중있게 학습하지 않으면 한계를 넘지 못한다. 한가지를 정복하고 나면 다른 분야도 쉽게 접근 가능 할 것이다. 
- 상태점검 - 중간점검
- 07 멀티쓰레드 // 스택, 힙, 인스턴스, 싱글턴, 필드, 상태, 
- 13 객체지향 // 서비스 로직 -> 도메인 객체에 로직을 처리 하는 메서드
- AWS

### 10
- build
- 도메인 분리 -> apatche server | virtual host
- 배포자동화
- shell 첫번째 라인: 해당 언어로 프로그램 실행
- maven profile - dev, product 다르게 빌드
- ;
- tomcat = Servlet Container + @
- RequestMapping
- Spring container
- java class, POJO; 특정 프레임워크에 종속 받지 않는 자바 클래스
- annoation -> spring 의존적 -> not POJO

### 11
- 어떻게 web.xml 없이 기동이 되는것인가?
- spring-web-*.jar/META-INF/services/javax.servlet.ServletContainerInitializer
- org.springframework.web.SpringServletContainerInitializer
- WebApplicationInitializer 인터페이스를 읽음
- L175 // initializer.onStartup(servletContext);
- so, WebApplicationInitializer를 구현
- ;
- HTTP: PUT, DELETE
- <input type="hidden" name="_method" value="DELETE">
- HiddenHttpMethodFilter.class
- ;
- class 파일 java 파일로 읽어 들이기
- pom.xml; L238; maven-eclipse-plugin
- ;
- User
- java bean 규약
- getter, setter method
- default contructor(기본 생성자)
- ;
- boolean: Boolean -> getter; is* : get*
- ;
- lombok
- ;
- 서블릿 api에 종속되지 않도록
- ;;
- HandlerMethodArgumentResolver
- annotaion 활용

### 12
* 요청에 따라 응답을 다른 형태로 보내기
- Content Negotiation View Resolver
- url에 따라 형태 반환 다르게
- Header, Accept를 다르게 요청하면 반환 다르게

* 기존 시스템(코드) -> 새로운 시스템(코드)
- 기존 방식은 기존 시스템에서는 핫픽스만, 새로운 시스템 재개발
- 달리는 마차에 바퀴를 바꿔끼우기

* dispatcher servlet 과 RequestMapping 사이에 한단계 추상화
- HandlerAdapter
- viewResolver 와 비슷한 추상화 방식
- 
