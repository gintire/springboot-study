## 테스트
시작은 일단 spring-boot-starter-test를 추가하는 것 부터
* test 스콥으로 추가.

**@SpringBootTest**
> * @RunWith(SpringRunner.class)랑 같이 써야 함.
> * 빈 설정 파일은 설정을 안해주나? 알아서 찾습니다. (@SpringBootApplication)
> * webEnvironment
>     * MOCK: mock servlet environment. 내장 톰캣 구동 안 함.
>     * RANDON_PORT, DEFINED_PORT: 내장 톰캣 사용 함.
>     * NONE: 서블릿 환경 제공 안 함.

**@MockBean**
> * ApplicationContext에 들어있는 빈을 Mock으로 만든 객체로 교체 함.
> * 모든 @Test 마다 자동으로 리셋.

**슬라이스 테스트**
> * 레이어 별로 잘라서 테스트하고 싶을 때
> * @JsonTest
> * @WebMvcTest
> * @WebFluxTest
> * @DataJpaTest
> * ...

엇? 스프링 부트 테스트 끝난줄 알았는데...
* OutputCapture
* TestPropertyValues
* TestRestTemplate
* ConfigFileApplicationContextInitializer
