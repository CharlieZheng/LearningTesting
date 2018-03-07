package com.cgf.learningtesting;

import android.os.Parcel;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    private LogHistory logHistory;

    @Before
    public void createLogHistory() {
        logHistory = new LogHistory();
    }

    @Test
    public void useAppContext() throws Exception {
        /*// Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.cgf.myview", appContext.getPackageName());*/

        // 验证是否正确实现Parcelable接口
        logHistory.id = 1L;
        logHistory.tag = "TAG";
        Parcel parcel = Parcel.obtain();
        logHistory.writeToParcel(parcel, logHistory.describeContents());
        parcel.setDataPosition(0);
        LogHistory createdFromParcel = LogHistory.CREATOR.createFromParcel(parcel);
        long id = createdFromParcel.id;
        String tag = createdFromParcel.tag;
        assertThat(id, is(1L));
        assertThat(tag, is("TAG"));
    }
}
