public class Gnome {

    // Intance variables

    public String name;
    public int age;
    public Gnome gnomeBuddy;
    private boolean magical = false;
    protected double height = 2.6;
    public static final int MAX_HEIGHT = 3; // maximum height

    // Constructors;

    Gnome(String nm, int ag, Gnome bud, double hgt){
        // fully parametrised

        name = nm;
        age = ag;
        gnomeBuddy = bud;
        height = hgt;

    }

    Gnome(){// Default Constructor

        name = "Rumple";
        age = 204;
        gnomeBuddy = null;
        height = 2.1;
    
    }

    // Methods

    public static void makeKing(Gnome h) {
        h.name = "King" + h.getRealName();
        h.magical = true; // Only the Gnome can reference this field
    }
    public void makeMeKing (){
        name = "King " + getRealName();
        magical = true;
    }    

    public boolean isMagical() {return magical;}
    public void setHeight(int newHeight) {height = newHeight; }
    public String getName() { return " I wont tell!";}
    public String getRealName() {return name; }
    public void renameGnome(String s) { name = s;}
    }
    
