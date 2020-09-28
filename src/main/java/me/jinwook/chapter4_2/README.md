# 외부 설정
사용할 수 있는 외부 설정
● properties
● YAML
● 환경 변수
● 커맨드 라인 아규먼트
프로퍼티 우선 순위
1. 유저 홈 디렉토리에 있는 spring-boot-dev-tools.properties
2. 테스트에 있는 @TestPropertySource
3. @SpringBootTest 애노테이션의 properties 애트리뷰트
4. 커맨드 라인 아규먼트
5. SPRING_APPLICATION_JSON (환경 변수 또는 시스템 프로티) 에 들어있는
프로퍼티
6. ServletConfig 파라미터
7. ServletContext 파라미터
8. java:comp/env JNDI 애트리뷰트
9. System.getProperties() 자바 시스템 프로퍼티
10. OS 환경 변수
11. RandomValuePropertySource
12. JAR 밖에 있는 특정 프로파일용 application properties
13. JAR 안에 있는 특정 프로파일용 application properties
14. JAR 밖에 있는 application properties
15. JAR 안에 있는 application properties
16. @PropertySource
17. 기본 프로퍼티 (SpringApplication.setDefaultProperties)
application.properties 우선 순위 (높은게 낮은걸 덮어 씁니다.)
1. file:./config/
2. file:./
3. classpath:/config/
4. classpath:/

# 외부설정 4_2
 외부 설정 2부
타입-세이프 프로퍼티 @ConfigurationProperties
● 여러 프로퍼티를 묶어서 읽어올 수 있음
● 빈으로 등록해서 다른 빈에 주입할 수 있음
○ @EnableConfigurationProperties
○ @Component
○ @Bean
● 융통성 있는 바인딩
○ context-path (케밥)
○ context_path (언드스코어)
○ contextPath (캐멀)
○ CONTEXTPATH
● 프로퍼티 타입 컨버전
○ @DurationUnit
● 프로퍼티 값 검증
○ @Validated
○ JSR-303 (@NotNull, ...)
● 메타 정보 생성
● @Value
○ SpEL 을 사용할 수 있지만...
○ 위에 있는 기능들은 전부 사용 못합니다.
