public interface Calci{
 public int getSum(int n1,int n2);
 public int getDiff(int n1, int n2);
 public int getProduct(int n1, int n2);
}
class CalciImpl implements Calci{
    public int getSum(int n1,int n2){
        return n1+n2;
    }
    public int getDiff(int n1,int n2){
        return n1-n2;
    }
    public int getProduct(int n1,int n2){
        return n1*n2;
    }
}
class DriverClass{
    public static void main(String[] args) {
        CalciImpl c = new CalciImpl();
        System.out.println(c.getSum(25, 25));
        System.out.println(c.getDiff(100, 25));
        System.out.println(c.getProduct(25, 25));
    }
}