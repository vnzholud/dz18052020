package dz24052020;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Telefon {

    private HashMap<String, Set<Long>> teleonBuc = new HashMap<>();

    public void add(String name, Long telefon) {

        Set<Long> tell = teleonBuc.getOrDefault(name, new HashSet<>());

        tell.add(telefon);
    }
    public Set<Long> get(String name);{
        return teleonBuc.get(name);
    }
}
