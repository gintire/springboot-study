package me.jinwook.sample;

import me.jinwook.chapter4_4_test.SampleController;
import me.jinwook.chapter4_4_test.SampleService;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.system.OutputCaptureRule;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class)
public class SampleWebMvcTest {
    // Junit을 확장해서 만듬
    // 콘솔에 보이는 모든 것을 캡쳐 ( 로그 포함 )
    @Rule
    public OutputCaptureRule outputCapture = new OutputCaptureRule();

    @MockBean
    SampleService mockSampleService;

    @Autowired
    MockMvc mockMvc;
    @Test
    public void hello() throws Exception {
        when(mockSampleService.getName()).thenReturn("jinwook service");

        mockMvc.perform(get("/hello"))
                .andExpect(content().string("hello jinwook service"));

        assertThat(outputCapture.toString())
                .contains("holoman")
                .contains("skip");
    }
}
