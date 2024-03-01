public interface Cacli{
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