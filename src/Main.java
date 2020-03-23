public class Main {
    public static void main(String[] args) {
        Fan fan1=new Fan();
        Fan fan2=new Fan();

        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setStatus(true);
        System.out.print("Fan1: \n"+fan1.toString());

        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setStatus(false);
        System.out.print("\nFan2: \n"+fan2.toString());
    }
}
