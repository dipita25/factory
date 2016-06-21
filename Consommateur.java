public class Consommateur
{
	private String nom;
	private Produit produit;

	public Consommateur(String nom,int type)
	{
		this.nom=nom;

		/*permet de recuperer l'objet Produit creer dans le factory*/
		/*sans toutefois savoir comment celui ci est ceer là ba*/
		
		this.produit=ProduitFactory.creerProduit(type);
	}

	public Produit getProduit()
	{
		return this.produit;
	}

	@Override
	public String toString()
	{
		return this.nom+": "+produit.getDesignation()+"-"+produit.getPrix();
	}
}
