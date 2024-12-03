import java.util.ArrayList;
import java.util.List;
// абстрактный класс, который будет строиться с использованием паттерна строитель
public class gr {
    private List<node> nodes = new ArrayList<>();

    public void addNode(node node) {
        nodes.add(node);
    }

    public List<node> getNodes() {
        return nodes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (node node : nodes) {
            sb.append("Узел: ").append(node.getName()).append(", подключенный к: ");
            for (node connectedNode : node.getConnectedNodes()) {
                sb.append(connectedNode.getName()).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}