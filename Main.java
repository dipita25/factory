public class Main
{

	public static void main(String[] args)
	{
		int typeProduitPharmaceutique=1;
		int typeProduitQuincailler=2;

		Consommateur consommateur1Pharmaceutique=new Consommateur("John Doe",typeProduitPharmaceutique);
		Consommateur consommateur2Quincailler=new Consommateur("isaaco de bamako",typeProduitQuincailler);
		System.out.println(consommateur1Pharmaceutique.toString());
		System.out.println(consommateur2Quincailler.toString());
	}

}
