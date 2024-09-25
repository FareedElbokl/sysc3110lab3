import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private ArrayList<BuddyInfo> buddies;

    public AddressBook(){
     this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if (buddy != null){
            buddies.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index){

        if (index >= 0 && index < buddies.size()){
            return buddies.remove(index);
        }

        return null;
    }

    public void newMethod(){
        System.out.println("Testing new branch");
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Joe", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
        System.out.println("This text was added in github");

    }
}
