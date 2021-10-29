package com.example.tugas4;

public class Item {
    private String namatim,ceo,negara;
    private int logo;

    public Item(String namatim, String ceo, String negara, int logo) {
        this.namatim = namatim;
        this.ceo = ceo;
        this.negara = negara;
        this.logo = logo;
    }

    public String getNamatim() {
        return namatim;
    }

    public void setNamatim(String nama) {
        this.namatim = nama;
    }

    public String getCeo() {return ceo;}

    public void setNegara(String negara) { this.negara = negara; }

    public String getNegara(){return negara;}

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}

