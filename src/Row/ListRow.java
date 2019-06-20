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

}
