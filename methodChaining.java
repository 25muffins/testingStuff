
public class methodChaining {

    int x = 1;
    public methodChaining printHi(){
        System.out.print("hi");
        return this;
    }

}
class class2 {
    public static methodChaining c = new methodChaining();

    public static void main(String[] args) {
        System.out.println(c.x);
        c
                .printHi()
                .printHi()
                .printHi()
                .printHi();



    }

}
