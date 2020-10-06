# 로깅 1부: 스프링 부트 기본 로거 설정
로깅 퍼사드 VS 로거
● Commons Logging, SLF4j
● JUL, Log4J2, Logback
스프링 5에 로거 관련 변경 사항
● https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/overview.ht
ml#overview-logging
● Spring-JCL
○ Commons Logging -> SLF4j or Log4j2
○ pom.xml에 exclusion 안해도 됨.
스프링 부트 로깅
● 기본 포맷
● --debug (일부 핵심 라이브러리만 디버깅 모드로)
● --trace (전부 다 디버깅 모드로)
● 컬러 출력: spring.output.ansi.enabled
● 파일 출력: logging.file 또는 logging.path
● 로그 레벨 조정: logging.level.패지키 = 로그 레벨
# 로깅 2부: 커스터마이징
https://docs.spring.io/spring-boot/docs/current/reference/html/howto-logging.html
커스텀 로그 설정 파일 사용하기
● Logback: logback-spring.xml
● Log4J2: log4j2-spring.xml
● JUL (비추): logging.properties
● Logback extension
○ 프로파일 <springProfile name=”프로파일”>
○ Environment 프로퍼티 <springProperty>
로거를 Log4j2로 변경하기
● https://docs.spring.io/spring-boot/docs/current/reference/html/howto-logging.html#ho
wto-configure-log4j-for-logging
