package Exceptions;

public class DivideByZero {
    static float divide(int a, int b) throws DenominatorZeroException, CenturianException{
        if(b == 0){
            throw new DenominatorZeroException("Denominator cannot be zero");
        }
        if(b==100){
            throw new CenturianException();
        }
        return a/b;
    }

    public static void main(String[] args) {
        if(true){
            return;
        }
        try{
            divide(10,10);
            return;
        }catch(DenominatorZeroException e){
            System.out.println(e.getMessage());
        }catch(CenturianException e){
            //centurian specific logic
        }
        catch(Exception e){
            System.out.println("Exception occured : "+ e.getMessage());
            throw e;
        }
        finally {
            System.out.println("I will always execute");
        }


    }
}
