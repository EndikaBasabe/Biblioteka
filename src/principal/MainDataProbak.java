package principal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MainDataProbak {

	public static void main(String[] args) throws ParseException {
		// TODO Apéndice de método generado automáticamente

		SimpleDateFormat eus_formatua = new SimpleDateFormat("yyyy-MM-dd");
		
		Date f1 = eus_formatua.parse("2017-02-24");
		
		
		System.out.println("Sartu aratuste-en fetxa euskera formatuan 'yyyy-MM-dd'");
		Scanner scan = new Scanner(System.in);
		
		String aratusteak = scan.nextLine();
		
		Date f2 = eus_formatua.parse(aratusteak);
				
		int dias = (int) ((f2.getTime() - f1.getTime())/(1000*24*60*60));
		
		System.out.println("Quedan " + dias + " dias!");
		
		System.out.println(dias*24 + " horas!");
		
		GregorianCalendar gc2 = new GregorianCalendar();
		gc2.setTime(f2);
		
		System.out.println("f2 en formato 'yyyy-MM-dd' " + eus_formatua.format(gc2.getTime()));
	}

	
}
