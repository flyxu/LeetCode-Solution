
public class sort_468 {
	public String validIPAddress(String IP) {
        if(isIPV4(IP)){
        	return "IPv4";
        }
        else if(isIPV6(IP)){
        	return "IPv6";
        }
        else 
        	return "Neither";
        
    }
	public boolean isIPV4(String ip){
		if(ip.length()<7)
			return false;
		if(ip.charAt(0)=='.')
			return false;
		if(ip.charAt(ip.length()-1)=='.')
			return false;
		String[] tokens=ip.split(".");
		if(tokens.length!=4)
			return false;
		for(String token:tokens){
			if(!isIPV4token(token)){
				return false;
			}
		}
		return true;
	}
	public boolean isIPV4token(String token){
		if(token.startsWith("0")&&token.length()>1)
			return false;
		try{
			int parse=Integer.parseInt(token);
			if(parse>255||parse<0){
				return false;
			}
		}catch(NumberFormatException e){
			return false;
		}
		return true;
	}
	public boolean isIPV6(String ip){
		if(ip.length()<15)
			return false;
		if(ip.charAt(0)==':')
			return false;
		if(ip.charAt(ip.length()-1)==':')
			return false;
		String[] tokens=ip.split(":");
		if(tokens.length!=8)
			return false;
		for(String token:tokens){
			if(!isIPV6token(token)){
				return false;
			}
		}
		return true;	
	}
	public boolean isIPV6token(String token){
		if(token.length()>4||token.length()==0)
			return false;
		char[] chars = token.toCharArray();
		for(char c:chars){
			boolean isdigit=c>=48 && c<=57;
			boolean isuppercase=c>=65 && c<=70;
			boolean islowercase=c>=97&&c<=102;
			if(!(isdigit||isuppercase||islowercase)){
				return false;
			}
		}
		return true;
	}

}
