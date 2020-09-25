
package cadastrocliente;

public class Pessoas {
    
    private int id;
    private String name;
    private String cpf;
    private String endereco;
    private String cidade;
    private String estado;

    public Pessoas(String name, String cpf, String endereco, String cidade, String estado) {
        
        //atributos
        this.name = name;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.printCliente();
    }
    
        //print
    public void printCliente(){
        System.out.println("====================================");
        System.out.println("Name: "+ name);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("====================================");
    }
    
        //Gets
    public int getID(){
        return id;
    }
    public String getCPF(){
        return cpf;
    }
    public String getName(){
        return name;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getCidade(){
        return cidade;
    }
    public String getEstado(){
        return estado;
    }
}
