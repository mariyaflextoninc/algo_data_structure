import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.acl.Group;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class ExtractQueryStrings {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		HashMap<String,ArrayList<String>> map = (HashMap<String, ArrayList<String>>) getParams("https://www.google.com/search?q=regex+javascript&rlz=1C1CHBF_enUS735US736&oq=regex+&aqs=chrome.5.69i57j69i60l2j69i59j0l2.10589j0j7&sourceid=chrome&ie=UTF-8");
		for(Map.Entry<String, ArrayList<String>> entry : map.entrySet()){
			System.out.println("\nKey ="+entry.getKey());
			for(String st : entry.getValue()){
				System.out.print("values ="+st);
			}
		}
	}
	
	public static Map<String,ArrayList<String>> getParams(String url) throws UnsupportedEncodingException{
		Pattern pattern = Pattern.compile("^http:|https:.*\\?(.*)");
		Matcher matcher = pattern.matcher(url);
		matcher.find();
		String str = matcher.group(1);
		System.out.println("result ="+str);
		HashMap<String,ArrayList<String>> map = new HashMap();
		
		if(str != null){
			String[] strs = str.split("&");
			if(strs.length > 1){
				for(String keyValues : strs ){
					String[] kvPair = keyValues.split("=");
					String key = URLDecoder.decode(kvPair[0],"UTF-8");
					String value = URLDecoder.decode(kvPair[1], "UTF-8");
					ArrayList<String> values = map.get(key);
					if(values == null){
						values = new ArrayList<String>();
						map.put(key, values);
					}
					values.add(value);
				}
			}
		}
		return map;
	}

}
