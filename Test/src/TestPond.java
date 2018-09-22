public class TestPond
{
public static void main(String[] args)
{
Pond aPond = new Pond();
Froggie f1 = new Froggie(aPond);
f1.wakeup();
System.out.println(f1);
Froggie f2 = new Froggie(aPond);
System.out.println(f2);
}
}