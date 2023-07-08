package Base;

import Map.Veiculo;

public class ABB {
    private NohED raiz;

    public ABB() {
        this.raiz = null;
    }

    public boolean isEmpty(){
        return this.raiz == null;
    }

    public void addRecursive(Veiculo element) {
        if (isEmpty())
        {
            this.raiz = new NohED(element);
        }
        else {
            addRecursive(this.raiz, element);
        }
    }

    private void addRecursive(NohED atual, Veiculo valor) {
        if (valor.getChassi() < atual.valor.getChassi()) {
            if (atual.esq == null) {
                NohED newNoh = new NohED(valor);
                atual.esq = newNoh;
                newNoh.pai = atual;
                return;
            }
            addRecursive(atual.esq, valor);
        }
        else {
            if (atual.dir == null) {
                NohED newNoh = new NohED(valor);
                atual.dir = newNoh;
                newNoh.pai = atual;
                return;
            }
            addRecursive(atual.dir, valor);
        }
    }

    public NohED buscaRec(Veiculo element) {
        return buscaRec(this.raiz, element);
    }

    private NohED buscaRec(NohED atual, Veiculo valor) {
        if (atual == null)
        {
            return null;
        }
        if (valor.getChassi() == atual.valor.getChassi())
        {
            return atual;
        }
        if (valor.getChassi() < atual.valor.getChassi()){
            return buscaRec(atual.esq, valor);
        }
        else{
            return buscaRec(atual.dir, valor);
        }
    }

    public NohED raiz(){
        return this.raiz;
    }

    public int tamanho(NohED raiz){
        if(raiz==null){
            return 0;
        }
        return 1 + tamanho(raiz.esq) + tamanho(raiz.dir);
    }

    public NohED delete(Veiculo value) {
        NohED curr = this.raiz;
        NohED pai = null;

        while (curr != null && curr.valor != value)
        {
            pai = curr;
            if (value.getChassi() < curr.valor.getChassi()) {
                curr = curr.esq;
            }
            else {
                curr = curr.dir;
            }
        }

        if (curr == null) {
            return this.raiz;
        }

        if (curr.esq == null && curr.dir == null)
        {
            if (curr != raiz)
            {
                if (pai.esq == curr) {
                    pai.esq = null;
                }
                else {
                    pai.dir = null;
                }
            }
            else {
                raiz = null;
            }
        }
        else if (curr.esq != null && curr.dir != null)
        {
            NohED successor = getMinimumKey(curr.dir);

            Veiculo val = successor.valor;

            delete(successor.valor);

            curr.valor = val;
        }
        else {
            NohED child = (curr.esq != null)? curr.esq: curr.dir;

            if (curr != raiz)
            {
                if (curr == pai.esq) {
                    pai.esq = child;
                }
                else {
                    pai.dir = child;
                }
            }
            else {
                raiz = child;
            }
        }
        return raiz;
    }


    public static NohED getMinimumKey(NohED atual)
    {
        while (atual.esq != null) {
            atual = atual.esq;
        }
        return atual;
    }

    public void inorder()
    {
        if (this.raiz == null) {
            return;
        }

        inorder(raiz.esq);
        System.out.print(raiz.toString() + "\n");
        inorder(raiz.dir);
    }

    private static void inorder(NohED atual){
        if (atual == null) {
            return;
        }
        inorder(atual.esq);
        System.out.print(atual.toString() + "\n");
        inorder(atual.dir);
    }

    public int numMarcaFord = 0;

    public void countMarcaFord(NohED root) {
        if (root == null)
            return;
        if (root.getValor().getMarca().equals("Ford")){
            this.numMarcaFord++;
        }
        countMarcaFord(root.esq);
        countMarcaFord(root.dir);
    }

    public int numMarcaFord(){
        countMarcaFord(this.raiz);
        return this.numMarcaFord;
    }

    public void removeChassi(NohED root, int valueChassi) {
        if (root == null)
            return;
        removeChassi(root.esq, valueChassi);
        removeChassi(root.dir, valueChassi);
        if (root.getValor().getChassi() <= valueChassi){
            delete(root.getValor());
        }
    }

    public void removeChassiMenor(int value){
        removeChassi(this.raiz, value);
    }
}
