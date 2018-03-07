package com.cgf.learningtesting;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
// hamcrest库提供了可读性更好的API
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(MockitoJUnitRunner.class)
public class ExampleUnitTest {
    private static final String FAKE_STRING = "HELLO WORLD";

    @Mock
    private Context context; // 本来在单元测试中是无法调用Android API的，Mockito框架开辟了一条通道
    @Test
    public void addition_isCorrect() throws Exception {
        when(context.getString(R.string.app_name)).thenReturn(FAKE_STRING);
        String result =FAKE_STRING ;

        assertThat(result, is(FAKE_STRING));
    }
}