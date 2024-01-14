import java.util.Random;
import java.util.Scanner;

public class TresVetores {

    public static int[] vetor1 = new int[10];
    public static int[] vetor2 = new int[10];
    public static int[] vetor3 = new int[20];

    public static int uPosicao1 = 0;
    public static int uPosicao2 = 0;
    public static int uPosicao3 = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int num;
        int esc;

        // while (true) {
        //     System.out.println("O vetor deve ser 1 ou 2. ");
        //     do {
                
        //         System.out.print("Vetor..: ");
        //         esc = sc.nextInt();
        //     } while (esc != 1 && esc != 2); 

        //     System.out.print("Número.: ");
        //     num = sc.nextInt();

        

        //     try {
        //         inserir(esc, num);
        //     } catch (Exception e) {
        //         System.out.println("Erro: " + e.getMessage());
        //     }

        //     if (esc == 1) {
        //         uPosicao1++;
        //     } else {
        //         uPosicao2++;
        //     }
            
            
        //     System.out.println("Deseja adicionar mais um número? ");
        //     System.out.println("1 - sim, 2 - não");

        //     if (sc.nextInt() != 1) {
        //         break;
        //     }
            
        // }

        // uns random ai se vc quiser usar pra não precisar preencher tudo

        for (int i = 0; i < 10; i++) {
            num = random.nextInt(10)+1;
            try {
                inserir(1, num);
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
            uPosicao1++;
        }

        for (int i = 0; i < 10; i++) {
            num = random.nextInt(10)+1;
            try {
                inserir(2, num);
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
            uPosicao2++;
        }

        System.out.print("Vetor 1: ");
        
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i] + " - ");
        }

        System.out.println();

        System.out.print("Vetor 2: ");


        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + " - ");
        }

        vetor3 = juntar(vetor1, vetor2);
        System.out.println();

        System.out.print("Vetor 3: ");


        for (int i = 0; i < vetor3.length; i++) {
            System.out.print(vetor3[i] + " - ");
        }

        sc.close();

    }

    public static void inserir(int esc, int num) throws Exception{

        switch(esc) {

            case 1:
                // vetor 1
                if (uPosicao1 > 10) {
                    throw new Exception("O primeiro vetor está cheio!");              
                }
                for (int i = 0; i < vetor1.length; i++) {
                    if (i == uPosicao1) {
                        vetor1[uPosicao1] = num;
                        break;
                    }

                    if (num <= vetor1[i]) {
                        if (i == vetor1.length-1) {
                            throw new Exception("O vetor está cheio");
                        }

                        if (i > uPosicao1) {
                            vetor1[i] = num;
                        } else {
                            for (int j = uPosicao1; j > i; --j) {
                                vetor1[j] = vetor1[j-1];
                            }
                            vetor1[i] = num;                          
                        }

                        break;
                    } 
                }
                break;

            case 2:
                // vetor 2
                if (uPosicao2 > 10) {
                    throw new Exception("O segundo vetor está cheio!");        
                }
                for (int i = 0; i < vetor2.length; i++) {
                    if (i == uPosicao2) {
                        vetor2[uPosicao2] = num;
                        break;
                    }

                    if (num <= vetor2[i]) {
                        if (i == vetor2.length-1) {
                            throw new Exception("O vetor está cheio");
                        }

                        if (i > uPosicao2) {
                            vetor2[i] = num;
                        } else {
                            for (int j = uPosicao2; j > i; --j) {
                                vetor2[j] = vetor2[j-1];
                            }
                            vetor2[i] = num;
                        }

                        break;
                    } 
                }
                break;

            default:
                System.out.println("Erro switch opção inválida!");

        }
        
    }

    public static int[] juntar(int[] vetor1, int[] vetor2) {
        int i = 0;
        int j = 0; 

        while (uPosicao3 < 20) {
            if (i == 10) {
                if (j < 10) {
                    vetor3[uPosicao3] = vetor2[j];
                    uPosicao3++;
                    j++;
                } else {
                    break;
                }
                continue;
            }

            if (j == 10) {
                vetor3[uPosicao3] = vetor1[i];
                uPosicao3++;
                continue;
            }
            
            if (vetor1[i] <= vetor2[j]) {
                vetor3[uPosicao3] = vetor1[i];          
                i++;
            } else {
                vetor3[uPosicao3] = vetor2[j];               
                j++;
            }

            uPosicao3++;
            
        }   

        return vetor3;

    }
    
}
