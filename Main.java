class Main {
  public static void main(String[] args){
    
    Player player01 = new Player("Josisvaldo", 100, 10,10);
    Monstro monstro01 = new Monstro("mago", 100, 2);
    Arma arma01 = new Arma("Pá de pedreiro", 4);

    
    if (monstro01.pontosVida >= 0){
      
      monstro01.pontosVida-=player01.causarDano();
       
      {
    String monstroStatus = monstro01.exibirStatus();
    System.out.println(monstroStatus);
    
    String playerStatus = player01.exibirStatus();
    System.out.println(playerStatus);
    String causarDano = arma01.exibirStatus();
    System.out.println(causarDano);
 }

    

      
   
  }
    }
}
    
