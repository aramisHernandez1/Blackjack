public class Card {
    String value;
    String type;

    Card(String value, String type){
        this.value = value;
        this.type = type;
    }
    

    //Override toString method, and add dash to match png image names.
    public String toString(){
        return this.value + "-" + this.type;
    }
}
