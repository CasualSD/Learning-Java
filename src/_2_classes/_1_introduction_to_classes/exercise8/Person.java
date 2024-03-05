package _2_classes._1_introduction_to_classes.exercise8;

public class Person {

    private String name;
    private Person mother;
    private Person father;

    public Person(String name, Person mother, Person father) {
        this.name = name;
        this.mother = mother;
        this.father = father;
    }

    public boolean isSiblingOf(Person person) {
        // Return "true" if this object is the sibling of the person given as a parameter
        if (person.father.equals(this.father) || person.mother.equals(this.mother)){
            return true;
        } 
        return false;
    }

    public boolean isGrandparentOf(Person person) {
        // Return "true" if this object is the grandparent of the person given as a parameter
        if(person.father.father.equals(this) || person.father.mother.equals(this) 
        || person.mother.father.equals(this) || person.mother.mother.equals(this)){
            return true;
        }
        return false;
    }

    public boolean isGrandchildOf(Person person) {
        // Return "true" if this object is the grandchild of the person given as a parameter
        if(this.father.father.equals(person) || this.father.mother.equals(person) 
        || this.mother.father.equals(person) || this.mother.mother.equals(person)){
            return true;
        }
        return false;
    }

    // The next two methods are for the brave of heart! These methods can be quite difficult to implement.

    public boolean isAncestorOf(Person person) {
        // Return "true" if this object is an ancestor of the person given as a parameter
        if (this.equals(person.mother) || this.equals(person.father)) {
            return true;
        }

        return (this.isAncestorOf(person.mother) || this.isAncestorOf(person.father));
    }

    public boolean isDescendantOf(Person person) {
        // Return "true" if this object is a descendant of the person given as a parameter
        return false;
    }
}
