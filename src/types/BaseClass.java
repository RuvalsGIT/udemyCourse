package types;

public class BaseClass{
    int i = 0;
    int x = 0;

    int []n;

    public BaseClass(int [] n){
        this.n = n;
    }

    public int sumDoWhile(int[] n){
        do{
            x = x + n[i];
            i++;
        }
        while (i <= n.length);
        return x;
    }

        }