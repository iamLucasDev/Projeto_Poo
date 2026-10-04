package br.com.biblioteca.usuarios;


public class Clientes extends Pessoa{
    private  double Dinheiro;

    public double getDinheiro() {
        return Dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        Dinheiro = dinheiro;
    }
    private Clientes[] Clientes = new Clientes[5];



    public  void DadosClientes(){

        Clientes clienteUm = new Clientes();
        clienteUm.setNome("Carol");
        clienteUm.setDinheiro(150);

        Clientes clienteDois = new Clientes();
        clienteDois.setNome("Felipe");
        clienteDois.setDinheiro(60);

        Clientes clienteTres = new Clientes();
        clienteTres.setNome("Alice");
        clienteTres.setDinheiro(125);

        Clientes clienteQuatro = new Clientes();
        clienteQuatro.setNome("Lucas");
        clienteQuatro.setDinheiro(300);

        Clientes clienteCinco = new Clientes();
        clienteCinco.setNome("Ana");
        clienteCinco.setDinheiro(80);

        Clientes[0] = clienteUm;
        Clientes[1] = clienteDois;
        Clientes[2]  = clienteTres;
        Clientes[3] = clienteQuatro;
        Clientes[4] = clienteCinco;

        for(Clientes cliente: Clientes){
            System.out.println("Nome do cliente: "+cliente.getNome());
            System.out.println("Saldo: "+cliente.getDinheiro());
        }
    }
}