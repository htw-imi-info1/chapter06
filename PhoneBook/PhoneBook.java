import java.util.*;
public class PhoneBook
{
    Map<String,Integer> phoneBook = new HashMap<>();
    public PhoneBook(){
        enterNumber("Zhang",3738);
        enterNumber("Jung",2877);
        enterNumber("Barthel",2416);
        enterNumber("Lenz",3642);
        enterNumber("Strippgen",3593);
        enterNumber("Friess",4711);
        enterNumber("Kleinen",3499);
        enterNumber("Weber-Wulff",2320);
    }

    public void enterNumber(String name, Integer number){
        phoneBook.put(name,number);
    }

    public int lookupNumber(String name){
        return phoneBook.get(name);
    }
    public static void demo(){
        PhoneBook pb = new PhoneBook();
        String name = "Strippgen";
        System.out.println("Prof. "+name+"'s phone number: "+pb.lookupNumber(name));
    }
}
