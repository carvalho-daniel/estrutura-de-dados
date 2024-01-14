public class Carros {
    private String placa;
    private String marca;
    private String modelo;
    private float valor;

    public Carros() {}

    public Carros(String placa, String marca, String modelo, float valor) {
        setPlaca(placa);
        setMarca(marca);
        setModelo(modelo);
        setValor(valor);
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getValor() {
        return valor;
    }
    
}