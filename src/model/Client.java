package model;

public class Client extends Person {
	//Atributes
	private String phone_number;
	private String mail;
        public static boolean active;
        
	//Methods
        /**
         * 
         * @param name
         * @param last_name
         * @param identification
         * @param phone_number
         * @param mail 
         */
	public Client(String name, String last_name, String identification, String phone_number, String mail,boolean active) {
		super(name,last_name,identification);
		this.phone_number=phone_number;
		this.mail=mail;
                this.active=active;
                
	}
        /**
         * 
         * @return 
         */
	public String getPhone_number(){
		return phone_number;
	}
        /**
         * 
         * @param phone_number 
         */
	public void setPhone_number(String phone_number) {
		this.phone_number=phone_number;
	}
        /**
         * 
         * @return 
         */
	public String getMail() {
		return mail;
	}
        /**
         * 
         * @param mail 
         */
	public void setMail(String mail) {
		this.mail=mail;
	}

}