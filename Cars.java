class Cars{
	String Name1;
	String Model1;
	int price1;
	String company1;
	static String turn ="Staring";
	 Cars(String Name, String Model, int price , String company )
	{
	Name1= Name;
	Model1= Model;
	price1 = price;
	company1 =company;
		}
	
	void show(){
	System.out.println(Name1+" "+ " " + Model1 + " " + price1 + " " +company1 +" "+ turn); } 

	public static void main(String args[]){
	
	Cars Mehran= new Cars("Mehran Car ","2020" , 700000, "Japanse");

//	System.out.println(Mehran.Name1);
//	System.out.println(Mehran.Model1);
//	System.out.println(Mehran.price1);
//	System.out.println(Mehran.company1);
	Mehran.show();
	
		}
	
}