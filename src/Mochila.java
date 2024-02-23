package src;

public class Mochila {
   private double pesoMaximo;
   private double pesoUsado = 0.0;
   private double valorDentroDaMochila = 0.0;
   private int numObjetosNaMochila = 0;

   public Mochila(double var1) {
      this.pesoMaximo = var1;
   }

   public double getPesoMaximo() {
      return this.pesoMaximo;
   }

   public double getPesoUsado() {
      return this.pesoUsado;
   }

   public void setPesoUsado(double var1) {
      this.pesoUsado = var1;
   }

   public double getValorDentroDaMochila() {
      return this.valorDentroDaMochila;
   }

   public void setValorDentroDaMochila(double var1) {
      this.valorDentroDaMochila = var1;
   }

   public void imprimirDados() {
      System.out.println("Peso maximo:\t" + this.pesoMaximo);
      System.out.println("Peso usado:\t" + this.pesoUsado);
      System.out.println("Valor carregado:\t" + this.valorDentroDaMochila);
      System.out.println("Numero de objetos:\t" + this.numObjetosNaMochila);
   }

   protected int getNumObjetosNaMochila() {
      return this.numObjetosNaMochila;
   }

   protected void setNumObjetosNaMochila(int var1) {
      this.numObjetosNaMochila = var1;
   }
}
