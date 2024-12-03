public abstract class graph {
    protected node currentNode;

    public abstract void createNode(String name);
    public abstract void addEdge(String from, String to);
    public abstract gr build();
}
