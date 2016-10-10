package inheritance;

/**
 * This program demonstrates inheritance.
 * @version 1.21 2016-10-10
 * @author Cay Horstmann
 */
public class ManagerTest
{
    public static void main(String[] args)
    {
	// construct a Manager object
	Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
	boss.setBonus(5000);

	Employee[] staff = new Employee[3];

	// fill the staff array with Manager and Employee objects
	for (Employee e: staff)
	    System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }
}
