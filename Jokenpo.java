package aula03;

import javax.swing.JOptionPane;

import java.util.Random;

public class Jokenpo {

	public static void main(String[] args) {
		int jogador,computador;
		
		int escolhaJogada;//opcoes para o jogador fazer a jogada
		
		int escolhaComputador;//jogada escolhida pelo computador
		
		int escolhaContra; //contra quem o jogador quer jogar
		
		int escolhaJogada2;// opcoes para o jogador 2 fazer a jogada
		
		int jogadaGanha = 0;//variavel para rodadas ganhadas
		
		int jogadaEmpate = 0;//variavel para rodadas empatadas
		
		int jogadaPerdida = 0;//variavel para rodadas perdidas
		
		int jogadaGanhaAdv = 0;
		
		int jogadaPerdidaAdv = 0;
		
		//int escolhaRodadas; //variavel para o jogador escolher o numero de jogadas
		
		String nome;//nome do jogador
		
		String nomeJogadorAdv;//nome jogador adversário
		
		String jogada [] = {"0-PEDRA","1-PAPEL","2-TESOURA"};//opcoes de jogada do jogador 1
		
		String jogada2 [] = {"0-PEDRA","1-PAPEL","2-TESOURA"}; //opoces de jogada do jogador 2
		
		
		boolean menu = false;//variavel boleana para o MENU aparecer
		
		String opcoes [] = {"Jogar", "Sair"};
		
		String opcoesContra [] = {"Computador", "jogador Real"};//opcoes para jogar contra
		
		Random rand = new Random();//declaração do objeto RAND para numeros aleatorios
		
		
		 int escolhaInicio = JOptionPane.showOptionDialog(null, "Início do jogo", "MENU", 0, JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[0]);
		
		
		while(menu==false) {
			
			switch(escolhaInicio) {
			
			case 0:
				nome = JOptionPane.showInputDialog(null, "Digite seu nome: ", "Nome do jogador", JOptionPane.QUESTION_MESSAGE);//nome do jogador
				
				escolhaContra = JOptionPane.showOptionDialog(null, nome + " escolha contra quem deseja jogar", "Escolha de jogadores", 0, JOptionPane.WARNING_MESSAGE, null, opcoesContra, opcoesContra[0]);//Opcoes de jogar contra jogador ou computador
				
				if(escolhaContra == 0) {
					escolhaJogada = JOptionPane.showOptionDialog(null, nome + " escolha sua jogada", "Início do jogo", 0, JOptionPane.WARNING_MESSAGE, null, jogada,jogada[0]);//escolha entre pedra, papel, tesoura
					
					int jogadaComputador = rand.nextInt(3);//ATRIBUINDO A JOGADA DO COMPUTADOR À VARIAVEL 
					
					//JOGADA DO COMPUTADOR
					if (jogadaComputador == 0) {
						JOptionPane.showMessageDialog(null,"O computador escolheu pedra","Jogada do computador",JOptionPane.INFORMATION_MESSAGE);
					}else if (jogadaComputador == 1) {
						JOptionPane.showMessageDialog(null,"O computador escolheu papel","Jogada do computador",JOptionPane.INFORMATION_MESSAGE);
					}else if (jogadaComputador == 2) {
						JOptionPane.showMessageDialog(null,"O computador escolheu tesoura","Jogada do computador",JOptionPane.INFORMATION_MESSAGE);
					}
					 
					
					 //PACOTE DE JOGADAS PEDRA DO JOGADOR
					if(escolhaJogada == 0 && jogadaComputador == 0) {
						jogadaEmpate++;
						JOptionPane.showMessageDialog(null, "EMPATE\n JOGUE NOVAMENTE", "Decisão da jogada", JOptionPane.INFORMATION_MESSAGE);
						
					}else if (escolhaJogada == 0 && jogadaComputador == 1) {
						JOptionPane.showMessageDialog(null, nome + " PERDEU\n TENTE NOVAMENTE", "Decisão da jogada", JOptionPane.INFORMATION_MESSAGE);
						
					}else if (escolhaJogada == 0 && jogadaComputador == 2) {
						jogadaGanha++;
						JOptionPane.showMessageDialog(null,  nome + " GANHOU\n JOGUE OUTRA RODADA", "Decisão da jogada", JOptionPane.INFORMATION_MESSAGE);
					}
					
					//PACOTE DE JOGADAS PAPEL DO JOGADOR
					if (escolhaJogada == 1 && jogadaComputador == 0) {
						jogadaGanha++;
						JOptionPane.showMessageDialog(null, nome + " GANHOU\n JOGUE OUTRA RODADA", "Decisão da jogada", JOptionPane.INFORMATION_MESSAGE);
						
					}else if (escolhaJogada == 1 && jogadaComputador == 1) {
						jogadaEmpate++;
						JOptionPane.showMessageDialog(null, "EMPATE\n JOGUE NOVAMENTE", "Decisão da jogada", JOptionPane.INFORMATION_MESSAGE);
						
					}else if (escolhaJogada == 1 && jogadaComputador == 2) {
						JOptionPane.showMessageDialog(null,  nome + " PERDEU\n TENTE NOVAMENTE", "Decisão da jogada", JOptionPane.INFORMATION_MESSAGE);
					}
					
					//PACOTE DE JOGADAS TESOURA DO JOGADOR
					if(escolhaJogada == 2 && jogadaComputador == 0) {
						JOptionPane.showMessageDialog(null,  nome + " PERDEU\n TENTE NOVAMENTE", "Decisão da jogada", JOptionPane.INFORMATION_MESSAGE);
						
					}else if (escolhaJogada == 2 && jogadaComputador == 1) {
						jogadaGanha++;
						JOptionPane.showMessageDialog(null,  nome + " GANHOU\n JOGUE OUTRA RODADA", "Decisão da jogada", JOptionPane.INFORMATION_MESSAGE);
						
					}else if (escolhaJogada == 2 && jogadaComputador == 2) {
						jogadaEmpate++;
						JOptionPane.showMessageDialog(null, "EMPATE\n JOGUE NOVAMENTE", "Decisão da jogada", JOptionPane.INFORMATION_MESSAGE);
					}
					
					
					
				//OPCAO CASO O JOGADOR JOGUE CONTRA UM JOGADOR REAL	
				}else if (escolhaContra == 1) {
					jogadaGanha=0;
					jogadaEmpate=0;
					jogadaPerdida=0;
					nomeJogadorAdv = JOptionPane.showInputDialog(null, "Digite o nome do outro jogador: ", "Nome do jogador adversário", JOptionPane.QUESTION_MESSAGE);//nome do jogador adversário
					
					escolhaJogada = JOptionPane.showOptionDialog(null, nome + " escolha sua jogada", "Início do jogo", 0, JOptionPane.WARNING_MESSAGE, null, jogada,jogada[0]);//escolha entre pedra, papel, tesoura
					
					escolhaJogada2 = JOptionPane.showOptionDialog(null, nomeJogadorAdv + " escolha sua jogada", "Início do jogo", 0, JOptionPane.WARNING_MESSAGE, null, jogada2,jogada2[0]);//escolha entre pedra, papel, tesoura
					
					 //PACOTE DE JOGADAS PEDRA DO JOGADOR
					if(escolhaJogada == 0 && escolhaJogada2 == 0) {
						jogadaEmpate++;
						JOptionPane.showMessageDialog(null, "EMPATE\n JOGUE NOVAMENTE", "Decisão da jogada", JOptionPane.INFORMATION_MESSAGE);
						
					}else if (escolhaJogada == 0 && escolhaJogada2 == 1) {
						jogadaGanhaAdv++;
						JOptionPane.showMessageDialog(null, nome + " PERDEU E " + nomeJogadorAdv + " GANHOU", "Decisão da jogada", JOptionPane.INFORMATION_MESSAGE);
						
					}else if (escolhaJogada == 0 && escolhaJogada2 == 2) {
						jogadaGanha++;
						JOptionPane.showMessageDialog(null,  nome + " GANHOU E " + nomeJogadorAdv + " PERDEU", "Decisão da jogada", JOptionPane.INFORMATION_MESSAGE);
					}
					
					//PACOTE DE JOGADAS PAPEL DO JOGADOR
					if (escolhaJogada == 1 && escolhaJogada2 == 0) {
						jogadaGanha++;
						JOptionPane.showMessageDialog(null, nome + " GANHOU E " + nomeJogadorAdv + " PERDEU", "Decisão da jogada", JOptionPane.INFORMATION_MESSAGE);
						
					}else if (escolhaJogada == 1 && escolhaJogada2 == 1) {
						jogadaEmpate++;
						JOptionPane.showMessageDialog(null, "EMPATE\n JOGUE NOVAMENTE", "Decisão da jogada", JOptionPane.INFORMATION_MESSAGE);
						
					}else if (escolhaJogada == 1 && escolhaJogada2 == 2) {
						jogadaGanhaAdv++;
						JOptionPane.showMessageDialog(null,  nome + " PERDEU E " + nomeJogadorAdv + " GANHOU", "Decisão da jogada", JOptionPane.INFORMATION_MESSAGE);
					}
					
					//PACOTE DE JOGADAS TESOURA DO JOGADOR
					if(escolhaJogada == 2 && escolhaJogada2 == 0) {
						jogadaGanhaAdv++;
						JOptionPane.showMessageDialog(null,  nome + " PERDEU E " + nomeJogadorAdv + " GANHOU", "Decisão da jogada", JOptionPane.INFORMATION_MESSAGE);
						
					}else if (escolhaJogada == 2 && escolhaJogada2 == 1) {
						jogadaGanha++;
						JOptionPane.showMessageDialog(null,  nome + " GANHOU E " + nomeJogadorAdv + " PERDEU", "Decisão da jogada", JOptionPane.INFORMATION_MESSAGE);
						
					}else if (escolhaJogada == 2 && escolhaJogada2 == 2) {
						jogadaEmpate++;
						JOptionPane.showMessageDialog(null, "EMPATE\n JOGUE NOVAMENTE", "Decisão da jogada", JOptionPane.INFORMATION_MESSAGE);
					}
					//APRESENTAÇÃO DOS RESULTADOS DAS RODADAS
					JOptionPane.showMessageDialog(null,  nome + " ganhou " + jogadaGanha  + " rodadas\n" + nome + " empatou " + jogadaEmpate + " rodadas\n" + nome + " perdeu "  + jogadaPerdida + " rodadas\n " + nomeJogadorAdv + " ganhou " + jogadaGanhaAdv + " rodadas\n" + nomeJogadorAdv + " empatou " + jogadaEmpate + " rodadas\n" + nomeJogadorAdv + " perdeu " + jogadaPerdidaAdv + " rodadas", "FINAL", JOptionPane.INFORMATION_MESSAGE);
					
				}//FINAL DA OPCAO JOGAR CONTRA JOGADOR REAL
				
				
				if (escolhaContra == 0) {
					//RESULTADO DAS RODADAS GANHADAS PELO JOGADOR
					JOptionPane.showMessageDialog(null, nome + " ganhou " + jogadaGanha + " rodadas\n" + nome + " empatou " + jogadaEmpate + " rodadas\n" + nome + " perdeu " + jogadaPerdida + " rodadas", "FINAL", JOptionPane.INFORMATION_MESSAGE);	
				}
				
				
				//CAIXA DE OPÇÃO CASO O USUARIO DESEJA SAIR DO JOGO
				escolhaInicio = JOptionPane.showOptionDialog(null, "Deseja continuar?", "MENU", 0, JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[0]);
			break;
			
			
			case 1:
				menu = true;
				
			}//final do switch
				
			
		
		}//final do while
	}

}
