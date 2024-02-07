package Exceptions;

public class HandleException {

    static float something(int a) throws ClassNotFoundException {
        if (a > 10) {
            throw new ClassNotFoundException();
        }
        return a;
    }

    static float divide(int a, int b) throws ArithmeticException{
        return a / b;
    }

    public static void main(String[] args) throws ClassNotFoundException {

        try {
            something(11); //throws a compiletime exception
        } catch (ClassNotFoundException e) {
            System.out.println("Exception found : " + e.getMessage());
            throw e;
        }
        try{
            divide(10, 0);
        }catch(ArithmeticException e){
            System.out.println("Exception found : "+ e);
            throw e;
        }


        System.out.println("Hello world");
    }
}

