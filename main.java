package Person;
import java.util.Arrays;
import java.util.Comparator;
import java.lang.*;
public class main {
    public static void main(String[] args) {
        char[] genders = {'м', 'ж'};
        Student[] array = new Student[10];
        array[0]=new Student("aHuman1",21, genders[0],"VUZ",3,1);
        array[1]=new Student("dHuman2",20, genders[0],"VUZ",3,2);
        array[2]=new Student("cHuman3",16, genders[1],"VUZ",1,3);
        array[3]=new Student("bHuman4",22, genders[0],"VUZ",5,4);
        array[4]=new Student("eHuman5",18, genders[0],"VUZ",2,5);
        array[5]=new Student("fHuman6",17, genders[1],"VUZ",1,6);
        array[6]=new Student("gHuman7",19, genders[0],"VUZ",3,7);
        array[7]=new Student("jHuman8",20, genders[1],"VUZ",2,8);
        array[8]=new Student("iHuman9",23, genders[0],"VUZ",4,9);
        array[9]=new Student("hHuman10",22, genders[1],"VUZ",4,10);

        Group gr=new Group(array);

        Student addst=new Student("hHuman11",23, genders[0],"VUZ",3,2);
        try{
            gr.add(addst);
        }
        catch (myException e) {
            System.out.println(e.getMessage());
        }

        int i = gr.remove(10);
        if (i!=-1)
        System.out.println("Удален " +i);
        else  System.out.println(" Уже удален " );

        Student stu=gr.poisk("hHuman9");
        System.out.println("Поиск " +stu );

        Arrays.sort(array,new GroupNameComparator());
        for (Student x:array) {
            if (x!=null)  System.out.println(x);
        }
        String[] prom=new String[6];
        gr.input(prom);
      try {
          array[9] = new Student(prom[0], Integer.parseInt(prom[1]), prom[2].charAt(0),
                                 prom[3], Integer.parseInt(prom[4]), Integer.parseInt(prom[5]));
          System.out.println("Ввод : "+array[9]);
      } catch (NumberFormatException e){
          System.out.println("Некорректный ввод : '"+ prom[0]+" "+prom[1]+" "+prom[2]+" "+prom[3]+" "+prom[4]+" "+prom[5]+"'");
        }

       Voenkom voenkom = new Group(array);
       Student[] mas= voenkom.voenkom();
       voenkom.pech(mas);
    }
 }
