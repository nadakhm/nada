
package nada.khaled;

public class product {
    
    public class Product {

	private String PID;
        private String PDate;
	private String EDate;
	private String Type;
	private String Manufacturer;
	
	
	
	public void setProductID(String ProductID){
		this.PID = PID;
	}
	
	
	public void setType(String Type){
		this.Type = Type;
	}
	
	public void setManufacturer(String Manufacturer){
		this.Manufacturer = Manufacturer;
	}
	
	public void setPDate(String ProductionDate){
		this.PDate = PDate;
	}
	
	public void setEDate(String ExpiryDate){
		this.EDate = EDate;
	}
	
	
	public String getPID(){
		return(this.PID);
	}
	
	
	public String getType(){
		return(this.Type);
	}
	
	
	public String getManufacturer(){
		return(this.Manufacturer);
	}
	
	
	public String getPDate(){
		return(this.PDate);
	}
	
	public String getEDate(){
		return(this.EDate);
	}
	
}

            
            
	

