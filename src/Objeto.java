package src;

public class Objeto {
   private double peso;
   private double valor;

   public Objeto(double var1, double var3) {
      this.peso = var1;
      this.valor = var3;
   }

   public double getPeso() {
      return this.peso;
   }

   public double getValor() {
      return this.valor;
   }

   public static void imprimirListaDeObjetos(Objeto[] var0) {
      int var1 = var0.length;
      System.out.println("Peso  \tValor");

      for(int var2 = 0; var2 < var1; ++var2) {
         System.out.println(var0[var2].getPeso() + "\t" + var0[var2].getValor());
      }

   }
}
