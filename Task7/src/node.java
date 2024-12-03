import java.util.ArrayList;
import java.util.List;

public class node {
    private String name;
    private List<node> connectedNodes = new ArrayList<>();

    public node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void connectTo(node node) {
        connectedNodes.add(node);
    }

    public List<node> getConnectedNodes() {
        return connectedNodes;
    }

    @Override
    public String toString() {
        return name;
    }
}
