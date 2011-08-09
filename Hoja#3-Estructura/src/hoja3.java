/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose_Pablo_Castillo
 */
public class hoja3 {

    /**
     * Ahora ya se como se utilizan los COmments para el javadoc
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * crear Matriz aleatoria con numeros descendentes
         * 
         */int[] returnn;
           int m=10;
           boolean selectionsortt=true;
           if(selectionsortt){
               returnn = sortingOne(m,true);
           }
           else{
               returnn = sortingOne(m,false);
           }
           printMatriz(returnn);
           
    }
    public static int[] sortingOne(int n, boolean which){
        int[] tempo = new int[n];
        int val=0;
        selectionSort sort;// = new selectionSort();
        for(int a=tempo.length/2;a<tempo.length;a++){
              tempo[val]=a;
              val ++;
       }
       for(int a=0;a<tempo.length/2;a++){
          tempo[val]=a;
          val ++;
       } 
       if(which)
            sort = new selectionSort(tempo,true);
       else
            sort = new selectionSort(tempo,false);
       tempo= sort.getMatriz();
       return tempo;
    }
    public static void printMatriz(int[] gummybear){
        /**
         * me gustan los ositos de gomita
         */
        System.out.println("+++++Datos Orgenados:+++++");
        System.out.print("*|");
        for(int a=0;a<gummybear.length;a++){
            System.out.print(gummybear[a]+"|");
        }
    }
}
