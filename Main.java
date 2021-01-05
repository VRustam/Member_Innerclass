package AbstracSinif.Member_Innerclass;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Calculator.Topla toplayan = cal.new Topla();
        int toplam = toplayan.topla(3,1);
        System.out.println(toplam);

        Calculator.Cixma cixacaq = cal.new Cixma();
        int cixan = cixacaq.cixma(8,4);
        System.out.println(cixan);

        int vuran = cal.vuran1(4,5);
        System.out.println(vuran);

       String bolum =  cal.BolmeEle(10,3);
       if(!bolum.equals("")){
           System.out.println( "Bolum :  " + bolum);
       }


    }
}
