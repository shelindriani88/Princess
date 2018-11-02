public class Aurora extends Princess{
	
	public String pangeran;

	public Aurora(String nama, String pangeran){
		super(nama);		
		this.pangeran = pangeran;
	}

	public Aurora(String nama){
		super(nama);
	}

	public void showPangeran(){
		System.out.println("mempunyai pangeran ="+pangeran);
	}

}