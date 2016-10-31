import java.util.Random;

public class Spil {
	
	
	
	private Kort[] kort;
	  public Spil() {
	    kort = new Kort[52];
	    inispil();
	  }	



	  private void inispil(){	
	    // hjælpemetode der initialiserer kort

		        for (int i = 0; i<52 ;i++){
		    	
		        Random generator = new Random();
		        if(kort.length <= 12){
		        kort[i] = new Kort('H', i+1);
		        } else if(kort.length >= 13 && kort.length <26){
		        	kort[i] = new Kort('K', i-12);
		        } else if(kort.length >= 26 && kort.length <39){
		        	kort[i] = new Kort('S', i-25);
		        } else if (kort.length >= 39 && kort.length < 52){
		        	kort[i] = new Kort('R', i-38);
		        }


		  
		        }
	  }

	  public Kort traekkort(){
	    // metode der trækker og returnerer øverste kort i bunken og herefter lægger det til sidst i bunken
		  
		  Kort temp = kort[0];
		  for(int i = 0; i<51; i++){
			  kort[i] = kort[i+1];
			  }
		  	kort[51]=temp;
		  	return temp;
		  }
	  


	  public void blandkort(){
	    // metode der blander kortbunken
		  Random randomGenerator = new Random();
		    for (int i = 0; i <= 51; ++i){
		      int randomInt = randomGenerator.nextInt(51);
		    }
		    
		  
	  }


	  public String toString(){
	  }


}
