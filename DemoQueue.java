// "Примитивная" реализация нециклической очереди

class Queue {
    private int[] q;
    private int putIndex, getIndex;

    Queue(int size) {
        q = new int[size];
    }

    void put(int item) {
        if (putIndex == q.length) {
            System.out.println("Очередь переполнена!");
            return;
        }

        q[putIndex++] = item;
    }

    int get() {
        if (putIndex == getIndex) {
            System.out.println("Очередь пуста");
            return 0;
        }

        return q[getIndex++];
    }
}

class DemoQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(2);

        queue.put(2);
        queue.put(4);
        System.out.println(queue.get());
        System.out.println(queue.get());
    }
}