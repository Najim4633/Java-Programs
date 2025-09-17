import java.util.ArrayList;
import java.util.Collections;

class State implements Comparable<State> {
    String name;
    Long area;         
    Long population;   

    public State(String name, Long population, Long area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }
    public String toString()
    {
        return "\n State: "+ name+" | Population : "+population+" | Area : "+area;
    }
    //sort by name in ascending order 
    @Override
    public int compareTo(State o) {
        return this.name.compareTo(o.name);
    }
    // //sort by name in decending order
    // @Override
    // public int compareTo(State o) {
    //    return  o.name.compareTo(this.name);
    // }
    // //sort by population in ascending order 
    // @Override
    // public int compareTo(State o) {
    //    return this.population.compareTo(o.population);
    // }
    // //sort by population in decending order
    // @Override
    // public int compareTo(State o) {
    //    return o.population.compareTo(this.population);
    // }
    // //sort by area in ascending order 
    // @Override
    // public int compareTo(State o) {
    //    return this.area.compareTo(o.area);
    // }
    // //sort by area in decending order
    // @Override
    // public int compareTo(State o) {
    //    return o.area.compareTo(this.area);
    // }
    
    
}
public class StateDriver{
    public static void main(String[] args) {
        ArrayList<State> states = new ArrayList<>();
        states.add(new State("Maharashtra", 123144223l, 307713l));
        states.add(new State("Uttar Pradesh", 237882725l, 243286l));
        states.add(new State("Bihar", 128500364l, 94163l));
        states.add(new State("West Bengal", 102352036l, 88752l));
        states.add(new State("Madhya Pradesh", 85358965l, 308350l));

        System.out.println(states);
        Collections.sort(states);
        System.out.println(states);
    }
}