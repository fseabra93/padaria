/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padaria;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author flaviorgs
 */
public class Padaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<ItemPadaria> ItemPadarias = new ArrayList<>();

        ItemPadarias.add(new ItemPadaria("Forno"));
        ItemPadarias.add(new ItemPadaria("Amassadeira"));
        ItemPadarias.add(new ItemPadaria("Divisora de Massas"));
        ItemPadarias.add(new ItemPadaria("Modeladora de Massas"));
        ItemPadarias.add(new ItemPadaria("Cilindro Sovador"));
        ItemPadarias.add(new ItemPadaria("Fatiadeira de Pães"));
        ItemPadarias.add(new ItemPadaria("Batedeira Planetária"));

        System.out.println("Quantidade de itens na lista ItemPadarias antes da remoção: "+ItemPadarias.size());
        System.out.println(ItemPadarias);
        
        ItemPadarias.remove(2); // remove o elemento "Divisora de Massas" passando o índice
        ItemPadarias.remove(new ItemPadaria("Fatiadeira de Pães")); // remove o elemento "Fatiadeira de Pães" passando o objeto a ser removido como parâmetro
        
        System.out.println("\nQuantidade de itens na lista ItemPadarias após a remoção: "+ItemPadarias.size());
        System.out.println(ItemPadarias);
        
       
        
        ItemPadarias.forEach((item) -> {
          // Coloca "em bom estado" para os itens de índice par e "fora de uso" para os ítens de índice ímpar
          int indice = ItemPadarias.indexOf(item);
          if (indice % 2 == 0) {
            item.setCondicao("em bom estado");
          } else {
            item.setCondicao("fora de uso");
          }
        });
        System.out.println("\n");
        ItemPadarias.forEach(item -> System.out.println(item));

        
    }
    
}
