package estudos.datas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		
		LocalDate agora = LocalDate.now();
        System.out.println("Agora: "+agora);
        
        LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);

        Period periodo = Period.between(agora, dataFutura);
        
        System.out.println("Diferença entre "+agora+" e "+dataFutura);
        System.out.println(periodo);
                
        System.out.println("Dias: "+periodo.getDays());
        System.out.println("Meses: "+periodo.getMonths());
        System.out.println("Anos: "+periodo.getYears());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = formatter.format(dataFutura);
        
        System.out.println(dataFormatada);
        
        System.out.println("Daqui a 5 anos será: "+formatter.format(agora.plusYears(5)));
	}
}
