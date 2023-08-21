/////libreria arraylist
import java.util.ArrayList;
public class Agenda
{
   private ArrayList<Nota> lista;
   
   public Agenda(){
       /////inicializar coleccion;
        lista= new ArrayList<Nota>();
    }
    public void addNota(Nota nota){
        lista.add(nota);      
    }
    public void listarNotas(){
        if(lista.size()>0){
            ///mostrar las notas
            for(Nota item:lista){
                 item.mostrar();
            }
        }
        else{
            System.out.println("-------------------------");
            System.out.println("No hay notas en la agenda");
            System.out.println("-------------------------");
        }
    }
   public void contarNotas(){
        System.out.println("-------------------------");
        System.out.println("En la Agenda existe"+lista.size()+"notas");
        System.out.println("-------------------------");
    } 
   public void borrarNotas(int id){
        int pos=-1;
        boolean flag =false;
        
        if(lista.size() >0){
            pos++;
            for(Nota item:lista){
                if(item.getId() == id){
                    flag = true;
                    break;
                }
            }
        }
        if(flag){
            lista.remove(pos);
        }
        }
        
    }

