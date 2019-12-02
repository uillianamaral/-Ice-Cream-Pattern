/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice.cream.pattern;

import factory.AcaiFactory;

/**
 *
 * @author Uillian
 */
public class IceCreamPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Acai acai;
        Sorveteria sorveteria = new Sorveteria();
        
        acai = new AcaiFactory().buildAcai("Ninho");
        sorveteria.statusPedido("Fazendo", acai);
        
        System.out.println("STATUS: " + acai.getStatus());
        System.out.println("Tem BANANA: " + acai.isBanana());
        System.out.println("Tem BIZ: " + acai.isBiz());
        System.out.println("Tem CONTEFE: " + acai.isConfete());
        System.out.println("Tem NINHO: " + acai.isNinho());
        System.out.println("Tem LEITE CONDENSADO: " + acai.isLeiteCondensado());
        System.out.println("Tem MORANGO: " + acai.isMorango());
        System.out.println("Tem NUTELA: " + acai.isNutela());
        System.out.println("Tem SONHO DE VALSA: " + acai.isSonhoDeValsa());
    }
    
}
