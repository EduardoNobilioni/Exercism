public class Lasagna {
  
    	public int expectedMinutesInOven(){
        return 40;
    }
    
    public int remainingMinutesInOven(int minInOven){
        return expectedMinutesInOven() - minInOven;
    }
    
        public int preparationTimeInMinutes(int layers){
        return layers * 2;
    }
   
    public int totalTimeInMinutes(int layer, int min){
        return preparationTimeInMinutes(layer) + min;
    }
}
