package br.com.fecaf.model;

public class Veiculo {

    private int id;
    private MarcaModelo marcaModelo;
    private int ano;
    private String cor;
    private double preco;
    private int km;
    private String status;

    public Veiculo() {}

    public Veiculo(int id, MarcaModelo marcaModelo, int ano, String cor, double preco, int km, String status) {
        this.id = id;
        this.marcaModelo = marcaModelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.km = km;
        this.status = status;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public MarcaModelo getMarcaModelo() { return marcaModelo; }
    public void setMarcaModelo(MarcaModelo marcaModelo) { this.marcaModelo = marcaModelo; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public int getKm() { return km; }
    public void setKm(int km) { this.km = km; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "ID: " + id + " | " + marcaModelo + " | Ano: " + ano +
                " | Cor: " + cor + " | Preço: " + preco +
                " | Km: " + km + " | Status: " + status;
    }
}

