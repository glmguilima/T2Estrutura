package Map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;



public class MapVetor implements Map {
    private Veiculo vetor[] = new Veiculo[10];
    private int nVeiculos = 0;

    public int hash(int key) {
        double goldenRatio = (1 + Math.sqrt(5)) / 2;

        return (int) (((key * goldenRatio % 1) * vetor.length));
    }

    public void put(Veiculo valor) {
        put(valor.getChassi(), valor);
    }

    public void put(int chave, Veiculo valor) {
        int sondagem = 0;
        int hash;
        while (sondagem < vetor.length) {
            hash = (hash(chave) + sondagem) % vetor.length;
            if (vetor[hash] == null) {
                nVeiculos++;
                vetor[hash] = valor;
                aumenta();
                return;
            } else if (vetor[hash].getChassi() == chave) {
                vetor[hash] = valor;
                aumenta();
                return;
            }
            sondagem++;
        }
        aumenta();
    }

    private void aumenta() {
        if (nVeiculos / vetor.length > 0.70) {
            reSize();
        }
    }

    public void remove(int chave) {
        int sondagem = 0;
        int hash;
        while (sondagem < vetor.length) {
            hash = (hash(chave) + sondagem) % vetor.length;
            if (vetor[hash] == null) {
            } else if (vetor[hash].getChassi() == chave) {
                vetor[hash] = null;
                return;
            }
            sondagem++;
        }
    }

    public Veiculo get(int chave) {
        int sondagem = 0;
        int hash;
        while (sondagem < vetor.length) {
            hash = (hash(chave) + sondagem) % vetor.length;
            if (vetor[hash] == null) {
            } else if (vetor[hash].getChassi() == chave) {
                return vetor[hash];
            }
            sondagem++;
        }
        return null;
    }

    public void reSize() {
        Veiculo aux[] = vetor;
        Veiculo novo[] = new Veiculo[vetor.length * 2];
        this.vetor = novo;
        this.nVeiculos = 0;
        for (Veiculo veiculo : aux) {
            put(veiculo.getChassi(), veiculo);
        }
    }

    public boolean containsKey(int key) {
        return get(key) != null;
    }

    public boolean containsValue(Veiculo value) {
        return get(value.getChassi()) != null;
    }

    @Override
    public int size() {
        return nVeiculos;
    }

    @Override
    public boolean isEmpty() {
        return nVeiculos == 0;
    }

    @Override
    public void clear() {
        vetor = new Veiculo[10];
        nVeiculos = 0;
    }

    public void selection_sort() {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                int menor = i;
                for (int j = i + 1; j < (vetor.length - 1); j++)
                    if (vetor[j] != null)
                        if (vetor[j].getChassi() < vetor[menor].getChassi())
                            menor = j;
                Veiculo aux = vetor[i];
                this.vetor[i] = this.vetor[menor];
                this.vetor[menor] = aux;
            }
        }
    }

    public void imprimeOrdenado() {
        selection_sort();
        int aux = 0;
        for (int i = aux; i < vetor.length; i++)
            if (vetor[i] != null) {
                aux ++;
                System.out.println(aux + " - " + vetor[i].toString());
            }
    }

    public int getNumeroMarcaFord() {
        int aux = 0;
        for (int i = 0; i < vetor.length; i++)
            if (vetor[i] != null)
                if (vetor[i].isMarcaFord())
                    aux ++;
        return aux;
    }

    public void printAllMarcaFord() {
        for (int i = 0; i < vetor.length; i++)
            if (vetor[i] != null)
                if (vetor[i].isMarcaFord())
                    System.out.println(vetor[i].toString());
    }

    public void removeChassiMenorOuIgual(int valor) {
        Veiculo aux[] = vetor;
        clear();
        for (Veiculo veiculo : aux) {
            if (veiculo != null)
                if (veiculo.getChassi() > valor)
                    put(veiculo.getChassi(), veiculo);
        }
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set entrySet() {
        return null;
    }
}
