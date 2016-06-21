public class ProduitFactory
{

	public static Produit creerProduit(int type)
	{
		Produit p = null;
		if (type == 1)
		{
			p =new ProduitPharmaceutique();
			p.setDesignation("Paracetamol");
			p.setPrix(2500);
			p.setDescription("médicament contre le palu");
			
		}
		else if (type == 2)
		{
			p=new ProduitQuincailler();
			p.setDesignation("ciment");
                        p.setPrix(4600);
                        p.setDescription("permet de batir des maisons");
		}
		return p;
	}

}
