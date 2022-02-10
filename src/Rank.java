public enum Rank {
    two("Two", 2),
    three("Three", 3),
    four("Four", 4),
    five("Five", 5),
    six( "Six", 6),
    seven("Seven", 7),
    eight("Eight", 8),
    nine("Nine", 9),
    ten("Ten", 10),
    jack("Jack", 11),
    queen("Queen", 12),
    king("King", 13),
    ace("Ace", 14);

    private final String name;
    private final int val;

    Rank(String name, int val){
        this.name = name;
        this.val = val;
    }

    public String getName(){
        return this.name;
    }

    public int getVal(){
        return this.val;
    }

}
