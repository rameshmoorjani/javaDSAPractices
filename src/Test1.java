//import java.util.HashMap;
//import java.util.Map;
//
//import org.apache.commons.lang3.text.StrSubstitutor;
//
//public class Test {
//
//	public static void main(String[] args) {
//		placeHolder();
//		placeHolder1();
//		System.out.println();
//	}
//
//	/**
//	 *
//	 * Description: Braces
//	 *
//	 * All Rights Reserved.
//	 *
//	 *
//	  * April 23, 2019, 9:41:11 AM Created
//	 */
//	private static void placeHolder() {
//		Map<String, String> values = new HashMap<String, String>();
//		values.put("value", "mqliu");
//		values.put("column", "123456");
//		StrSubstitutor sub = new StrSubstitutor(values, "{{", "}}");
//		 String result = sub.replace("Hello: '{{value}}' Your verification code is: {{column}}");
//		System.out.println(result);
//	}
//	/**
//	 *
//	 * Description:${}
//	 *
//	 * All Rights Reserved.
//	 *
//	 *
//	  * April 23, 2019, 11:20:50 am Created
//	 */
//	private static void placeHolder1() {
//		Map<String, String> values1 = new HashMap<String, String>();
//		values1.put("value", "mqliu");
//		values1.put("column", "123456");
//		StrSubstitutor sub1 = new StrSubstitutor(values1, "${", "}");
//		 String result1 = sub1.replace("Hello: ${value} Your verification code is: ${column}");
//		System.out.println(result1);
//	}
//}
//
