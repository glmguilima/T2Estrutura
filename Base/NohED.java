package Base;

import Map.Veiculo;

public class NohED {
    Veiculo valor;
    NohED esq;
    NohED dir;
    NohED pai;

    NohED(Veiculo valor){
        this.valor = valor;
        dir = null;
        esq = null;
        pai = null;
    }

    public Veiculo getValor() {
        return this.valor;
    }

    public void setValor(Veiculo valor) {
        this.valor = valor;
    }

    public NohED getEsq() {
        return this.esq;
    }

    public void setEsq(NohED esq) {
        this.esq = esq;
    }

    public NohED getDir() {
        return this.dir;
    }

    public void setDir(NohED dir) {
        this.dir = dir;
    }

    public NohED getPai() {
        return this.pai;
    }

    public void setPai(NohED pai) {
        this.pai = pai;
    }

    public String toString() {
        return String.valueOf(valor);
    }
}
