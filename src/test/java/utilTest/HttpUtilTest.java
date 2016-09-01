/*package utilTest;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import util.HttpUtil;

*//**
 *  测试http请求
 * @author yujiansong
 *
 *//*
public class HttpUtilTest{
   
	@Test
	public void testPostHttp() throws Exception{
		String ip = "";
		String port = "";
		String app = "";
		
		//测试发送get请求---->http://localhost:8080/ydcmp/actions/org/create_org_accounts.do?orgCode=321060&accountTypes=61,62
		String url = "http://" + ip + port +app;
		System.out.println(HttpUtil.get(url));
	}
	
	@Test
	public void testgetHttp() throws Exception{
		String ip = "";
		String port = "";
		String app = "";
		Map<String, String> params = new HashMap<String, String>();
		params.put("orgCode", "321060");
		params.put("accountTypes", "61,62");
		
		//测试发送post请求---->http://localhost:8080/ydcmp/actions/org/create_org_accounts.do
		String url = "http://" + ip + port +app;
		System.out.println(HttpUtil.post(url, params));
	}
	
}
*/