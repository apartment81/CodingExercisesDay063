package ro.mirodone;

public class RecursionSum {

    int sum ( int n) {

        if (n==0)
            return 0;
        else
            return sum(n-1)+n;

    }

}
