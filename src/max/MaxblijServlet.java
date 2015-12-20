package max;
import java.io.IOException;

import javax.servlet.http.*;

import java.math.*;

@SuppressWarnings("serial")
public class MaxblijServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String var1 = req.getParameter("var1");
		double i1 = Double.parseDouble(var1);
		
		String var2 = req.getParameter("var2");
		double i2 =  Double.parseDouble(var2);
		
		resp.getWriter().println(opred(i1, i2));
	}
public static String opred(double a,double b){
	double a1,b1;// =Math.abs(10-a)
	String ret;
	if (a>10){
		a1= a - 10;
	} else a1=10-a;
	if (b>10){
		b1 = b - 10;
	} else b1= 10-b;
	
	if(a1<0){
		a1 = a1 -10;
	}
	if(b1<0){
		b1 = b1 -10;
	}
	
	if (Math.abs(a1)>Math.abs(b1)){
		ret = Double.toString(b);
	}else ret = Double.toString(a);	
	return ret;
}


}
