import java.text.DecimalFormat;
// Classe Pessoa: Crie uma classe que modele uma pessoa:
// Atributos: nome, idade, peso e altura
// Métodos: Envelhecer, engordar, emagrecer, crescer. 
// Obs: Por padrão, a cada ano que nossa pessoa envelhece, sendo a idade dela menor que 21 anos, ela deve crescer 0,5 cm.
public class People {
    String name = "Rhaniel";
    int age = 18;
    double weight = 70;
    double height = 1.70;
    DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");



    public void getOld(){
        if (age < 21){
            ++ age;
            height = height + 0.05;
            System.out.println("Olá seu nome é: " + name + "| Sua idade é: " + age + "| Seu peso: " + weight + "| Sua altura é: " + decimalFormat.format(height));
        }else{
            ++ age;
            System.out.println("Olá seu nome é: " + name + "| Sua idade é: " + age + "| Seu peso: " + weight + "| Sua altura é: " + decimalFormat.format(height));
        }
    }
    public void gainingWeight(){
        System.out.println("Seu peso atual é: " + weight + "kg após engordar ficou com: " + (++ weight)+ "kg.");
    }
    public void loseWeight(){
        System.out.println("Seu peso atual é: " + weight + "kg após emagrecer ficou com: " + (-- weight)+ "kg.");
    }
    public void growUp(){
        System.out.println("Sua altura atual é: " + decimalFormat.format(height) + " | Sua nova altura é: " + decimalFormat.format(height = height + 0.10));
    }
}
