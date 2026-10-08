package examples.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemItem {
    private String name;
    private List<FileSystemItem> items = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item) {
        items.add(item);
    }

    public void remove(FileSystemItem item) {
        items.remove(item);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "+ " + name);
        for (FileSystemItem item : items) {
            item.print(indent + "  ");
        }
    }
}
