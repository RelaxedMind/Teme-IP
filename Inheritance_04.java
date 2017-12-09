import java.util.Random;

class car {
        int top_speed;
        int fuel_in_gallons;

        car(int inSpeed, int inGallons)
        {
                top_speed = inSpeed;
                fuel_in_gallons = inGallons;
        }

        void howMuchFuel()
        {
                System.out.println("There is " + fuel_in_gallons +
                                        " left.");
        }
}

class Honda extends car {
        String model;
        Honda(String theModel, int inSpeed, int inFuel)
        {
                super(inSpeed, inFuel);
                model = new String(theModel);
        }

        void howMuchFuel()
        {
                System.out.println("My Honda " + model +
                                   " has " + fuel_in_gallons +
                                   " left.");
        }
}

class Dodge extends car {
        String model;
        Dodge(String theModel, int inSpeed, int inFuel)
        {
                super(inSpeed, inFuel);
                model = new String(theModel);
        }

        void howMuchFuel()
        {
                System.out.println("My Dodge " + model +
                                   " has " + fuel_in_gallons +
                                   " left.");
        }
}

class tstVirtual {
        static Random dice = new Random();

        static car get_a_car()
        {
                if (dice.nextInt() % 2 == 0)
                        return new Dodge("Caravan",90,20);
                else
                        return new Honda("Civic",70,10);
        }

        public static void main(String args[])
        {
                car theCar;
                for (int i=0; i < 5; i++)
                {
                        theCar = get_a_car();
                        theCar.howMuchFuel();
                }
        }
}
