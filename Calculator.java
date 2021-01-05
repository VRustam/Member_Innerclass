package AbstracSinif.Member_Innerclass;

public class Calculator {

    int sayi = 0;
    public int vuran1(int a,int a1){
        Vurma vurma=new Vurma();
        int vuran = vurma.vurma(a,a1);
        return vuran;
    }

    public String BolmeEle(double sayi1,double sayi2){
        class Bolme {
            public String bolme(double a, double j) {
                if(j==0){
                    System.out.println("Bolen 0 ola bilmez...");
                    return "";
                }else {
                    double cavab = a/j;
                    return String.valueOf(cavab);
                }
            }
        }
        Bolme b=new Bolme();
        String CavabBolen =  b.bolme(sayi1,sayi2);
        return CavabBolen;
    }
    public class Topla{
        public int topla(int a,int j){
            return a+j;
        }
    }
    class Cixma{
        public  int cixma(int a,int j){
            return a-j;
        }
    }
    private class Vurma {
        public int vurma(int a, int j) {
            return a * j;
        }
    }


}
