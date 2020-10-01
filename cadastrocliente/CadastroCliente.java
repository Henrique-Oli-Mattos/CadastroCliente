package cadastrocliente;
public class CadastroCliente {

    public static void main(String[] args) {
        UICadastroCliente formulario = new UICadastroCliente();
        formulario.setVisible(true);
        Pessoas cliente = new Pessoas(formulario.nome, formulario.CPF, formulario.endereco, formulario.cidade, formulario.estado);
        do{
            if(formulario.alo == 1){
                break;
            }
            cliente.setAll(formulario.nome, formulario.CPF, formulario.endereco, formulario.cidade, formulario.estado);
        }while(true);
        cliente.printCliente();
    }  
}
