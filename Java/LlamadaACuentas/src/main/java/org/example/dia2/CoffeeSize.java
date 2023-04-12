package org.example.dia2;

public enum CoffeeSize {
    BIG(8), HUGE(10){
        @Override
        public String getLidCode(){
            return "B";
        }
    }, OVERWHELMING(16){
        @Override
        public String getLidCode(){
            return "A";

        }
    };
    CoffeeSize(int ounces){
        this.ounces = ounces;
    }

    public int getOunces() {
        return ounces;
    }

    private int ounces;

    public String getLidCode(){
        return "C";
    }

    public static void main(String[] args) {

        CoffeeSize coffeeSize = CoffeeSize.OVERWHELMING;
        System.out.println("This is the Lid code of an OVERWHELMING "+ CoffeeSize.OVERWHELMING.ounces +" Coffee: "+OVERWHELMING.getLidCode());
        System.out.println(coffeeSize.getLidCode());
        System.out.println(coffeeSize.toString());
        CoffeeSize coffeeSize1 = CoffeeSize.HUGE;
        System.out.println("This is the Lid code of an HUGE "+ CoffeeSize.HUGE.ounces +" Coffee: "+HUGE.getLidCode());
        System.out.println(coffeeSize1.getLidCode());
        System.out.println(coffeeSize1.toString());
        CoffeeSize coffeeSize2 = CoffeeSize.BIG;
        System.out.println("This is the Lid code of an BIG "+ CoffeeSize.BIG.ounces +" Coffee: "+BIG.getLidCode());
        System.out.println(coffeeSize2.getLidCode());
        System.out.println(coffeeSize2.toString());

    }

    @Override
    public String toString(){
        switch(this){
            case HUGE -> {
                System.out.println("HUGE: " + ounces);

            }
            case BIG -> {
                System.out.println("BIG: "+ounces);

            }
            case OVERWHELMING -> {
                System.out.println("Overwhelming: " + ounces);

            }
            default -> throw new IllegalStateException("Unexpected value: " + this);
        }
        return super.toString();
    }

}
