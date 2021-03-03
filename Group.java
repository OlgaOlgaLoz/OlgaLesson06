package Person;
import javax.swing.JOptionPane;

public class Group implements Voenkom {
   private Student[] array;

   public Group(Student[] array) {
        super();
        this.array = array;
    }
    public  Group(){
        super();
    }

    public Student[] getArray() {
        return array;
    }

    public void setArray(Student[] array) {
        this.array = array;
    }

    public int remove(int y){
        for (int j=0; j<array.length; j++) {
            if   (array[j]!=null) {
                int y1 = array[j].getNzach();
                if (y1==y){
                    array[j] =null ;
                    return y1;
                }
            }
        }
      return -1;

    }

    public Student add(Student x) throws myException {
        for (int j=0; j<array.length; j++) {
            if (array[j]==null) {
                array[j] = x;
                return x;
            }
            throw new myException();
        }
            return x;
        }
    public Student poisk(String s){
        for (int i=0; i<array.length; i++){
            if   (array[i]!=null) {
           String s1 = array[i].getName();
           if (s1.equals(s))
               return array[i];
            }
        }
               return null;
     }
 public String[] input(String[] prom) {
     prom[0]= JOptionPane.showInputDialog(null,"Ввод данных о студентах","Имя");
     prom[1]= JOptionPane.showInputDialog(null,"Ввод данных о студентах","Возраст");
     prom[2]= JOptionPane.showInputDialog(null,"Ввод данных о студентах","Пол");
     prom[3]= JOptionPane.showInputDialog(null,"Ввод данных о студентах","Вуз");
     prom[4]= JOptionPane.showInputDialog(null,"Ввод данных о студентах","Курс");
     prom[5]= JOptionPane.showInputDialog(null,"Ввод данных о студентах","Номер зачетки");
  return prom;
 }
 public Student[] voenkom(){
     Student[] array1=new Student[10]  ;
     int j=0;
     for (int i=0; i<array.length; i++) {
         if   (array[i]!=null) {
             if (array[i].getAge() >= 18){
                 array1[j]=array[i];
                 j++;
         }
       }
     }
     return array1;
 }
 public void pech(Student[] array1){
     for (Student x:array1) {
         if (x != null) System.out.println(x);
     }
   }
}
