public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume =10;
  
  
 public void ligar(){
   ligada = true;
 }
 public void desligar(){
  ligada = false;
 }
 public void aumentarVolume(){
  volume++;
  System.out.println( "Volume foi para : " + volume);

 }
 public void diminuirVolume(){
  volume--;
  System.out.println("O volume foi para : " + volume);

 }
 public void aumentarCanal() {
  canal ++;
  System.out.println("Canal atual : " + canal); 

  
 }
 public void diminuirCanal() {
  canal --;
  System.out.println("Canal atual : " + canal); 

  
 }
 public void escolherCanal(int novoCanal) {
  canal = novoCanal;
  System.out.println("Canal atual : " + canal);

  
 }

}
