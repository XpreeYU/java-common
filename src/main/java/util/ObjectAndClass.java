package util;

import java.util.Map;

import org.apache.commons.beanutils.BeanMap;
import org.apache.commons.beanutils.BeanUtils;

/**
 * 
 * @title ObjectAndClass
 *
 * @explain 用于处理对象与Map之间转换(采用Apache.common)
 * @author yujiansong
 * @date 2016年9月7日
 */
public class ObjectAndClass {

	public static Object mapToObject(Map<String, Object> map, Class<?> beanClass) throws Exception {    
        if (map == null)  
            return null;  
  
        Object obj = beanClass.newInstance();  
  
        BeanUtils.populate(obj, map);  
  
        return obj;  
    }    
      
    public static Map<?, ?> objectToMap(Object obj) {  
        if(obj == null)  
            return null;   
  
        return new BeanMap(obj);  
    }    
}
