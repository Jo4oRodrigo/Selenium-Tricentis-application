package metodos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Utils {
	
	public static String dataFutura(int dias, int meses, int anos) {
		Date hoje = new Date();
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, dias);
		cal.add(Calendar.MONTH, meses);
		
		hoje = cal.getTime();
		return df.format(hoje);
	
	}

}
