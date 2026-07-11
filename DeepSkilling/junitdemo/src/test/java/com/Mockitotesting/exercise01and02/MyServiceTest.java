package com.Mockitotesting.exercise01and02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MyServiceTest {

    @Test
    void testExternalApi() {

        ExternalApi Api = mock(ExternalApi.class);

        when(Api.getData()).thenReturn("mock data");

        MyService ser = new MyService(Api);

        String re = ser.data();

       assertEquals("Processed: mock data", re);
    }

    @Test
    void verifyTestInteraction() {

        ExternalApi Api = mock(ExternalApi.class);

        MyService ser = new MyService(Api);

        ser.data();

        verify(Api).getData();
    }
}