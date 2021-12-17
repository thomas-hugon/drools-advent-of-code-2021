package day15;

import java.util.Comparator;
import java.util.PriorityQueue;

public final class Oracle {
    private final PriorityQueue<Node> nodes;

    public Oracle(Node node) {
        this.nodes = new PriorityQueue<>(Comparator.comparingInt(Node::getRiskFromSource));
        this.nodes.add(node);
    }

    public Node next() {
        return nodes.poll();
    }

    public void offer(Node node) {
        nodes.remove(node);
        nodes.offer(node);
    }

}
