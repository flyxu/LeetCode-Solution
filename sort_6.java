import java.util.ArrayList;

public class sort_6 {
	public static String convert(String s, int nRows) {
		 if (s == null || s.isEmpty()) {
	            return s;
	        }
		 int length = s.length();
	      if (length <= nRows || nRows == 1) {
	            return s;
	      }
	      StringBuilder sb = new StringBuilder();
	      int step = 2 * (nRows - 1);
	      for (int i = 0; i < nRows; i++){
	    	  int interval=step-2*i;
	    	  for(int j=i;j<length;j+=step){
	    		  sb.append(s.charAt(j));
	    		  //每一轮以插值的形式插入
	    		  if(i!=0&&i!=nRows-1&&j+interval<length){
	    			  sb.append(s.charAt(j+interval));
	    		  }
	    	  }
	      }
	      return sb.toString();
	      

	}
	public static void main(String[] args) {
		String string="PAYPALISHIRING";
		int rows=3;
		System.out.println(convert(string, rows));
	}

}
