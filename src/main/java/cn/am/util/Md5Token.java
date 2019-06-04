package cn.am.util;

import java.security.MessageDigest;

/**
 * MD5加密算法
 *
 */
public class Md5Token {

	private static char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
	private static Md5Token instance = null;
	private Md5Token() {
	}
	public synchronized static Md5Token getInstance() {
		if(instance==null){
			instance=new Md5Token();
		}
		return instance;
	}
	/**
	 * ����16λ��������
	 * @param arg0
	 * @return
	 */
	public String getShortToken(String arg0) {
		return encoder(arg0).substring(8,24);
	}
	/**
	 * 32bit密文
	 * @param arg0
	 * @return
	 */
	public String getLongToken(String arg0) {
		return encoder(arg0).toString();
	}
	/**
	 * 64bit密文
	 * @param arg0
	 * @return
	 */ 
	public String getLongLongToken(String arg0) {
		return encoder(arg0).substring(0,64);
	}
		
	private StringBuffer encoder(String arg){
		if(arg==null){
			arg="";
		}
		MessageDigest md5 = null;
		try {
			md5=MessageDigest.getInstance("MD5");
			
		
			md5.update(arg.getBytes("utf-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return toHex(md5.digest());
	}
	private StringBuffer toHex(byte[] bytes) {
		StringBuffer str = new StringBuffer(64);
		int length=bytes.length;
		for (int i = 0; i < length; i++) {
			str.append(hexDigits[(bytes[i] & 0xf0) >> 4]);
			str.append(hexDigits[bytes[i] & 0x0f]);
			str.append(hexDigits[bytes[i] & 0x0f]);
			str.append(hexDigits[bytes[i] & 0x0f]);
		}
		return str;
	}
	
	public static void main(String args[])
	{
		String password = "123456";
		String p = Md5Token.getInstance().getLongToken(password);
		System.out.print(p);
	}
}
