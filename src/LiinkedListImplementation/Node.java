package LiinkedListImplementation;

public class Node {
    private int node;
    private Node nodeNext;

    public Node(int node) {
        this.node = node;
    }

    public int getNode() {
        return node;
    }

    public void setNode(int node) {
        this.node = node;
    }

    public Node getNodeNext() {
        return nodeNext;
    }

    public void setNodeNext(Node nodeNext) {
        this.nodeNext = nodeNext;
    }

    @Override
    public String toString() {
        return "node=" + node + ", nodeNext=" + nodeNext ;
    }
}
