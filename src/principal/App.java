package principal;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import util.ilustracoes;


public class App {
	public static void main(String[] args) {
		
		// criação de objetos padrão do sistema, em uma aplicação "normal" seria armazenado em um BD, 
		// aqui adaptamos para uma aplicação de console;
		
		// A aplicação inicia depois da criação dos objetos que o usuário terá acesso;
		
		Musica TempoPerdido = new Musica(); // Aqui você cria uma instância da classe Musica
        TempoPerdido.setNomeMusica("Tempo perdido"); // Aqui você define o nome da música
        TempoPerdido.setCompositor("Renato Russo");
        String CifraTP = 
        		"[Intro] C  Am7  Bm  Em\n" +
                "           C                Am7\n" +
                " Todos os dias quando acordo\n" +
                "Bm                  Em\n" +
                "  Não tenho mais o tempo que passou\n" +
                "           C          Am7\n" +
                "Mas tenho muito tempo\n" +
                "       Bm              Em\n" +
                "Temos todo o tempo do mundo\n" +
                "C               Am7\n" +
                "  Todos os dias antes de dormir\n" +
                " Bm                          Em\n" +
                "Lembro e esqueço como foi o dia\n" +
                " C              Am7\n" +
                "Sempre em frente\n" +
                "     Bm               Em\n" +
                "Não temos tempo a perder\n" +
                "        C          Am7\n" +
                "Nosso suor sagrado\n" +
                "            Bm\n" +
                "É bem mais belo que esse\n" +
                "         Em\n" +
                "Sangue amargo\n" +
                "     C      Am7\n" +
                "E tão sério\n" +
                "      Bm   Em\n" +
                "E selva___gem\n" +
                "      Bm   Em\n" +
                "E selva___gem\n" +
                "      Bm   Em\n" +
                "E selva___gem\n" +
                "\n" +
                " C                   Am7        Bm\n" +
                "Veja o sol dessa manhã tão cinza\n" +
                "         Em                  C\n" +
                "A tempestade que chega é da cor\n" +
                "            Am7\n" +
                "Dos teus olhos\n" +
                "    Bm      Em\n" +
                "Casta_____nhos\n" +
                "            C         Am7\n" +
                "Então me abraça forte    e me\n" +
                " Bm\n" +
                "Diz mais uma vez\n" +
                "          Em       C         Am7\n" +
                "Que já estamos distantes de tudo\n" +
                " Bm                  Em\n" +
                "Temos nosso próprio tempo\n" +
                " Bm                  Em\n" +
                "Temos nosso próprio tempo\n" +
                " Bm                  Em\n" +
                "Temos nosso próprio tempo\n" +
                "     C        Am7        Bm\n" +
                "Não tenho medo do escuro\n" +
                "         Em       C      Am7\n" +
                "Mas deixe as luzes acesas\n" +
                "  Bm     Em\n" +
                "Ago_____ra\n" +
                "       C                  Am7\n" +
                "O que foi escondido é o que se escondeu\n" +
                "         Bm\n" +
                "E o que foi  prometido\n" +
                "     Em\n" +
                "Ninguém prometeu\n" +
                "         C           Am7\n" +
                "Nem foi tempo perdido\n" +
                "           Bm     Em\n" +
                "Somos tão jo_____vens\n" +
                "     Bm     Em         Bm      Em\n" +
                "Tão jo_____vens  tão jo______vens";
        		TempoPerdido.setCifra(CifraTP);
        		
         /////////////////
    	//////// Música 2
    	/////////////////
        		
        		Musica FloresTitas = new Musica();
        		FloresTitas.setNomeMusica("Flores");
        		FloresTitas.setCompositor("Titãs");
        		String CifraFT =
        				"Intro 4x: D\n\n" +
        		        "Primeira Parte:\n" +
        		        "   D\n" +
        		        "Olhei até ficar cansado\n" +
        		        "    G\n" +
        		        "De ver os meus olhos no espelho\n" +
        		        "    D\n" +
        		        "Chorei por ter despedaçado\n" +
        		        "     G\n" +
        		        "As flores que estão no canteiro\n" +
        		        "    D\n" +
        		        "Os punhos e os pulsos cortados\n" +
        		        "     G\n" +
        		        "E o resto do meu corpo inteiro\n" +
        		        "     D\n" +
        		        "Há flores cobrindo o telhado\n" +
        		        "     G\n" +
        		        "E embaixo do meu travesseiro\n" +
        		        "     D\n" +
        		        "Há flores por todos os lados\n" +
        		        "     G\n" +
        		        "Há flores em tudo que eu vejo\n\n" +
        		        
        		        "Pré-refrão:\n" +
        		        "D              G5/D\n" +
        		        "  A dor vai curar essas lástimas\n" +
        		        "D             G5/D\n" +
        		        "  O soro tem gosto de lágrimas\n" +
        		        "D                 G5/D\n" +
        		        "  As flores têm cheiro de morte\n" +
        		        "   D                    G5/D\n" +
        		        "A dor vai fechar esses cortes\n\n" +
        		        
        		        "Refrão:\n" +
        		        "  A4\n" +
        		        "Flores... Flores...\n" +
        		        "     D         G           D      G  D  G\n" +
        		        "As flores de plástico não morrem\n\n" +
        		        
        		        "Primeira Parte:\n" +
        		        "   D\n" +
        		        "Olhei até ficar cansado\n" +
        		        "    G\n" +
        		        "De ver os meus olhos no espelho\n" +
        		        "    D\n" +
        		        "Chorei por ter despedaçado\n" +
        		        "     G\n" +
        		        "As flores que estão no canteiro\n" +
        		        "    D\n" +
        		        "Os punhos e os pulsos cortados\n" +
        		        "     G\n" +
        		        "E o resto do meu corpo inteiro\n" +
        		        "     D\n" +
        		        "Há flores cobrindo o telhado\n" +
        		        "     G\n" +
        		        "E embaixo do meu travesseiro\n" +
        		        "     D\n" +
        		        "Há flores por todos os lados\n" +
        		        "     G\n" +
        		        "Há flores em tudo que eu vejo\n\n" +
        		        
        		        "Pré-refrão:\n" +
        		        "D              G5/D\n" +
        		        "  A dor vai curar essas lástimas\n" +
        		        "D             G5/D\n" +
        		        "  O soro tem gosto de lágrimas\n" +
        		        "D                 G5/D\n" +
        		        "  As flores têm cheiro de morte\n" +
        		        "   D                    G5/D\n" +
        		        "A dor vai fechar esses cortes\n\n" +
        		        
        		        "Refrão:\n" +
        		        " A4\n" +
        		        "Flores... Flores...\n" +
        		        "     D         G           D\n" +
        		        "As flores de plástico não morrem\n" +
        		        "  A4\n" +
        		        "Flores... Flores...\n" +
        		        "     D         G           D      G  D\n" +
        		        "As flores de plástico não morrem";
        				FloresTitas.setCifra(CifraFT);
        				
                         ///////////////
        		    	//////// Música 3
        		    	/////////////////
        				
        				Musica ComeAsYouAre = new Musica();
        				ComeAsYouAre.setNomeMusica("Come as you are");
        				ComeAsYouAre.setCompositor("Nirvana");
        				String CifraCN = "[Intro] Em  D\n\n" +
        				        "[Primeira Parte]\n\n" +
        				        " Em        D            Em\n" +
        				        "Come as you are, as you were\n" +
        				        "      D           Em\n" +
        				        "As I want you to be\n" +
        				        "       D            Em\n" +
        				        "As a friend, as a friend\n" +
        				        "       D       Em\n" +
        				        "As a known enemy\n\n" +

        				        "           D          Em\n" +
        				        "Take your time, hurry up\n" +
        				        "           D               Em\n" +
        				        "Choice is yours, don't be late\n" +
        				        "        D           Em\n" +
        				        "Take a rest, as a friend\n\n" +

        				        "[Refrão]\n\n" +

        				        "      D        Em  G\n" +
        				        "As an old memory,  yeah\n" +
        				        "     Em  G\n" +
        				        "Memory,  yeah\n" +
        				        "     Em  G\n" +
        				        "Memory,  yeah\n" +
        				        "     Em  G\n" +
        				        "Memory,  yeah\n\n" +

        				        "[Segunda Parte]\n\n" +

        				        " Em            D               Em\n" +
        				        "Come doused in mud, soaked in bleach\n" +
        				        "      D           Em\n" +
        				        "As I want you to be\n" +
        				        "       D           Em\n" +
        				        "As a trend, as a friend\n\n" +

        				        "[Refrão]\n\n" +

        				        "      D        Em  G\n" +
        				        "As an old memory,  yeah\n" +
        				        "     Em  G\n" +
        				        "Memory,  yeah\n" +
        				        "     Em  G\n" +
        				        "Memory,  yeah\n" +
        				        "     Em  G\n" +
        				        "Memory,  yeah\n\n" +

        				        "[Terceira Parte]\n\n" +

        				        "A         C           A            C\n" +
        				        "  And I swear that I don't have a gun\n" +
        				        "       A            C\n" +
        				        "No, I don't have a gun\n" +
        				        "       A            C\n" +
        				        "No, I don't have a gun\n\n" +

        				        "[Intro] Em  D\n\n" +

        				        "[Refrão]\n\n" +

        				        "     Em  G\n" +
        				        "Memory,  yeah\n" +
        				        "     Em  G\n" +
        				        "Memory,  yeah\n" +
        				        "     Em  G\n" +
        				        "Memory,  yeah\n" +
        				        "     Em  G\n" +
        				        "Memory,  yeah\n\n" +

        				        "[Terceira Parte]\n\n" +

        				        "A         C           A            C\n" +
        				        "  And I swear that I don't have a gun\n" +
        				        "       A            C\n" +
        				        "No, I don't have a gun\n" +
        				        "       A            C\n" +
        				        "No, I don't have a gun\n" +
        				        "       A            C\n" +
        				        "No, I don't have a gun\n\n" +

        				        "[Final] Em  D\n\n" +

        				        "     Em  D\n" +
        				        "Memory,  yeah\n" +
        				        "     Em  D\n" +
        				        "Memory,  yeah";
        				ComeAsYouAre.setCifra(CifraCN);
        				
        	            ///////////////
        		    	//////// Música 4
        		    	/////////////////
        				
        				Musica GostavaTim = new Musica();
        				GostavaTim.setNomeMusica("Gostava tanto de você");
        				GostavaTim.setCompositor("Tim Maia");
        				String CifraGT = "Tom: A\n\n" +
        				        "[Intro] A7M   Bm7  A7M  Bm7\n\n" +
        				        "[Primeira Parte]\n\n" +
        				        "A7M                          Bm7\n" +
        				        "    Não sei por que você se foi\n" +
        				        "                        C#m7\n" +
        				        "Quantas saudades eu senti\n" +
        				        "                      Bm7\n" +
        				        "E de tristezas vou viver\n" +
        				        "                         A7M\n" +
        				        "E aquele adeus não pude dar\n\n" +

        				        "                      Bm7\n" +
        				        "Você marcou na minha vida\n" +
        				        "                           C#m7\n" +
        				        "Viveu, morreu na minha história\n" +
        				        "                       Bm7\n" +
        				        "Chego a ter medo do futuro\n" +
        				        "\n" +
        				        "E da solidão\n" +
        				        "              A7M       Bm7\n" +
        				        "Que em minha porta bate\n\n" +

        				        "[Refrão]\n\n" +

        				        "  A7M\n" +
        				        "E eu\n" +
        				        "Bm7                     A7M\n" +
        				        "    Gostava tanto de você\n" +
        				        "Bm7                     A7M  Bm7\n" +
        				        "    Gostava tanto de você\n\n" +

        				        "[Segunda Parte]\n\n" +

        				        "A7M                       Bm7\n" +
        				        "    Eu corro, fujo desta sombra\n" +
        				        "                        C#m7\n" +
        				        "Em sonho, vejo este passado\n" +
        				        "                    Bm7\n" +
        				        "E na parede do meu quarto\n" +
        				        "                     A7M\n" +
        				        "Ainda está o seu retrato\n" +
        				        "\n" +
        				        "                           Bm7\n" +
        				        "Não quero ver pra não lembrar\n" +
        				        "                    C#m7\n" +
        				        "Pensei até em me mudar\n" +
        				        "                         Bm7\n" +
        				        "Lugar qualquer que não exista\n" +
        				        "                   A7M  Bm7\n" +
        				        "O pensamento em você\n\n" +

        				        "[Refrão]\n\n" +

        				        "  A7M\n" +
        				        "E eu\n" +
        				        "Bm7                     A7M\n" +
        				        "    Gostava tanto de você\n" +
        				        "Bm7                     A7M  Bm7\n" +
        				        "    Gostava tanto de você\n\n" +

        				        "[Primeira Parte]\n\n" +

        				        "A7M                          Bm7\n" +
        				        "    Não sei por que você se foi\n" +
        				        "                        C#m7\n" +
        				        "Quantas saudades eu senti\n" +
        				        "                      Bm7\n" +
        				        "E de tristezas vou viver\n" +
        				        "                         A7M\n" +
        				        "E aquele adeus não pude dar\n" +
        				        "\n" +
        				        "                      Bm7\n" +
        				        "Você marcou na minha vida\n" +
        				        "                           C#m7\n" +
        				        "Viveu, morreu na minha história\n" +
        				        "                       Bm7\n" +
        				        "Chego a ter medo do futuro\n" +
        				        "\n" +
        				        "E da solidão\n" +
        				        "              A7M       Bm7\n" +
        				        "Que em minha porta bate\n\n" +

        				        "[Refrão]\n\n" +

        				        "  A7M\n" +
        				        "E eu\n" +
        				        "Bm7                     A7M\n" +
        				        "    Gostava tanto de você\n" +
        				        "Bm7                     A7M  Bm7  A7M\n" +
        				        "    Gostava tanto de você";
        				
        				GostavaTim.setCifra(CifraGT);
        				
        				///////////////
        		    	//////// Música 5
        		    	/////////////////
        				
        				Musica DinheiroTim = new Musica();
        				DinheiroTim.setNomeMusica("Não quero dinheiro");
        				DinheiroTim.setCompositor("Tim Maia");
        				String CifraDT = "A                  F#m\n" +
        				        "  Vou pedir pra você voltar\n" +
        				        "A                  F#m\n" +
        				        "  Vou pedir pra você ficar\n" +
        				        "      E                 A  E\n" +
        				        "Eu te amo, eu te quero bem\n" +
        				        "A                  F#m\n" +
        				        "  Vou pedir pra você gostar\n" +
        				        "A                  F#m\n" +
        				        "  Vou pedir pra você me amar\n" +
        				        "      Dm                      E  A7\n" +
        				        "Eu te amo, eu te adoro, meu amor\n\n" +

        				        "            D                 E\n" +
        				        "A semana inteira, fiquei esperando\n" +
        				        "               C#m                  F#m\n" +
        				        "Pra te ver sorrindo, pra te ver cantando\n" +
        				        "               Bm                    E\n" +
        				        "Quando a gente ama, não pensa em dinheiro\n" +
        				        "             A                           A7\n" +
        				        "Só se quer amar, se quer amar, se quer amar\n" +
        				        "            D                   E\n" +
        				        "Do jeito maneira, não quero dinheiro\n" +
        				        "               C#m                  F#m\n" +
        				        "Quero amor sincero, isto é o que espero\n" +
        				        "                  Bm\n" +
        				        "Grito ao mundo inteiro\n" +
        				        "              E                  A  E\n" +
        				        "Não quero dinheiro eu só quero amar\n\n" +

        				        "A                 F#m\n" +
        				        "  Te espero para ver se você vem\n" +
        				        "A                     F#m\n" +
        				        "  Não te troco nesta vida por ninguém\n" +
        				        "             E\n" +
        				        "Porque eu te amo\n" +
        				        "             A  E\n" +
        				        "Eu te quero bem\n" +
        				        "A                  F#m\n" +
        				        "  Acontece que na vida a gente tem\n" +
        				        "A                     F#m\n" +
        				        "  Ser feliz por ser amado por alguém\n" +
        				        "             Dm                      E  A\n" +
        				        "Porque eu te amo, eu te adoro, meu amor\n\n" +

        				        "            D                 E\n" +
        				        "A semana inteira, fiquei esperando\n" +
        				        "               C#m                  F#m\n" +
        				        "Pra te ver sorrindo, pra te ver cantando\n" +
        				        "               Bm                    E\n" +
        				        "Quando a gente ama, não pensa em dinheiro\n" +
        				        "             A                           A7\n" +
        				        "Só se quer amar, se quer amar, se quer amar\n" +
        				        "            D                   E\n" +
        				        "Do jeito maneira, não quero dinheiro\n" +
        				        "               C#m                  F#m\n" +
        				        "Quero amor sincero, isto é o que espero\n" +
        				        "                  Bm\n" +
        				        "Grito ao mundo inteiro\n" +
        				        "              E                  A  A7\n" +
        				        "Não quero dinheiro eu só quero amar\n\n" +

        				        "            D                 E\n" +
        				        "A semana inteira, fiquei esperando\n" +
        				        "               C#m                  F#m\n" +
        				        "Pra te ver sorrindo, pra te ver cantando\n" +
        				        "               Bm                    E\n" +
        				        "Quando a gente ama, não pensa em dinheiro\n" +
        				        "             A                           A7\n" +
        				        "Só se quer amar, se quer amar, se quer amar\n" +
        				        "            D                   E\n" +
        				        "Do jeito maneira, não quero dinheiro\n" +
        				        "               C#m                  F#m\n" +
        				        "Quero amor sincero, isto é o que espero\n" +
        				        "                  Bm\n" +
        				        "Grito ao mundo inteiro\n" +
        				        "              E                  A\n" +
        				        "Não quero dinheiro eu só quero amar";
        				DinheiroTim.setCifra(CifraDT);
        				
        	            ///////////////
        		    	//////// Música 6
        		    	/////////////////
        				
        				Musica ClicheMaglore = new Musica();
        				ClicheMaglore.setNomeMusica("As Vezes um clichê");
        				ClicheMaglore.setCompositor("Maglore");
        				String CifraCM = 
        						"Capotraste na 1ª casa\n\n" +
        				        "[Intro] F  Am7  Gm7  C7(9)\n" +
        				        "        F  Am7  Gm7  C7(9)\n\n" +

        				        "F           Am7\n" +
        				        "Pode ser assim\n" +
        				        "         Gm7\n" +
        				        "Como um beijinho de passarinho\n" +
        				        "C7(9)                 F\n" +
        				        "De uma leveza perspicaz\n" +
        				        "                 Am7\n" +
        				        "Quando eu dou por mim\n" +
        				        "          Gm7                 C7(9)\n" +
        				        "Eu não estou mais tão sozinho\n" +
        				        "                     F\n" +
        				        "Tenho a beleza da cidade\n\n" +

        				        "              Am7\n" +
        				        "É que assim talvez\n" +
        				        "          Gm7\n" +
        				        "A vida é boa\n" +
        				        "         C7(9)\n" +
        				        "E tão à toa custa a acreditar\n" +
        				        "F              Am7\n" +
        				        "E tudo que acontece\n" +
        				        "         Gm7\n" +
        				        "A gente teme\n" +
        				        "       C7(9)\n" +
        				        "Na certeza desse caminhar\n\n" +

        				        "Bb           C\n" +
        				        "E quero que você me leve\n" +
        				        "F       F/E      Dm  C\n" +
        				        "Do seu jeito e do seu modo\n" +
        				        "Bb             C\n" +
        				        "Não quero que você carregue\n" +
        				        "F     F/E   Dm    C        Bb\n" +
        				        "Nenhum peso pelo medo de gostar\n" +
        				        "C\n" +
        				        "Às vezes de um clichê\n\n" +

        				        "( F  Am7  Gm7  C7(9) )\n" +
        				        "( F  Am7  Gm7  C7(9) )\n\n" +

        				        "F         Am7\n" +
        				        "Posso ser assim\n" +
        				        "            Gm7\n" +
        				        "Um pouco alheio do seu ser\n" +
        				        "C7(9)                F\n" +
        				        "Mas é meu jeito de viver\n" +
        				        "               Am7\n" +
        				        "Nenhuma frustração\n" +
        				        "       Gm7\n" +
        				        "Calejaria o coração\n" +
        				        "C7(9)              Bb\n" +
        				        "Sem essa gana de vencer\n\n" +

        				        "             C\n" +
        				        "E quero que você me leve\n" +
        				        "F       F/E      Dm  C\n" +
        				        "Do seu jeito e do seu modo\n" +
        				        "Bb             C\n" +
        				        "Não quero que você carregue\n" +
        				        "F     F/E   Dm    C        Bb\n" +
        				        "Nenhum peso pelo medo de gostar\n" +
        				        "C\n" +
        				        "Às vezes de um clichê\n\n" +

        				        "( F  Am7  Gm7  C7(9) )\n" +
        				        "( F  Am7  Gm7  C7(9) )\n" +
        				        "( Dm  C  Bb  C )\n" +
        				        "( Dm  C  Bb  C )\n" +

        				        "Bb           C\n" +
        				        "E quero que você me leve\n" +
        				        "F       F/E      Dm  C\n" +
        				        "Do seu jeito e do seu modo\n" +
        				        "Bb             C\n" +
        				        "Não quero que você carregue\n" +
        				        "F     F/E   Dm    C        Bb\n" +
        				        "Nenhum peso pelo medo de gostar\n" +
        				        "C\n" +
        				        "Às vezes de um clichê";
        						ClicheMaglore.setCifra(CifraCM);
        						
        			             ///////////////
                		    	//////// Música 7
                		    	/////////////////
        						
        						Musica ChocolateAna = new Musica();
        						ChocolateAna.setNomeMusica("Chocolate");
        						ChocolateAna.setCompositor("Ana Frango Elétrico");
        						String CifraCA = 
        								"[Intro] Bm7  A7M  Bm7  A7M\n" +
        						        "        Bm7  A7M  Bm7  A7M\n\n" +

        						        "Bm7           A7M\n" +
        						        "Você pensando\n" +
        						        "   Bm7                   A7M\n" +
        						        "Na falha do concreto, olhando pra parede\n" +
        						        "       Bm7                A7M\n" +
        						        "E os futuros incertos\n" +
        						        "     Bm7                   A7M\n" +
        						        "Das bancas de jornais e jornadas matinais\n\n" +

        						        "Bm7           A7M\n" +
        						        "Você pensando\n" +
        						        "   Bm7                   A7M\n" +
        						        "Na falha do concreto, olhando\n" +
        						        "   Bm7                A7M\n" +
        						        "Futuros incertos\n" +
        						        "     Bm7                   A7M\n" +
        						        "Das bancas de jornais e jornadas matinais\n\n" +

        						        "Bm7                A7M\n" +
        						        "Várias varandas e ninguém vai\n" +
        						        "Bm7                A7M\n" +
        						        "Várias varandas e ninguém vai\n\n" +

        						        "Bm7            A7M\n" +
        						        "Suas narinas sangram chocolate\n" +
        						        "Bm7          A7M\n" +
        						        "Você está comendo chocolate\n" +
        						        "Bm7            A7M\n" +
        						        "Suas narinas sangram chocolate\n" +
        						        "Bm7          A7M\n" +
        						        "Você está comendo chocolate\n\n" +

        						        "Bm7           A7M\n" +
        						        "Está pensando\n" +
        						        "   Bm7                   A7M\n" +
        						        "Na falha do concreto, olhando pra parede\n" +
        						        "       Bm7                A7M\n" +
        						        "E os futuros incertos\n" +
        						        "     Bm7                   A7M\n" +
        						        "Das bancas de jornais e jornadas matinais\n\n" +

        						        "Bm7           A7M\n" +
        						        "   Pensando\n" +
        						        "   Bm7                   A7M\n" +
        						        "Na falha do concreto, olhando pra parede\n" +
        						        "       Bm7        A7M\n" +
        						        "E os futuros incertos\n" +
        						        "     Bm7                   A7M\n" +
        						        "Das bancas de jornais e jornadas matinais\n\n" +

        						        "Bm7                A7M\n" +
        						        "Várias varandas e ninguém vai\n" +
        						        "Bm7                A7M\n" +
        						        "Várias varandas e ninguém vai\n\n" +

        						        "Bm7            A7M\n" +
        						        "Suas narinas sangram chocolate\n" +
        						        "Bm7          A7M\n" +
        						        "Você está comendo chocolate\n" +
        						        "Bm7            A7M\n" +
        						        "Suas narinas sangram chocolate\n" +
        						        "Bm7          A7M\n" +
        						        "Você está comendo chocolate";
        						ChocolateAna.setCifra(CifraCA);
        						
        			            ///////////////
                		    	//////// Música 8
                		    	/////////////////
        						
        						Musica PromessasAna = new Musica();
        						PromessasAna.setNomeMusica("Promessas e previsões");
        						PromessasAna.setCompositor("Ana Frango Elétrico");
        						String CifraPA = 
        								"        A7M\n" +
        						        "Cê pode não gostar\n" +
        						        "            C7M             G7M\n" +
        						        "Mas não vou mais falar palavra\n" +
        						        "   A7M              C7M\n" +
        						        "Escrita numa roupa velha\n" +
        						        "   G7M\n" +
        						        "Céu azul, longe na estrada\n\n" +

        						        "( A7M  C7M  G7M )\n\n" +

        						        "        A7M\n" +
        						        "Cê pode não gostar\n" +
        						        "            C7M             G7M\n" +
        						        "Mas não vou mais falar palavra\n" +
        						        "   A7M              C7M\n" +
        						        "Escrita numa roupa velha\n" +
        						        "   G7M                        A7M\n" +
        						        "Céu azul, longe na estrada\n\n" +

        						        "C7M               G7M         A7M\n" +
        						        "Fura o olho desse furacão\n" +
        						        "C7M               G7M\n" +
        						        "Venha pisar na grama\n\n" +

        						        "      A7M          C7M        G7M\n" +
        						        "Venha avistar, tem aves na varanda\n" +
        						        "    A7M     C7M         G7M\n" +
        						        "Cantarolar, ali ou cá\n" +
        						        "    C7M           C7\n" +
        						        "É miragem, é miragem\n\n" +

        						        "G7                 F7\n" +
        						        "Fora a cena dum ciborgue\n" +
        						        "          B7                  E7\n" +
        						        "Ver uma jiboia vir morrer no mar\n" +
        						        "G7                 F7\n" +
        						        "Fora a cena de um ciborgue\n" +
        						        "          B7      E7\n" +
        						        "Ver uma jiboia\n\n" +

        						        "A7M           C7M        G7M\n" +
        						        "Queeeem que taaaaaaava laaá\n" +
        						        "A7M.       C7M.      G7M\n" +
        						        "Queeeee podeee contaaaar\n\n" +

        						        "        A7M\n" +
        						        "Cê pode não gostar\n" +
        						        "            C7M             G7M\n" +
        						        "Mas não vou mais falar palavra";
        						PromessasAna.setCifra(CifraPA);
        						
        			            ///////////////
                		    	//////// Música 9
                		    	/////////////////
        						
        						Musica Believer = new Musica();
        						Believer.setNomeMusica("Believer");
        						Believer.setCompositor("Imagine Dragons");
        						String CifraBI = "Capotraste na 1ª casa\n\n" +
        								"[Primeira Parte]\n\n" +
        								" Am\n" +
        								"First things first\n" +
        								"                                  F\n" +
        								"I'ma say all the words inside my head\n" +
        								"                  E\n" +
        								"I'm fired up and tired of the way\n" +
        								"                  Am\n" +
        								"That things have been, oh-ooh\n" +
        								"                          F       E\n" +
        								"The way that things have been, oh-ooh\n" +
        								" Am\n" +
        								"Second thing second\n" +
        								"\n" +
        								"Don't you tell me what you\n" +
        								"                  F\n" +
        								"Think that I can be\n" +
        								"                    E\n" +
        								"I'm the one at the sail\n" +
        								"                      Am\n" +
        								"I'm the master of my sea, oh-ooh\n" +
        								"                  F      E\n" +
        								"The master of my sea, oh-ooh\n" +
        								"\n" +
        								"        Am\n" +
        								"I was broken from a young age\n" +
        								"\n" +
        								"Taking my sulking to the masses\n" +
        								"               F\n" +
        								"Write down my poems for the few\n" +
        								"                   E\n" +
        								"That looked at me took to me\n" +
        								"\n" +
        								"Shook to me, feeling me\n" +
        								"              Am\n" +
        								"Singing from heartache from the pain\n" +
        								"\n" +
        								"Take up my message from the veins\n" +
        								"             F\n" +
        								"Speaking my lesson from the brain\n" +
        								"            E\n" +
        								"Seeing the beauty through the\n" +
        								"\n" +
        								"[Refrão]\n" +
        								"\n" +
        								"Am\n" +
        								"  Pain\n" +
        								"                                F\n" +
        								"You made me a, you made me a believer\n" +
        								"   E\n" +
        								"Believer\n" +
        								" Am\n" +
        								"Pain\n" +
        								"\n" +
        								"You break me down, you build me up\n" +
        								"   F         E\n" +
        								"Believer, believer\n" +
        								" Am\n" +
        								"Pain\n" +
        								"                                    F\n" +
        								"I let the bullets fly, oh let them rain\n" +
        								"    E/G#\n" +
        								"My life, my love, my drive, it came from\n" +
        								"Am\n" +
        								"  Pain\n" +
        								"                                F\n" +
        								"You made me a, you made me a believer\n" +
        								"   E\n" +
        								"Believer\n" +
        								"\n" +
        								"[Segunda Parte]\n" +
        								"\n" +
        								"  Am\n" +
        								"Third things third\n" +
        								"                               F\n" +
        								"Send a prayer to the ones up above\n" +
        								"                          E\n" +
        								"All the hate that you've heard has\n" +
        								"                         Am\n" +
        								"Turned your spirit to a dove, oh-ooh\n" +
        								"                 F       E\n" +
        								"Your spirit up above, oh-ooh\n" +
        								"\n" +
        								"        Am\n" +
        								"I was choking in the crowd\n" +
        								"\n" +
        								"Building my rain up in the cloud\n" +
        								"             F\n" +
        								"Falling like ashes to the ground\n" +
        								"           E\n" +
        								"Hoping my feelings, they would drown\n" +
        								"          Am\n" +
        								"But they never did, ever lived\n" +
        								"\n" +
        								"Ebbing and flowing, inhibited, limited\n" +
        								"                         F\n" +
        								"Till it broke up and it rained down\n" +
        								"           E\n" +
        								"It rained down, like\n" +
        								"\n" +
        								"[Refrão]\n" +
        								"\n" +
        								"Am\n" +
        								"  Pain\n" +
        								"                                F\n" +
        								"You made me a, you made me a believer\n" +
        								"   E\n" +
        								"Believer\n" +
        								"Am\n" +
        								"  Pain\n" +
        								"You break me down, you build me up\n" +
        								"   F         E\n" +
        								"Believer, believer\n" +
        								" Am\n" +
        								"Pain\n" +
        								"                                    F\n" +
        								"I let the bullets fly, oh let them rain\n" +
        								"    E/G#\n" +
        								"My life, my love, my drive,it came from\n" +
        								"Am\n" +
        								"  Pain\n" +
        								"                                F\n" +
        								"You made me a, you made me a believer\n" +
        								"   E\n" +
        								"Believer\n" +
        								"\n" +
        								"[Terceira Parte]\n" +
        								"\n" +
        								" Am\n" +
        								"Last things last\n" +
        								"                                   F\n" +
        								"By the grace of the fire and the flames\n" +
        								"                        E\n" +
        								"You're the face of the future\n" +
        								"                 Am\n" +
        								"The blood in my veins, oh";
        						Believer.setCifra(CifraBI);
        						
        						
       ///////////////////////
       // Inicio do Programa
       //////////////////////
		
		System.out.println("Bem vindo ao VIOLEARN");
		System.out.println(" "); // espaço em branco;
		ilustracoes ilustracao = new ilustracoes(); // simbolos musicais
        ilustracao.exibirIlustracao();
        System.out.println(" "); // espaço em branco;
		System.out.println("O programa ainda está em desenvolvimento, mas aqui você poderá:");
		System.out.println("- Criar uma playlist de cifras e salvar músicas de sua escolha");
		System.out.println("- Exibir as cifras salvas em sua Playlist");
		System.out.println(" "); // espaço em branco;
		
		Scanner scanner = new Scanner(System.in);    

        // Solicita ao usuário um nome para a nova playlist
        System.out.print("Digite um nome para a playlist: ");
        String nomePlaylist = scanner.nextLine();

        // Cria uma instância da Playlist com o nome fornecido pelo usuário
        Playlist playlist = new Playlist(nomePlaylist);
	
        boolean continuar = true;

        while (continuar) {
            // Opções
            System.out.println("----------------------------------------\n");
            System.out.println("Opções:");
            System.out.println("1. Adicionar música à playlist");
            System.out.println("2. Remover música da playlist");
            System.out.println("3. Mostrar a playlist");
            System.out.println("4. Excluir a playlist");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: \n");
            System.out.println("\n----------------------------------------\n");

            int escolha = scanner.nextInt();
            
            switch (escolha) {
            
                case 1:
                	
                    // Exibe as músicas disponíveis para escolha
                    System.out.println("----------------------------------------\n");
                    System.out.println("Músicas disponíveis para adicionar à playlist:");
                    
                    Musica[] musicasDisponiveis = new Musica[10];
                    
					// atribuindo as músicas criadas anteriormente;
                    
					musicasDisponiveis[0] = Believer;
					musicasDisponiveis[1] = ChocolateAna;
					musicasDisponiveis[2] = ClicheMaglore;
					musicasDisponiveis[3] = ComeAsYouAre;
					musicasDisponiveis[4] = DinheiroTim;
					musicasDisponiveis[5] = FloresTitas;
					musicasDisponiveis[6] = GostavaTim;
					musicasDisponiveis[7] = PromessasAna;
					musicasDisponiveis[8] = TempoPerdido;
					
					
					int id = 1;
					for(int i =0; i < musicasDisponiveis.length; i++) {
						if(musicasDisponiveis[i] != null) {
							System.out.print(id + " ");
							musicasDisponiveis[i].imprimirDetalhes();
							id++;
						}
						
					}

                    System.out.print("Escolha o número da música a ser adicionada: ");
                    int escolhaMusica = scanner.nextInt();
                    
                    // Verifica se a escolha é válida
                    if (escolhaMusica >= 1 && escolhaMusica <= musicasDisponiveis.length) {
                        Musica musicaEscolhida = musicasDisponiveis[escolhaMusica - 1];
                        playlist.adicionarMusica(musicaEscolhida);
                        System.out.println("----------------------------------------\n");
                    } else {
                        System.out.println("Escolha inválida. Tente novamente.\n");
                        System.out.println("----------------------------------------\n");
                    }
                    break;
                    
                case 2:
                	
                    playlist.mostrarPlaylist();  // Mostra a playlist atual
                    

                    // Solicita ao usuário o id da música a ser removida
                    System.out.print("Escolha o número da música a ser removida: ");
                    int escolhaMusicaRemover = scanner.nextInt();

                    if (escolhaMusicaRemover >= 1 && escolhaMusicaRemover <= playlist.getTamanho()) {
                        playlist.excluirMusica(escolhaMusicaRemover - 1);
                        System.out.println("Música removida da playlist.\n");
                        System.out.println("----------------------------------------\n");
                    } else {
                        System.out.println("Escolha inválida. Tente novamente.\n");
                        System.out.println("----------------------------------------\n");
                    }
                    break;
                case 3:
                    playlist.mostrarPlaylist();
                    if(playlist.isNull() == true) {
                    	System.out.println(" A playlist está vazia, adicione músicas");
                    	break;
                    }
                    int acessoPlaylist;
                    int idPlaylist;
                    
                    boolean segue = true;

                    do {
                        System.out.println("Digite 1 para acessar uma cifra da playlist, 0 para voltar ao menu: ");
                        acessoPlaylist = scanner.nextInt();

                        if (acessoPlaylist == 1) {
                            System.out.println("Digite o ID da música que quer acessar: ");
                            idPlaylist = scanner.nextInt();
                            playlist.mostrarMusica(idPlaylist - 1);
                            segue = false; // A música foi acessada com sucesso, saia do loop.
                        } else if (acessoPlaylist == 0) {
                            segue = false; // Usuário deseja voltar ao menu, saia do loop.
                        } else {
                            System.out.println("Escolha inválida.");
                        }
                    } while (segue);
                    break;
                case 4:
                	playlist.excluirPlayList();
                	break;
                case 5:
                    continuar = false;
                    System.out.println("Programa encerrado.");
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
	
        scanner.close();
        
    }
    
}