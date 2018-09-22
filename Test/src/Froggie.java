
public class Froggie
{
private static int idNum = 1;
private int myId;
private int numJumps;
private Pond thePond;
public Froggie(Pond thePond)
{
myId = idNum;
idNum++;
numJumps = 0;
this.thePond = thePond;
}
public void wakeup()
{ 
thePond.move(this);
jump();
jump();
}
public void jump()
{
numJumps++;
}
public int getJumps()
{
return numJumps;
}
public int getId()
{
return myId;
}
public String toString()
{
return "Frog number " + myId
 + " jumped " +
 numJumps + " times.";
}
}