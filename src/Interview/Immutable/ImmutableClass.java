package Interview.Immutable;

import java.util.HashSet;
import java.util.Set;

// All premitive data types are immutable
public final class ImmutableClass {//final

    private final int id; //final
    private final String name;//final
    private final Set<Integer> set;//final
    public ImmutableClass(int id,String name,Set<Integer> set){
        this.id=id;
        this.name=name;
        this.set=new HashSet<>(set);//create deepcopy for nonmutable fields in constructor
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Set<Integer> getSet(){
        return new HashSet<>(set);//create deepcopy for nonmutable fields in getter methods
    }
}
