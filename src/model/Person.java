package model;
public abstract class Person {
	//Atributes
	private String name;
	private String last_name;
	private String identification;
	//Methods
        /**
         * 
         * @param name
         * @param last_name
         * @param identification 
         */
	public Person(String name, String last_name, String identification){
		this.name=name;
		this.last_name=last_name;
		this.identification=identification;
	}
        /**
         * 
         * @return 
         */
	public String getName(){
		return name;
	}
        /**
         * 
         * @param name 
         */
	public void setName(String name){
		this.name=name;
	}
        /**
         * 
         * @return 
         */
	public String getLast_name(){
		return last_name;
	}
        /**
         * 
         * @param last_name 
         */
	public void setLast_name(String last_name) {
		this.last_name=last_name;
	}
        /**
         * 
         * @return 
         */
	public String getIdentification(){
		return identification;
	}
        /**
         * 
         * @param identification 
         */
	public void setIdentification(String identification) {
		this.identification=identification;
	}

}