public class Test1 {

    public static final String FNAAA = "fnaaa";

    public static void main(String[] args){

    }
    private String str;

    public void fn1(String name){
        print();
        System.out.println();
    }


    public void fn2(){
        print();
    }

    public void fn3(){
        print();
        System.out.println(FNAAA);
        System.out.println(FNAAA);
        System.out.println(FNAAA);
        System.out.println(FNAAA);
        System.out.println(FNAAA);


    }

    private void print() {
        System.out.println("fn1");
        System.out.println(FNAAA);
    }
}