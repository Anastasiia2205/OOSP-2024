public class Main {
    public static void main(String[] args) {
        graph builder = new builder();
        builder.createNode("a");
        builder.createNode("b");
        builder.createNode("c");
        builder.addEdge("a", "b");
        builder.addEdge("a", "c");
        builder.addEdge("b", "c");

        gr graph = builder.build();
        System.out.println(graph);
    }
}