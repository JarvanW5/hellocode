import java.util.*;

public class test {
    class Node {
        String song;
        Node prev, next;
        public Node(String song) {
            this.song = song;
        }
    }

    private final int capacity; // 限制最近播放歌曲的数量
    private Map<String, Node> map; // 哈希表存储歌曲到链表节点的映射
    private Node head, tail; // 双向链表的头尾指针

    public test(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(""); // 伪头结点
        tail = new Node(""); // 伪尾节点
        head.next = tail;
        tail.prev = head;
    }

    // 播放歌曲
    public void play(String song) {
        if (map.containsKey(song)) {
            remove(map.get(song)); // 删除旧位置
        } else if (map.size() == capacity) {
            remove(tail.prev); // 移除最久未播放的歌曲
        }
        insertAtHead(new Node(song)); // 插入到头部
    }

    // 获取上一首歌
    public String getPrev(String song) {
        if (!map.containsKey(song) || map.get(song).prev == head) {
            return null; // 头结点无上一首
        }
        return map.get(song).prev.song;
    }

    // 获取下一首歌
    public String getNext(String song) {
        if (!map.containsKey(song) || map.get(song).next == tail) {
            return null; // 尾节点无下一首
        }
        return map.get(song).next.song;
    }

    // 从链表删除节点
    private void remove(Node node) {
        map.remove(node.song);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // 插入新节点到头部
    private void insertAtHead(Node node) {
        map.put(node.song, node);
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    // 打印最近播放列表
    public void printPlaylist() {
        Node curr = head.next;
        while (curr != tail) {
            System.out.print(curr.song + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        test player = new test(5);
        player.play("Song A");
        player.play("Song B");
        player.play("Song C");
        player.printPlaylist(); // C -> B -> A -> null

        System.out.println("Prev of B: " + player.getPrev("Song B")); // C
        System.out.println("Next of B: " + player.getNext("Song B")); // A

        player.play("Song B"); // B 播放，移到最前
        player.printPlaylist(); // B -> C -> A -> null

        player.play("Song D");
        player.play("Song E");
        player.play("Song F"); // A 被淘汰
        player.printPlaylist(); // F -> E -> D -> B -> C -> null
    }
}
