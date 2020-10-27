package me.jinwook.sample;

import me.jinwook.chapter4_4_test.SampleController;
import me.jinwook.chapter4_4_test.SampleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.assertj.core.api.Assertions.*;
@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class SampleControllerTest {

    /*@Autowired
    MockMvc mockMvc;*/


    // 제일 불편함
    @Autowired
    TestRestTemplate testRestTemplate;


    // Service만 mock으로 만들수 있음
    @MockBean
    SampleService mockSampleService;

    // java 1.5 부터
    // async
    // web flux의 의존성이 추가되어야 한다.
    @Autowired
    WebTestClient webTestClient;

    @Test
    public void hello() throws Exception {
        /*mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello jinwook service"))
               .andDo(print());*/
        when(mockSampleService.getName()).thenReturn("jinwook service");

        String result = testRestTemplate.getForObject("/hello", String.class);
        assertThat(result).isEqualTo("hello jinwook service");

        webTestClient.get().uri("/hello").exchange()
                .expectStatus().isOk()
                .expectBody(String.class).isEqualTo("hello jinwook service");
    }
}
