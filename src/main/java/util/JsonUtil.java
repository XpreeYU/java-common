package util;

import java.io.IOException;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.alibaba.fastjson.JSON;

/**
 * 
 * @title JsonUtil
 *
 * @explain json数据处理工具类
 * @author yujiansong
 * @date 2016年9月7日
 */
public class JsonUtil{
	private static ObjectMapper mapper = new ObjectMapper();
	
	public static <T>T convertJson2Object(String content, Class<T> valueType){
		if(content == null || content.equals("")) 
			return null;
		return JSON.parseObject(content, valueType);
	}
	
	public static String convertObject2Json(Object obj) {
		return JSON.toJSONString(obj, true);
	}
	
	public static Map<String, Object> convertJson2Map(String content){
		try {
			return mapper.readValue(content,  new TypeReference<Map<String,Object>>() { });
		} catch (IOException e) {
		}
		return null;
	}
}
