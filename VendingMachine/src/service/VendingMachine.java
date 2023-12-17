package service;

import java.util.List;

import domain.product;

public class VendingMachine {
    private Holder holder;
    private CoinDispenser coindispenser;
    private Display display;
    private List <product> assort;
    public VendingMachine(Holder holder, CoinDispenser coindispenser, Display display, List<product> assort) {
        this.holder = holder;
        this.coindispenser = coindispenser;
        this.display = display;
        this.assort = assort;
    }
    public Holder getHolder() {
        return holder;
    }
    public void setHolder(Holder holder) {
        this.holder = holder;
    }
    public CoinDispenser getCoindispenser() {
        return coindispenser;
    }
    public void setCoindispenser(CoinDispenser coindispenser) {
        this.coindispenser = coindispenser;
    }
    public Display getDisplay() {
        return display;
    }
    public void setDisplay(Display display) {
        this.display = display;
    }
    public List<product> getProducts() {
        return assort;
    }
    public void setProducts(List<product> assort) {
        this.assort = assort;
    } 

    
}
