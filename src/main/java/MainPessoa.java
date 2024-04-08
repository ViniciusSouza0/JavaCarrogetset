
import java.util.Scanner;

public class MainPessoa {
     public static void main(String[] args) {
         
         
        Scanner teclado = new Scanner (System.in);
           Scanner teclado2 = new Scanner (System.in);  
           
             System.out.println("Digite o nome: ");
               String nome = teclado.nextLine();
         
                 System.out.println("Digite a idade: ");
                   int idade = teclado.nextInt();
        
                    Pessoa p = new Pessoa (nome, idade);
        
                       System.out.println("Nome: " + p.getNome());
                          System.out.println("idade: " + p.getIdade());
        
    /////////////////////////////////////////////////////////////////
                               System.out.println("Digite um novo nome: ");
                                nome = teclado2.nextLine();
                                 p.setNome(nome);
         
                                   System.out.println("Digite a nova idade: ");
                                    idade =  teclado2.nextInt();
                                     p.setIdade(idade);
         
                                        System.out.println("Novo nome: " + p.getNome());
                                         System.out.println("Novo idade: " + p.getIdade());
                                           teclado.close();
}
}