import java.util.Scanner;

public class Btree
{
    Node root;

    public void addNode(int key, String name )
    {
        Node newNode =new Node(key,name);

        if(root ==null)
        {
            root = newNode;
        }

        else
        {
            Node focusNode = root;

            Node parent;
            while(true)
            {
                parent = focusNode;
                if(key < focusNode.key) {
                    focusNode = focusNode.leftchild;
                    if (focusNode == null) {
                        parent.leftchild = newNode;
                        return;
                    }
                }

                else
                {
                    focusNode =focusNode.rightchild;
                    if(focusNode ==null){
                        parent.rightchild= newNode;
                        return;
                    }

                }
            }

        }
    }
    public void inOrderTrav(Node focusNode){
        if (focusNode  !=null ){
            inOrderTrav(focusNode.leftchild);
            System.out.println(focusNode);
            inOrderTrav(focusNode.rightchild);
        }
    }
public  Node findNode(int key){
        Node focusNode =root;
        while (focusNode.key != key)
        {
            if( key< focusNode.key){
                focusNode=focusNode.leftchild;
            }
            else {
                focusNode =focusNode.rightchild;
            }
            if(focusNode ==null)
                return null;
        }
        return focusNode;

}

    public static void main(String[]args )
    {
     Btree thetree = new Btree();
        thetree.addNode(20,"Speed racer");
        thetree.addNode(15,"ben burns");
        thetree.addNode(19,"racer x");
        thetree.addNode(40,"spritle");
        thetree.addNode(35,"trixie");
        thetree.addNode(80,"pops");

        thetree.inOrderTrav(thetree.root);
        System.out.println("search for 80");
        System.out.println(thetree.findNode(80));
    }
}
class Node
{
    int key;
    String name;

    Node leftchild;
    Node rightchild;

    Node(int key, String name){

        this.key = key;
        this.name = name;
    }
    public String toString(){
        return name + "has a key" + key;
    }
}
