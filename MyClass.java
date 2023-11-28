public class MyClass
 
{

    private
 
int number;

    public
 
MyClass(int number)
 
{
        this.number = number;
    }

    public
 
int
 
getNumber()
 
{
        return number;
    }

    public static int doubleNumber(int number) {
        return number * 2;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass(10);
        int doubledNumber = doubleNumber(myClass.getNumber());
        printMessage("The doubled number is: " + doubledNumber);
    }
}