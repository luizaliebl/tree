package impl;

import br.univille.estd.tree.Position;
import br.univille.estd.tree.Tree;
import br.univille.estd.tree.TreeUtils;

public class main {

	public static void main(String[] args){
		
		File root 		= new File(0,"C:",false,true);
		File AndroidSDK = new File(0,"AndroidSDK",false,true);
		File eclipse 	= new File(0,"eclipse",false,true);
		File Gimp2 		= new File(0,"Gimp 2.exe",true,false);
		File downloads 	= new File(0,"downloads",false,true);
		File java 		= new File(0,"java.exe",true,false);
		File artigo 	= new File(0,"artigo.pdf",true,false);
		File mysql 		= new File(0,"mysql-driver-jdbc.jar",true,false);
		File tcc 		= new File(0,"tcc.doc",true,false);
		
		Tree<File> tree = new Tree<File>();
		
		Position<File> Root 		= tree.addRoot(root);
		Position<File> downloChild	= tree.addChild(Root, downloads);

		tree.addChild(Root, AndroidSDK);
		tree.addChild(Root, eclipse);
		tree.addChild(Root, Gimp2);
		tree.addChild(downloChild, java);
		tree.addChild(downloChild, artigo);
		tree.addChild(downloChild, mysql);
		tree.addChild(Root, tcc);
		
		System.out.println(TreeUtils.toStringPreOrderFile(tree, Root));
		System.out.println("Tamanho total: " + TreeUtils.getTamanho());
	

	}

}
