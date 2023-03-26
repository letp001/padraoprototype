package prototype;

public class Pastelaria implements Cloneable {

    private int numeroPedido;

    private String cliente;
    private Entrega entrega;

    private String localEntrega;

    public Pastelaria(int numeroPedido, String cliente, Entrega entrega, String localEntrega) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.entrega = entrega;
        this.localEntrega = localEntrega;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Entrega getEndereco() {
        return entrega;
    }

    public void setEndereco(Entrega entrega) {
        this.entrega = entrega;
    }

    public String getLocalEntrega() {
        return localEntrega;
    }

    public void setLocalEntrega(String localEntrega) {
        this.localEntrega = localEntrega;
    }

    @Override
    public Pastelaria clone() throws CloneNotSupportedException {
        Pastelaria pastelariaClone = (Pastelaria) super.clone();
        pastelariaClone.entrega = (Entrega) pastelariaClone.entrega.clone();
        return pastelariaClone;
    }

    @Override
    public String toString() {
        return "Pastelaria{" +
                "numeroPedido=" + numeroPedido +
                ", cliente='" + cliente + '\'' +
                ", endereco=" + entrega +
                ", localEntrega='" + localEntrega + '\'' +
                '}';
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }
}