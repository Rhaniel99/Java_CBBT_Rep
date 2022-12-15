import javax.lang.model.util.ElementScanner14;

// A partir da hora do dia, informe a mensagem adequada: Bom dia. Boa tarde. Boa noite.

public class DateOfDay {
    public static void dayTime(int time){
        if (time >= 0 && time <= 11 ){
            System.out.print("Bom dia, flor.");
        } else if (time >= 12 && time <= 17){
            System.out.print("Boa tarde, flor.");
        } else if (time >= 18 && time <= 23){
            System.out.print("Boa noite, flor.");
        }else{
            System.out.print("Insira uma data válida.");
        }
    }
}
