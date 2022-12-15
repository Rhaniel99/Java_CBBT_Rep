public class Loan {
    public static int getTwoParcel(){
        return 2;
    }
    
    public static int getTreeParcel(){
        return 3;
    }
    
    public static double getTaxTwoParcel(){
        return 0.3;
    }

    public static double getTaxTreeParcel(){
        return 0.45;
    }

    public static void calculation(double value, int parcel){
        if (parcel == 2){
            double valueFinal = value + (value + getTaxTwoParcel());
            System.out.print("Valor final do empréstimo para 2 parcelas: R$ " + valueFinal);
        }else if ( parcel == 3){
            double valueFinal = value + (value + getTaxTreeParcel());
            System.out.print("Valor final do empréstimo para 3 parcelas: R$ " + valueFinal);
        } else {
            System.out.print("Parcelas incorretas.");
        }
    }
}
