/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import ice.cream.pattern.Acai;

/**
 *
 * @author Uillian
 */
public class AcaiBuilder {
    
    private Acai acai;
    
    public AcaiBuilder(){
        this.acai = new Acai();
    }
    
    public AcaiBuilder temMorango(boolean morango) {
	this.acai.setMorango(morango);
        return this;
    }
    
    public AcaiBuilder temLeiteCondensado(boolean leiteCondensado){
        this.acai.setLeiteCondensado(leiteCondensado);
        return this;
    }
    
    public AcaiBuilder temBanana(boolean banana){
        this.acai.setBanana(banana);
        return this;
    }
    
    public AcaiBuilder temBiz(boolean biz){
        this.acai.setBiz(biz);
        return this;
    }
    
    public AcaiBuilder temGranola(boolean granola){
        this.acai.setGranola(granola);
        return this;
    }
    
    public AcaiBuilder temNinho(boolean ninho){
        this.acai.setNinho(ninho);
        return this;
    }
    
    public AcaiBuilder temSonhoDeSalsa(boolean sonho){
        this.acai.setSonhoDeValsa(sonho);
        return this;
    }
    
    public AcaiBuilder temNutela(boolean nutela){
        this.acai.setNutela(nutela);
        return this;
    }
    
    public AcaiBuilder isNome(String nomeAcai){
        this.acai.setNome(nomeAcai);
        return this;
    }
    
    public Acai build(){
        return this.acai;
    }
    
}
