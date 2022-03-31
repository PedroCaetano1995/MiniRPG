class Player{
  
float posicaoX;
float posicaoY;
int pontodDeVida;
String nome;

//construtor
  Player(String nome, int ptsDeVida, float posInicialX, float posInicialY){
    System.out.println("Construtor do Player")                                       
  }
  
void mover(float posX, float posY){

posicaoX = PosicaoX + 5;
posicaoY = PosicaoY + 5;
  
}

  float exibirPosicaoX(){
    return posicaoX;
  
    }
  float exibirPosicaoY(){
    return posicaoY;
  
    }

 void receberDano (int dano){
    pontosVida -= dano;
    
  }

  int exibirPontosDeVida(){
    return pontosVida;
    
  }

  String exibirStatus(){
    String status ="Nome: " + nome + " Vida: " + pontosVida;
    return status;



}