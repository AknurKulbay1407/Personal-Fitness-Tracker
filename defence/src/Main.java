public class Main {
    public void main (String[] args){
        Person person1 = new Student("Aknur", 18, 253135, "software Engineering");
        Person person2 = new Staff("Assya", 23, 254430, "Professor assistant");
        Person person3 = new Professor("Kydyrbekova Aigerim", 26, 10, "Software Egineering");
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
    }
}