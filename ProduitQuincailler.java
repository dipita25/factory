public class ProduitQuincailler implements Produit
{

	private String designation;
	private double prix;
	private String description; 


	 public String getDesignation()
        {
                return this.designation;
        }

        public void setDesignation(String designation)
        {
                this.designation=designation;
        }

	 public double getPrix()
        {
                return this.prix;
        }

        public void setPrix(double prix)
        {
                this.prix=prix;
        }


	public String getDescription()
	{
		return this.description;
	}

	public void setDescription(String description)
	{
		this.description=description;
	}
}
