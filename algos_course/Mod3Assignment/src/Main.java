//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ArrayQueue<Integer> arrQ = new ArrayQueue<Integer>();

    arrQ.enqueue(3);
    arrQ.enqueue(34);

    System.out.println("deq: " + arrQ.dequeue());
    arrQ.enqueue(5);
    System.out.println("deq: " + arrQ.dequeue());
    arrQ.enqueue(6);
    System.out.println("new deq: " + arrQ.dequeue());
    System.out.println("new deq: " + arrQ.dequeue());
    arrQ.enqueue(34);

//    for (int i = 10; i < 18; i++) {
//        arrQ.enqueue(i);
//    }
//
//    for (int i = 0; i < 6; i++) {
//        System.out.println("sys deq: " + arrQ.dequeue());
//    }
//
//    for (int i = 50; i < 59; i++) {
//        arrQ.enqueue(i);
//    }

    System.out.println("\nVals");



}
