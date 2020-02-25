public class FanRunner {
    public static void main(String[] args) {

        Fan ceilingFan = new Fan("Bajaj", 2.5, "Brown");
        ceilingFan.switchOn();

        System.out.println(ceilingFan);

        ceilingFan.switchOff();
        System.out.println("*******************************************");
        System.out.println(ceilingFan);




    }
}
