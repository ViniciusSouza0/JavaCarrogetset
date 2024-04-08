public class Pessoa {
    
private String nome;
private int idade;

//Construtor
public Pessoa (String nome, int idade){
    this.nome = nome;
    this.idade = idade;
}

//Metodos Get
public String getNome(){
    return nome;
}
public int getIdade(){
    return idade;
}

//Metodos Set
public void setNome(String nome){
    this.nome =  nome;
}
public void setIdade(int idade){
    this.idade = idade;
}

    
    
    
}
