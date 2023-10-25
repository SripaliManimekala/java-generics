public class example {
    public static void main(String[] args){
        Print<Integer> p1 = new Print<>(10);
        p1.printData();
        Print<String> p2 = new Print<>("hello");
        p2.printData();
    }
}

class Print<T>{//type i s assign dynamically when run
    private T x;
    Print(T x){//use generics with constructor
        this.x = x;
    }
    public void printData(){
        System.out.println(x);
    }
}