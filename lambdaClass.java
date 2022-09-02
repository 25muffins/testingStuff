class lambdaClass{
    public static void main(String[] args) {
        printThing(() -> System.out.println("hi"));
    }
    static void printThing(Printable thing){
        thing.print();
    }
}
interface Printable {
    void print();
}
