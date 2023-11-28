 //Profe el presente codigo lo hice con emi y erick,poke entiendo el hecho del diagrama pero no el codigo. :c Con un 70 me conformo porfa
 //le juro que le heche ganas, usted lo ha visto :c
public class Lista_Simple
{
    Nodo top; //esto es de la clase nodo
    public boolean InsertarPrimerNodo(String dato)
    {
        if (top == null) //lista no vacia
        {
            top = new Nodo();
            top.name = dato;
            top.next = null;
            return true;
        }
        else
        {
            return false;
        }
    }
    public void InsertarAntesPrimerNodo(String nombre)//profe, aqui dice que hace
    {
        Nodo temp;
        temp = new Nodo(); //Crea nuevo nodo
        temp.name = nombre; 
        temp.next = this.top; 
        this.top = temp; 
        temp = null; 
    }
    public void InsertaFinal (String nombre)
    {
        Nodo temp = new Nodo(); 
        temp.name = nombre; //nombre nuevo
        temp.next = null;
        Nodo temp2 = this.top;
        while(temp2.next != null) {
            temp2 = temp2.next;
        }
        temp2.next = temp;
        temp = null;
        temp2 = null;
    }
    public Nodo BuscarN (String buscado)
    {
        Nodo temp = top;

        while (!temp.name.equalsIgnoreCase(buscado))
        {
            temp = temp.next;
        }

        return temp;
    }
    //Buscas nodo existente y ya lo agregas despues de ese.
    public void BuscarYAgregarNodo(String buscado, String dato)
    {
       Nodo valorEncontrado = BuscarN(buscado);
       if (top == valorEncontrado)
       {
           Nodo temp = new Nodo();
           temp.name = dato;
           temp.next = valorEncontrado.next;
           valorEncontrado.next = temp;
       }

    }
    //Intercambio de nodos
    public void IntercambiarNodo(String buscado, String nuevo)
    {
        Nodo valorEncontrado = BuscarN(buscado);

        if (valorEncontrado != null)
        {
            Nodo temp2 = top;
            while (temp2 != null && !temp2.name.equalsIgnoreCase(buscado))
            {
                temp2 = temp2.next;
            }
            temp2.name = nuevo;
            temp2 = null;
        }
    }
    public void Imprimir()
    {
        for (Nodo temp = this.top; temp != null; temp = temp.next)
        {
            System.out.print(" [" + temp.name + "] ---> ");
        }
        System.out.print("[X]\n");
    }
    public String toString ()//Utilizar el metodo "toString" poke me explico erick y emi que se debe poner así
    {
        String cadAux = "";
        for(Nodo temp = this.top; temp != null; temp = temp.next)
        {
            cadAux += "{" + temp.name + "} ---> ";
        }
        System.out.print("[X]\n");

        return cadAux;
    }
}