package resources;
//enum is special class in java which has collection of constants or  methods
public enum APIResources {
	
	LoginAPI("https://vmos2.vmos-demo.com/user/v1/auth");
	//getPlaceAPI("/maps/api/place/get/json"),
	//deletePlaceAPI("/maps/api/place/delete/json");
	private String resource;
	
	APIResources(String resource)
	{
		this.resource=resource;
	}
	
	public String getResource()
	{
		return resource;
	}
	

}
