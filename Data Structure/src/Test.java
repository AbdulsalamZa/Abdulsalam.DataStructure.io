import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        Singlylist<String> numlist = new Singlylist<>();
        numlist.addfirst("ali");
        numlist.addlast("hell");
        System.out.println("Size of list=" + numlist.size());
        System.out.println("First element=" + numlist.first());
        System.out.println("last element=" + numlist.last());

        for (int i=0;i<5;i++){
            numlist.addfirst(in.next());
        }
        for (int i=0;i<5;i++){
            System.out.println(numlist.removefirst()+"\t");
        }

        System.out.println("size of list="+numlist.size());
        System.out.println("size of list="+numlist.first());
        System.out.println("size of list="+numlist.last());

    }
}

