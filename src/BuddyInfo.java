public class BuddyInfo {

    private String name;
    private String address;
    private String number;

    //parameterized constructor
    public BuddyInfo(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    //default constructor
    public BuddyInfo(){
        this.name = "Default name";
        this.address = "Default address";
        this.number = "Default number";
    }

    //getter for name
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer", "Default address", "Default number");
        System.out.println("Hello " + buddy.getName());
    }
}
