import java.util.Scanner;

public class testcircullist {
    public static void main(String[] args) {
        cirucullylinkedlist<String>list=new cirucullylinkedlist<>();
        Scanner in =new Scanner(System.in);
        int choice=-1;
        System.out.println("1 Add first\n "+
                "2 add last\n"+
                "3 remove\n"+
                "4 rotate\n"+
                "0 exit");
        while (choice!=0)
        {
            System.out.println("your choice");
            choice= in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("input name");
                    list.addFirst(in.next());
                    System.out.println("First= "+list.first()+
                            "\tlast= "+list.last()+"\tsize= "+list.size());
                    break;
                case 2:
                    System.out.println("input name");
                    list.addLast(in.next());
                    System.out.println("First= "+list.first()+
                            "\tlast= "+list.last()+"\tsize= "+list.size());
                    break;
                case 3:
                    System.out.println("deleted name= "+list.removeFirst());
                    System.out.println("First= "+list.first()+
                            "\tlast= "+list.last()+"\tsize= "+list.size());
                    break;
                case 4:
                    list.rotate();
                    System.out.println("First= "+list.first()+
                            "\tlast= "+list.last()+"\tsize= "+list.size());
                    break;
                case 0:
                        System.exit(0);
            }

        }
    }
}
