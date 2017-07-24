package com.aygxy.fmaket.util;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class HttpClientUtilTest {

	@Test
	public void testHttsPostStringString() throws IOException {
		String body = "{\"grant_type\":\"client_credentials\",\"client_id\":\"YXA6FfUmwC49Eee7TLPtw00eug\",\"client_secret\":\"YXA64pHPehWy0Lg3fvsEz5ZS_iIbdsg\"}";
		HttpClientUtil.Instance().httsPost("https://a1.easemob.com/1140170501178014/fleamarket/token", body);
	}

}
