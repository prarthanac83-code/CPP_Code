interface character{
    void attack();
}
interface weapon{
    void use();
}

class Warrior implements character , weapon{
    public void attack(){
        System.out.println("Warrior attacks with Sword");
    }
    public void use(){
    System.out.println("Warrior attacks with Sword");
    }
}

class Mage implements character , weapon{
    public void attack(){
        System.out.println("Mage attacks with a wand");
    }
    public void use(){
        System.out.println("Mage uses a wand");
    }
}

public class Multiple {
    public static void main(String args[]){
        Warrior w = new Warrior();
        Mage m = new Mage();
        
        w.attack();
        w.use();

        m.attack();
        m.use();
    }
    
}
