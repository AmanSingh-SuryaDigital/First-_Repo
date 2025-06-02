package AbstractionExamople;

public class IndianSport extends Sport{
    @Override
    public void football(){
        System.out.println(" i am playing football");
    }

    public static void main(String[] args) {
        IndianSport in = new IndianSport();
        in.football();in.cricket();
    }
}
