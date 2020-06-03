package cesar.school.model;

import java.io.Serializable;
import java.util.List;

public class Compra implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String email;
    private String cep;
    private List<String> skulList;
    private float valor;

    public Compra(String email, String cep, List<String> sku, float valor) {
        this.email = email;
        this.cep = cep;
        this.skulList = sku;
        this.valor = valor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public List<String> getSkulList() {
        return skulList;
    }

    public void setSkulList(List<String> skulList) {
        this.skulList = skulList;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Compra [cep=" + cep + ", email=" + email + ", skulList=" + skulList + ", valor=" + valor + "]";
    }

}