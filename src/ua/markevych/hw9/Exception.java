package ua.markevych.hw9;

class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}
class Main{
    public static void main(String[] args){
        try{
            MyException exc = new MyException("error");
            throw exc;
        }
        catch(MyException ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("We were here");

        }
    }
}
