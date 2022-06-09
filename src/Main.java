public class Main {

    public static void main(String[] args) {

        Fighter f1=new Fighter("A",15,100,100,35);
        Fighter f2=new Fighter("B",15,100,90,35);

        Match match=new Match(f1,f2,90,100);
        match.Versus();
    }
}
