package Map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import Base.*;


public class MapABB implements Map {

    private ABB vetor[] = new ABB[10];
    private int nElementos = 0;

    public MapABB() {
        for (int i = 0; i < 10; i++) {
            vetor[i] = new ABB();
        }
    }

    public int hash(int key) {
        char []v = String.valueOf(key).toCharArray();
        return Integer.parseInt(String.valueOf(v[4]));
    }

    public void put(Veiculo valor) {
        put(valor.getChassi(), valor);
    }

    public void put(int chave, Veiculo valor) {
        int hash = hash(chave);
        if(vetor[hash].buscaRec(valor) == null){
            vetor[hash(chave)].addRecursive(valor);
        }
    }

    public void remove(Veiculo car, int chave) {
        vetor[hash(chave)].delete(car);
    }

    public boolean containsKey(int key) {
        return get(key) != null;
    }

    public boolean containsValue(Veiculo value) {
        return get(value.getChassi()) != null;
    }

    @Override
    public int size() {
        return nElementos;
    }

    @Override
    public boolean isEmpty() {
        return nElementos == 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < 10; i++) {
            vetor[i] = new ABB();
        }
    }


    public void imprimeOrdenado() {
        for (int i = 0; i < vetor.length; i++)
            if (vetor[i] != null) {
                vetor[i].inorder();
            }
    }

    public int getNumeroMarcaFord() {
        int numMarcaFord = 0;
        for (int i = 0; i < vetor.length; i++)
            if (vetor[i] != null) {
                numMarcaFord += vetor[i].numMarcaFord();
            }

        return numMarcaFord;
    }

    public void removeChassiMenorOuIgual(int valor) {
        for (int i = 0; i < vetor.length; i++)
            if (vetor[i] != null) {
                vetor[i].removeChassiMenor(valor);
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

