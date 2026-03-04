class Bank{
    int RateOfInterest(){
        return  0;
    }
}
class SBI extends Bank{
    int RateOfInterest(){
        return  9;
    }
}
class ICIC extends Bank{
    int RateOfInterest(){
        return  8;
    }
}
class AXIS extends Bank{
    int RateOfInterest(){
        return  7;
    }
}
public class Overriding2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICIC i = new ICIC();
        AXIS a = new AXIS();
        System.out.println("SBI,Rate Of Interest:"+s.RateOfInterest());
        System.out.println("ICIC,Rate Of Interest:"+i.RateOfInterest());
        System.out.println("AXIS,Rate Of Interest:"+a.RateOfInterest());
    }
}
