/**
 * @author Nalini Oliver
 * Resources include https://www.w3schools.com/js/js_if_else.asp and https://www.w3schools.com/java/java_data_types_numbers.asp and https://www.w3schools.blog/string-concatenation-in-java 
 */
public interface Contract {
    void grab(String item); 
    String drop(String item);
    void examine(String item);
    void use(String item);
    boolean walk(String direction);
    boolean fly(int x, int y);
    Number shrink();
    Number grow();
    void rest();
    void undo();

    /**
     * Establishes the variables associated with the methods from the Contract class, along with the variables needed to implement the methods used later on (based on how I designed these methods)
     */
    public class Butterfly implements Contract {
        String item;
        String direction;
        int x;
        int y;
        String color;
        float size;
        int age;
        String state;

        /**
         * Constructor for the Butterfly class, that defines what inputs are needed to make a new butterfly
         * @param item the item that the butterfly will "grab", "drop", "examine", and "use" (associated with those methods)
         * @param direction the direction that the butterfly will fly (associated with the walk variable)
         * @param x the starting feet that the butterfly will fly
         * @param y the amount of feet added to the starting feet that the butterfly will fly
         * @param color the color of the item 
         * @param size the size of the butterfly (numeric, not qualitative)
         * @param age the age of the item 
         * @param state the state of the butterfly (awake, asleep, alert, sleepy, etc.), will change based on the rest and undo methods
         */
        public Butterfly(String item, String direction, int x, int y, String color, float size, Integer age, String state) {
            this.item = item;
            this.direction = direction;
            this.x = x;
            this.y = y;
            this.color = color;
            this.size = size;
            this.age = age;
            this.state = state;
        }

        /**
         * Method that will cause the butterfly to grab something based on user input
         * @param item the item that the butterfly picked up 
         */
        public void grab(String item) {
            System.out.println("Grabbed" + item);
        }

        /**
         * Method that will cause the butterfly to drop something, which will be indicated by re-defining the variable and returning it
         * @param item the item that the butterfly will drop 
         */
        public String drop(String item) {
            item = "This item was dropped";
            return item;
        }

        /**
         * Method that will cause the butterfly to examine the item, including its color and age 
         * @param item the item that the butterfly will examine 
         */
        public void examine(String item) {
            System.out.println("This item is" + item + "and its color is" + color + "and most importantly this item is" + age + "years old");
        }

        /**
         * Method that will cause the butterfly to use the item, based on re-defining the item to its purpose
         */
        public void use(String item) {
            item = "broken" + item;
            System.out.println("Uh oh! The butterfly used the item, and now its" + item);

        }

        /**
         * Method that will return true if the butterfly walks in either direction (forward or backward), and return false in any other condition
         * @param direction the direction that the butterfly will walk 
         */
        public boolean walk(String direction) {
            if (direction == "forward") {
                return true;
            } else if (direction == "backward") {
                return true;
            }
            else {
                return false;
            }
        }

        /**
         * Method that will return true if the butterfly flies any number of feet (based on the x variable being a positive number). If the butterfly doesn't fly (x is a negative number) it will print out an error message
         * @param x the inital number of feet the butterfly has flown
         * @param y the additional number of feet the butterfly will fly
         */
        public boolean fly(int x, int y) {
            this.x += this.y;
            if (x > 0) {
                System.out.println("The butterfly has flown" + x + "feet! wee!");
                return true;
            }
            else {
                System.out.println("The butterfly can't fly negative feet!");
                return false;
            }
        }

        /**
         * Method that will shrink the butterfly by a interval of 10, and will return an error message if the size is less than 0
         */
        public Number shrink() {
            size =- 10;
            if (size > 0) {
                System.out.println("The butterfly has shrunk to" + size);
            } else {
                System.out.println("This butterfly has shrunk to a negative number! Its gone :(");
            }
            return size;
        }

        /** 
         * Method that will cause the butterfly to grow by an interval of 20, and will return an error message if the size is less than 0
         */
        public Number grow() {
            size =+ 20;
            if (size > 0) {
                System.out.println("The butterfly has grown to" + size);
            } else {
                System.out.println("This butterfly is the size of a negative number! Its gone :(");
            }
            return size;
        }

        /**
         * Method that will cause the butterfly to change its state to asleep when its time to rest by re-assigning the variable
         */
        public void rest() {
            state = "asleep";
            System.out.println("Time to rest, which means the butterfly state is" + state + "and its sleeping, zzzzz"); 
        }

        /**
         * Method that will cause the butterfly to change its state to awake when its time to undo the previous method by re-assigning the variable
         */
        public void undo () {
            state = "awake and moving";
            System.out.println("Time to start moving, so the butterfly state is" + state + "off it goes!"); 
        }

        public static void main(String[] args) {
            Butterfly monarchButterfly = new Butterfly("pollen", "up", 7, 12, "red", 22, 2, "sleepy");

        }

    }
    

}