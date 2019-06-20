package Row;

public class MainRow {
    public static void main(String [] args){
        ListRow miListRow = new ListRow();
        miListRow.addNode("Raul");
        miListRow.addNode("Brandon");
        miListRow.addNode("Eduardo");
        miListRow.addNode("Fabiola");
        miListRow.printRow();
        System.out.println("----------");
        miListRow.deleteRow();
        miListRow.printRow();
        System.out.println("-------------");
        miListRow.searchNode("Raul");
    }
}
