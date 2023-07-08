package Map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import Base.*;
public class MapLista implements Map {
    private LDE vetor[] = new LDE[10];
    private int nElementos = 0;

    public MapLista() {
        for (int i = 0; i < 10; i++) {
            vetor[i] = new LDE();
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
        if(vetor[hash].busca(valor.getChassi()) == null)
            vetor[hash(chave)].insereInicio(valor);
    }

    public void remove(int chave) {
        vetor[hash(chave)].remove(chave);
    }

    public Veiculo get(int chave) {
        return vetor[hash(chave)].busca(chave);
    }


    public boolean containsKey(int key) {
        return get(key) != null;
    }

    public boolean containsValue(Veiculo value) {
        return get(value.getChassi()) != null;
    }

    public void imprimeOrdenado() {
        int aux = 0;
        for(int i = 0; i< vetor.length; i++) {
            if(!vetor[i].estahVazia()) {
                vetor[i].ordenar();
                aux = vetor[i].imprimeInicioAFim(aux);
            }
        }
    }

    public void removeChassiMenorIgual() {
        removeChassiMenorIgual(202050000);
    }

    public void removeChassiMenorIgual(int valor) {
        for(int i = 0; i< vetor.length; i++) {
            vetor[i].removeChassiMenorIgual(valor);
        }
    }

    public int getNumeroMarcaFord() {
        int aux = 0;
        for(int i = 0; i< vetor.length; i++) {
            aux = aux + vetor[i].numeroMarcaFord();
        }
        return aux;
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
            vetor[i] = new LDE();
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
