package composite_pattern;

public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("programmation");
        Folder d1 = (Folder) root.addComponent(new Folder("web"));
        Folder d2 = (Folder) root.addComponent(new Folder("mobile"));
        Folder d3 = (Folder) root.addComponent(new Folder("data"));
        d1.addComponent(new File("html/css"));
        d1.addComponent(new File("javascript"));

        d2.addComponent(new File("android"));

        d2.addComponent(new File("flutter"));
        d3.addComponent(new File("pyhton"));
        d3.addComponent(new File("keras"));
        d3.addComponent(new File("tensorflow"));


        root.show();
    }
}
