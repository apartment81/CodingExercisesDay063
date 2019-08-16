package ro.mirodone;


class Test {

    int a = 10;
    static int b = 20;

}
public class Main {

    public static void main(String[] args) {

        Test t1 = new Test();
        t1.a = 100;
        t1.b = 200;

        Test t2 = new Test();

        System.out.println(t1.a);
        System.out.println(t1.b);
        System.out.println(t2.a);
        System.out.println(t2.b);

        //=====================================================

        TheFarmProblem farm = new TheFarmProblem();
        System.out.println(farm.animals(2, 3, 5));

        System.out.println(farm.reverse(true) + "> true ");
        System.out.println(farm.reverse(false)+ "> false ");

        //=====================================================

        RecursionSum sum = new RecursionSum();
        System.out.println(sum.sum(2));


    }
}
