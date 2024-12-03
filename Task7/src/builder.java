import java.util.HashMap;
import java.util.Map;

public class builder extends graph {
    private gr graph = new gr();
    private Map<String, node> nodes = new HashMap<>();

    @Override
    public void createNode(String name) {
        currentNode = new node(name);
        nodes.put(name, currentNode);
        graph.addNode(currentNode);
    }

    @Override
    public void addEdge(String from, String to) {
        node fromNode = nodes.get(from);
        node toNode = nodes.get(to);
        if (fromNode != null && toNode != null) {
            fromNode.connectTo(toNode);
        }
    }

    @Override
    public gr build() {
        return graph;
    }
}
