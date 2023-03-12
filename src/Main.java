public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        myList L = new myList();
        L.push(0, 1);
        L.push(1, 2);
        L.push(0, 3);
        L.push(1, 4);
        L.push(4, 5);
        L.push(50, 6);
        L.push(80, 7);
        L.push(20, 8);
        L.push(9, 9);


        myDList DL = new myDList();
        DL.push(0, 1);
        DL.push(1, 2);
        DL.push(0, 3);
        DL.push(1, 4);
        DL.push(4, 5);
        DL.push(50, 6);
        DL.push(80, 7);
        DL.push(20, 8);
        DL.push(9, 9);

        DL.pop(2);
        DL.sort();
        DL.print();
        DL.revert();
        DL.print();
        DL.revertPrint();
    }




}