public class BrowserHistory {

    private Node current;

    public BrowserHistory(String homepage)
    {
        current = new Node(homepage);
    }

    // Visit
    public void visit(String url)
    {
        Node newNode = new Node(url);

        current.next = newNode;
        newNode.prev = current;
        current = newNode;
    }

    // Back
    public String back() 
    {
        if(current.prev != null)
            current = current.prev;

        return current.url;
    }

    // Forward
    public String forward() 
    {
        if(current.next != null)
            current = current.next;

        return current.url;
    }

    public String currentPage()
    {
        return current.url;
    }

    public void showHistory() 
    {
        Node temp = current;

        while(temp.prev != null)
            temp = temp.prev;

        while(temp != null)
        {
            System.out.println(temp.url);
            temp = temp.next;
        }
    }
}
