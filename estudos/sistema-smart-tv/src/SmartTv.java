public class SmartTv {
    boolean ligada=false;
    int canal=1; 
    int volume = 25;
     
    public void aumentarVolume(){
      //volume = volume + 1;
      volume++;
    }
  
    public void diminuirCanal(){
      //volume = volume + 1;
      canal--;
    }
  
    public void aumentarCanal(){
        //volume = volume + 1;
        canal++;
      }
    
      public void diminuirVolume(){
        //volume = volume + 1;
        volume--;
      }
    
    public void ligar(){
      ligada=true;
    }
  
    public void desligar(){
      ligada=false;
    }
  
    public void mudarCanal(int novoCanal){
      canal=novoCanal;
    }
      public static void main(String[] args) throws Exception {
        
          SmartTv smartTv = new SmartTv();  
  
          smartTv.diminuirVolume();
          smartTv.diminuirVolume();
          smartTv.diminuirVolume();
          smartTv.aumentarVolume();;
  
          System.out.println("Canal Atual ="+smartTv.canal);
         
          smartTv.mudarCanal(13);
  
          System.out.println("Canal Atual = " +smartTv.canal);
  
          System.out.println("Volume Atual : " +smartTv.volume);
  
  
          System.out.println("Tv ligada ? " + smartTv. ligada); 
          
          System.out.println("Volume Atual : " +smartTv.volume);
  
  
          smartTv.ligar ();      
          System.out.println("Novo Status - Tv ligada ? " + smartTv. ligada); 
  
          smartTv.desligar ();      
          System.out.println("Novo Status - Tv ligada ? " + smartTv. ligada); 
  
      }
  }
  