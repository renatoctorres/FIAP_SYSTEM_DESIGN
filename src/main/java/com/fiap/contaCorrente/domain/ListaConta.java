package com.fiap.contaCorrente.domain;
import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;
@Entity
public class ListaConta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    private String tipoItem;
    private String recebidoDeEnvioPara;
    @NotNull
    private double valor;
    private String data;

    public ListaConta()
    {}

    public ListaConta(final long id, final String tipoItem, final String recebidoDeEnvioPara, final double valor, final String data)
    {
        this.id = id;
        this.tipoItem = tipoItem;
        this.recebidoDeEnvioPara = recebidoDeEnvioPara;
        this.valor = valor;
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public String getRecebidoDeEnvioPara() {
        return recebidoDeEnvioPara;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }
    public ListaConta setId(long id) {
        this.id = id;
        return this;
    }

    public ListaConta setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
        return this;
    }

    public ListaConta setRecebidoDeEnvioPara(String recebidoDeEnvioPara) {
        this.recebidoDeEnvioPara = recebidoDeEnvioPara;
        return this;
    }

    public ListaConta setValor(double valor) {
        this.valor = valor;
        return this;
    }

    public ListaConta setData(String data) {
        this.data = data;
        return this;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListaConta)) return false;
        ListaConta that = (ListaConta) o;
        return getId() == that.getId() &&
                Double.compare(that.getValor(), getValor()) == 0 &&
                getTipoItem().equals(that.getTipoItem()) &&
                Objects.equals(getRecebidoDeEnvioPara(), that.getRecebidoDeEnvioPara()) &&
                getData().equals(that.getData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTipoItem(), getRecebidoDeEnvioPara(), getValor(), getData());
    }

    @Override
    public String toString() {
        return "ListaConta { id: "+ id+ " tipoItem: "+ tipoItem+" recebidoDeEnvioPara: " + recebidoDeEnvioPara + "valor: " + valor + " data: "+ data;
    }
}
