package composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Composant {
    private final List<Composant> listComposents = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public Composant addComponent(Composant comp) {
        comp.level = this.level + 1;
        listComposents.add(comp);
        return comp;
    }

    @Override
    public void show() {
        System.out.println(tab() + "folder : " + name);
        for (Composant c : listComposents) {
            c.show();
        }
    }



}
