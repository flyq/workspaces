class Plane
{
    float level;
}

public class AssignmentFloat
{
    public static void main(String[] args)
    {
	Plane t1 = new Plane();
	Plane t2 = new Plane();

	t1.level = 9.09f;
	t2.level = 8.08f;
	
	System.out.println("1 t1.level = " + t1.level + ", t2.level = " + t2.level);

	t1 = t2;

	System.out.println("2 t1.level = " + t1.level + ", t2.level = " + t2.level);

	t2.level = 5.05f;

	System.out.println("3 t1.level = " + t1.level + ", t2.level = " + t2.level);
    }
}
