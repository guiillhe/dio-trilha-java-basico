public class Usuario {
  public static void main(String[] args)throws Exception {

    SmartTv smartTv = new SmartTv();

    System.out.println(smartTv.ligada?"A TV está ligada":"A TV está desligada");
    if (smartTv.ligada == true){
      System.out.println("volume atual : "+ smartTv.volume);
      System.out.println("canal atual : " + smartTv.canal);
    } else{
      System.out.println("A TV está desligada, portanto é impossível mostrar os dados");
    }

    System.out.println("\n Chamei o método ligar \n");

    smartTv.ligar();
    System.out.println(smartTv.ligada?"A tv está ligada":"A TV está desligada");
    if (smartTv.ligada == true){
      System.out.println("volume atual : "+ smartTv.volume);
      System.out.println("canal atual : " + smartTv.canal);
    } else{
      System.out.println("A TV está desligada, portanto é impossível mostrar os dados");
    }
  
    System.out.println("\n Alterando o volume \n");

  smartTv.aumentarVolume();
  smartTv.aumentarVolume();
  smartTv.aumentarVolume();
  System.out.println(smartTv.ligada?"A tv está ligada":"A TV está desligada");
  if (smartTv.ligada == true){
    System.out.println("volume atual : "+ smartTv.volume);
    System.out.println("canal atual : " + smartTv.canal);
  } else{
    System.out.println("A TV está desligada, portanto é impossível mostrar os dados");
  }
  smartTv.diminuirVolume();
  System.out.println(smartTv.ligada?"A tv está ligada":"A TV está desligada");
  if (smartTv.ligada == true){
    System.out.println("volume atual : "+ smartTv.volume);
    System.out.println("canal atual : " + smartTv.canal);
  } else{
    System.out.println("A TV está desligada, portanto é impossível mostrar os dados");
  }

  System.out.println("\n Alterando o Canal \n");
  smartTv.aumentarCanal();
  System.out.println(smartTv.ligada?"A tv está ligada":"A TV está desligada");
  if (smartTv.ligada == true){
    System.out.println("volume atual : "+ smartTv.volume);
    System.out.println("canal atual : " + smartTv.canal);
  } else{
    System.out.println("A TV está desligada, portanto é impossível mostrar os dados");
  }

  smartTv.diminuirCanal();
  System.out.println(smartTv.ligada?"A tv está ligada":"A TV está desligada");
  if (smartTv.ligada == true){
    System.out.println("volume atual : "+ smartTv.volume);
    System.out.println("canal atual : " + smartTv.canal);
  } else{
    System.out.println("A TV está desligada, portanto é impossível mostrar os dados");
  }

  smartTv.escolherCanal(18);
  System.out.println(smartTv.ligada?"A tv está ligada":"A TV está desligada");
  if (smartTv.ligada == true){
    System.out.println("volume atual : "+ smartTv.volume);
    System.out.println("canal atual : " + smartTv.canal);
  } else{
    System.out.println("A TV está desligada, portanto é impossível mostrar os dados");
  }


 }
  
}
