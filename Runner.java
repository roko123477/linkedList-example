import java.util.Scanner;
public class Runner
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();        
        LinkedList list=new LinkedList();
        list.insert(n1);
        list.insert(n2);
        list.insert(n3);
        list.insertAtStart(90);
        list.insertAt(0,10000);
        list.deleteAt(2);
        list.show();
    }
}
        