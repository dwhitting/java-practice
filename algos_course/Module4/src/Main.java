
void main() {

    TreeNode<Integer> examp50 = new TreeNode<>(50);
    TreeNode<Integer> examp25 = new TreeNode<>(25);
    TreeNode<Integer> examp10 = new TreeNode<>(10);
    TreeNode<Integer> examp100 = new TreeNode<>(100);
    TreeNode<Integer> examp75 = new TreeNode<>(75);
    TreeNode<Integer> examp125 = new TreeNode<>(125);
    TreeNode<Integer> examp110 = new TreeNode<>(110);

    examp50.setLeft(examp25);
    examp50.setRight(examp100);
    examp100.setLeft(examp75);
    examp100.setRight(examp125);
    examp125.setLeft(examp110);
    examp25.setLeft(examp10);

    List<Integer> resList = new ArrayList<>();

    Traversals<Integer> trav = new Traversals<Integer>();

    resList = trav.postorder(examp50);

    for (int x : resList) {
        System.out.println(x);
    }




}
