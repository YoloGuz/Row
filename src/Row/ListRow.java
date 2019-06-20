package Row;

public class ListRow {
    Node inicio;
    int quantify;

    public void addNode(String data){
        Node newAccess = new Node(data, null);

        if (isEmpty()){
            inicio = newAccess;
        }else {
            newAccess.setNext(inicio);
            inicio  = newAccess;
        }
        quantify++;
    }

    public boolean isEmpty(){
        return (inicio == null);
    }

    public void printRow(){
        Node route = inicio;
        if (inicio == null){
            System.out.println("Nothing to show");
        }else {
            while (route != null){
                System.out.println(route.getData());
                route = route.getNext();
            }
        }
    }

    public void deleteRow(){
        Node route = inicio;
        Node aux = null;
        if(isEmpty()){
            System.out.println("nothing to show");
        }else if (inicio.getNext() == null){
            inicio = null;
        }else {
            while (route.getNext() != null){
                aux = route;
                route = route.getNext();
            }
            aux.setNext(null);
        }

    }
}
