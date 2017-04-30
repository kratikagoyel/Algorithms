/**
 * Created by zeus on 4/11/2017.
 */
public class LinkedList<T> {

    Node<T> start;
    Node<T> end;
    public void insertElement(T element) {
        Node<T> temp = new Node<>();
        temp.data = element;
        temp.address = null;
        if(start == null)
        {
            start = temp;
            end = start;
        }
        else
        {
            end.address = temp;
            end = end.address;
        }
    }

    public void traverse(){
       if(start!= null)
       {
           Node temp = start;
           while(temp != null)
           {
               System.out.println(temp.data);
               temp = temp.address;
           }
       }
    }

    public Boolean isEmpty() {
       return start==null;
    }

    public void insertElementAtSomePosition(int position, T data) {
        Node<T> temp = new Node();
        temp.data = data;
        temp.address = null;
        int count = 1;
        Node tempRef;
        if(start!=null){
            tempRef = start;
            if(position == 0 ){
                temp.address= start;
                start = temp;
            }
            else
            {
                Node tempRef1 = null;
               while(tempRef!=null) {//todo add conditon for position -1;
                   tempRef = tempRef.address;
                   if(count == position-1)
                   break;
                   count++;
               }
               tempRef1=tempRef.address;
               if(tempRef1==null){
                   tempRef.address=temp;
               }
               else {
                   tempRef.address = temp;
                   temp.address = tempRef1;
               }
                /*if(position == count){
                   tempRef1.address = temp;
               }*/
            }
        }
        else {
            start = temp;
        }
    }

    public void deleteElementAtIndex(int index){
        if(start!=null && index > -1)
        {
            int count = 1;
            Node temp = start;
            if(index == 0 && temp.address== null)
            {
                start = temp= null;
            }
            else if(index == 0 && temp.address!= null)
            {
                temp = temp.address;
                start = temp;
            }
            else{
                while(temp!=null)
                {
                   if(count == index-1) {
                       break;
                   }
                    temp = temp.address;
                   count++;
                }
                if(temp!=null)
                    temp.address = temp.address.address;
                else
                    System.out.println("Out of Bound");
            }
        }
    }

    public void reverseList(){
       if(start!=null)
       {
           Node tempRef;
           Node temp = start.address;
           start.address = null;
           while(temp!=null)
           {
               tempRef = new Node();
               tempRef.data= temp.data;
               tempRef.address= temp.address;
              //tempRef =temp;
               tempRef.address = start;
               start = tempRef ;

               temp=temp.address;
           }
       }
    }
}
