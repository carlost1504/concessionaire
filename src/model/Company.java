package model;
import java.util.*;
public class Company {
//controladora 
    
	private String name;
	private String nit;
	private double total_earnings;
	private double sales_number;
        private ArrayList<Vehicle> vehicles;
        private ArrayList<Person> person;
        private ArrayList<Client> clients;
        private ArrayList<Advisor> advisor;
        private Vehicle[][] parking ;
        private boolean[][] parking_busy ;
        private Client[][] asign_client ;
        
	/**
	 * 
	 * @param name
	 * @param nit
	 * @param total_earnings
	 * @param sales_number
	 */
	

	public Company(String name, String nit, double total_earnings, double sales_number) {
        this.name = name;
        this.nit = nit;
        this.total_earnings = total_earnings;
        this.sales_number = sales_number;
        this.vehicles=new ArrayList<Vehicle>();
        Vehicle obg= new Gasoline(10,'E',1.5,"Gasoline",4,true,000000,350000000,"hyundai",2015,24000,1600,"Car","mwt229",false);
        Vehicle obg1= new Gasoline(10,'E',1.5,"Gasoline",4,true,000000,350000000,"hyundai",2014,24000,1600,"Car","mwt229",false);
        Vehicle obg2= new Gasoline(10,'E',1.5,"Gasoline",4,true,000000,350000000,"hyundai",2013,24000,1600,"Car","mwt229",false);
        Vehicle obg3= new Gasoline(10,'E',1.5,"Gasoline",4,true,000000,350000000,"hyundai",2012,24000,1600,"Car","mwt229",false);
        Vehicle obg4= new Gasoline(10,'E',1.5,"Gasoline",4,true,000000,350000000,"hyundai",2013,24000,1600,"Car","mwt229",false);
        Vehicle obg5= new Gasoline(10,'E',1.5,"Gasoline",4,true,000000,350000000,"hyundai",2016,24000,1600,"Car","mwt229",false);
        Vehicle obg6= new Gasoline(10,'E',1.5,"Gasoline",4,true,000000,350000000,"hyundai",2017,24000,1600,"Car","mwt229",false);
        Vehicle obg7= new Electrical('N',15,3000,"Electrical",4,true,000000,350000000,"hyundai",2018,24000,1600,"Car","mwt229",false);
        vehicles.add(obg);
        vehicles.add(obg1);
        vehicles.add(obg3);
        vehicles.add(obg4);
        vehicles.add(obg5);
        vehicles.add(obg6);
        vehicles.add(obg7);
        this.clients=new ArrayList<Client>();
        Client obt1=new Client("carlos","tafurt","1002959774","3156980177","carlosd@gmail.com",true);
        Client obt2=new Client("Andres","tafurt","1002959574","3136980177","andsd@gmail.com",false);
        Client obt3=new Client("carlos","burbano","1002359774","3056982177","carlsdb@gmail.com",true);
        Client obt4=new Client("carla","tafaaw","1004959774","3156950177","carla@gmail.com",true);
        Client obt5=new Client("ewd","terd","100259774","3152280177","csflosd@gmail.com",true);
        Client obt6=new Client("cars","tfuut","1102959774","3156923177","carld@gmail.com",true);
        Client obt7=new Client("cartds","brafurt","1002959554","3156440177","calosd@gmail.com",true);
        Client obt8=new Client("carss","gdafurt","1342959774","31224980177","carefsd@gmail.com",true);
        Client obt9=new Client("tsarlos","tadffrt","100295474","3156980154","carlosdsdf@gmail.com",true);
        Client obt10=new Client("cassdfrlos","fdafurt","2002959774","3152980177","catrosd@gmail.com",true);
        Client obt11=new Client("careds","taffdyt","1002959732","3156980165","cargfsd@gmail.com",true);
        Client obt12=new Client("carasds","tdafurt","1044959774","3154480177","carlsdfosd@gmail.com",true);
        Client obt13=new Client("carlos","ruiz","1002959754","3156980175","carlosfsd@gmail.com",true);
        Client obt14=new Client("carloswe","tafurt","1002959774","3156980177","carlosd@gmail.com",true);
        Client obt15=new Client("carlose","tfurt","1232959774","3156980177","carlosd@gmail.com",true);
        Client obt16=new Client("carlos","tafurt","1202959774","3156980177","carlosd@gmail.com",true);
        Client obt17=new Client("carlos","tafurt","1302959774","3156980177","carlosd@gmail.com",true);
        Client obt18=new Client("carlos","tafurt","10402959774","3156980177","carlosd@gmail.com",true);
        Client obt19=new Client("carlos","tafurt","1052959774","3156980177","carlosd@gmail.com",true);
        Client obt20=new Client("carlos","tafurt","1032959774","3156980177","carlosd@gmail.com",true);
        Client obt21=new Client("carlos","tafurt","1052959774","3156980177","carlosd@gmail.com",true);
        Client obt22=new Client("carlos","tafurt","1032959774","3156980177","carlosd@gmail.com",true);
        Client obt23=new Client("carlos","tafurt","1002259774","3156980177","carlosd@gmail.com",true);
        clients.add(obt1);
        clients.add(obt2);
        clients.add(obt3);
        clients.add(obt4);
        clients.add(obt5);
        clients.add(obt6);
        clients.add(obt7);
        clients.add(obt8);
        clients.add(obt9);
        clients.add(obt10);
        clients.add(obt11);
        clients.add(obt12);
        clients.add(obt13);
        clients.add(obt14);
        clients.add(obt15);
        clients.add(obt16);
        clients.add(obt17);
        clients.add(obt18);
        clients.add(obt19);
        clients.add(obt20);
        clients.add(obt21);
        clients.add(obt22);
        clients.add(obt23);
        this.advisor=new  ArrayList<Advisor>();
        Advisor ogb=new Advisor("artur","wwear","10023",34334525);
        Advisor ogb1=new Advisor("artur","trese","14023",343787325);
        Advisor ogb2=new Advisor("well","trese","14123",7837325);
        Advisor ogb3=new Advisor("magda","fwear","13023",343234525);
        Advisor ogb4=new Advisor("artur","trese","14223",343787325);
        Advisor ogb5=new Advisor("artur","trese","14024",343787325);
        Advisor ogb6=new Advisor("artur","trese","14025",343787325);
        Advisor ogb7=new Advisor("artur","trese","14026",343787325);
        Advisor ogb8=new Advisor("artur","trese","14027",343787325);
        Advisor ogb9=new Advisor("artur","trese","14028",343787325);
        Advisor ogb10=new Advisor("artur","trese","14029",343787325);
        advisor.add(ogb);
        advisor.add(ogb1);
        advisor.add(ogb2);
        advisor.add(ogb3);
        advisor.add(ogb4);
        advisor.add(ogb5);
        advisor.add(ogb6);
        advisor.add(ogb7);
        advisor.add(ogb8);
        advisor.add(ogb9);
        advisor.add(ogb10);
        
        parking=new Vehicle[5][10];
        parking_busy=new boolean[5][10];
        asign_client=new Client[10][5];
        
	}
        
        public String asign_advisor(ArrayList<Advisor> advisor,ArrayList<Client> client){
            String asign_advisor="";
            int cont2=client.size();
            for(int i=0;i<advisor.size();i++){
                int cont = 0;
                
                for (int y=0;y<cont2;y++){
                    
                    if (cont<5){
                        cont++;
                        asign_client[i][y]=client.get(i);
                    }
                }
                
                
            }
            
            
            return asign_advisor;
        }

        /**
         * 
         * @param vehicles
         * @return 
         */
        public double pors_motocycle(ArrayList<Vehicle> vehicles){
            double tol_prome=00;
            boolean motos= false;
            double cont=0;
            double cont2=0;
            for(int i=0;i<vehicles.size();i++){
                motos =vehicles.get(i) instanceof Motocycle;
                if (motos==true){
                    cont++;
                    if (Motocycle.neww==true){
                        cont2++;
                    }
                }
                tol_prome=(cont2*100)/cont;
            }
            
            return tol_prome;
        }
        /**
         * 
         * @param person
         * @return 
         */
        public String Client(ArrayList<Person> person){
            String peron_act="";
            boolean perosn=false;
            for(int i=0;i<person.size();i++){
                perosn =person.get(i) instanceof Client;
                if (perosn==true){
                    if (Client.active=true){
                        peron_act=Client.class.toString();
                    }
                }
                
            }    
            
            return peron_act;
        }
        
        /**
         * 
         * @param parking
         * @param vehicles
         * @param parking_busy
         * @return 
         */
        public String parking(Vehicle[][] parking, ArrayList<Vehicle> vehicles,boolean[][] parking_busy){
            String things_parking="";
            int cont=0;
            for (int i=0;i<vehicles.size();i++){
                if(vehicles.get(i).getModel()==2014 && parking_busy[0][i]==false){
                    parking[0][i]=vehicles.get(i);
                    parking_busy[0][i]=true;
                    things_parking=vehicles.get(i).toString()+"parking off ";
                    
                }else if(vehicles.get(i).getModel()==2013 && parking_busy[1][i]==false){
                    parking[1][i]=vehicles.get(i);
                    parking_busy[1][i]=true;
                    things_parking=vehicles.get(i).toString()+"parking off ";
                    
                }else if(vehicles.get(i).getModel()<=2012 && parking_busy[2][i]==false){
                    parking[2][i]=vehicles.get(i);
                    parking_busy[2][i]=true;
                    things_parking=vehicles.get(i).toString()+"parking off ";
                    
                }else if(vehicles.get(i).getModel()<=2012 && parking_busy[3][i]==false){
                    parking[3][i]=vehicles.get(i);
                    parking_busy[3][i]=true;
                    things_parking=vehicles.get(i).toString()+"parking off ";
                    
                }else if(vehicles.get(i).getModel()<=2012 && parking_busy[4][i]==false){
                    parking[4][i]=vehicles.get(i);
                    parking_busy[4][i]=true;
                    things_parking=vehicles.get(i).toString()+"parking off ";
                    
                }
                
            }
            for (int i=0;i<parking_busy.length;++i){
                for(int y =0;y<parking_busy.length;y++){
                    if(parking_busy[i][y]==true){
                        things_parking="full parking lot";
                    }
                }
            }
            
            return things_parking;
        }
        /**
         * 
         * @return 
         */
        public String getName() {
            return this.name;
        }

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
        /**
         * 
         * @return 
         */
	public String getNit() {
		return this.nit;
	}

	/**
	 * 
	 * @param nit
	 */
	public void setNit(String nit) {
		this.nit = nit;
	}
        /**
         * 
         * @return 
         */
	public double getTotal_earnings() {
		return this.total_earnings;
	}

	/**
	 * 
	 * @param total_earnings
	 */
	public void setTotal_earnings(double total_earnings) {
		this.total_earnings = total_earnings;
	}
        /**
         * 
         * @return 
         */
	public double getSales_number() {
		return this.sales_number;
	}

	/**
	 * 
	 * @param sales_number
	 */
	public void setSales_number(double sales_number) {
		this.sales_number = sales_number;
	}

}