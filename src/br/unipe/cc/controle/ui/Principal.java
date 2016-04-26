package br.unipe.cc.controle.ui;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	import br.unipe.cc.controle.modelo.Item;

		public class Principal {

			public static void main(String[] args) {
				
				
				Item i1=new Item(1,"borracha",32);
				Item i2=new Item(2,"caneta",85);
				Item i3=new Item(3,"lapis de cor",1234);

				List<Item> listaIT=new ArrayList<Item>();
				
				listaIT.add(i1);
				listaIT.add(i2);
				listaIT.add(i3);
				Collections.sort(listaIT);
				System.out.println(listaIT);
				
				Collections.reverse(listaIT);
				
				System.out.println(listaIT);
				
			}

		
	}


