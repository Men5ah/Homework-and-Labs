public class Basket {
    private Thing thing1;
    private Thing thing2;
    private Thing thing3;

    public Basket(){
        thing1 = thing2 = thing3 = null;
    }

    public void addThing(Thing something){
        if (thing1 == null){thing1 = something;}
        if (thing2 == null){thing2 = something;}
        if (thing3 == null){thing3 = something;}
        else{System.out.println("Basket is full.");}
        
    }

    public Thing getThing(){
        Thing item = null;

        if (thing2 != null) {item = thing2;thing2 = null;}
        if (thing1 != null) {item = thing1;thing1 = null;}
        if (thing3 != null) {item = thing3;thing3 = null;}
        else{System.out.println("Basket is empty.");}
        return item;
    }

    public static void main(String[] args) {
        
    }
}
