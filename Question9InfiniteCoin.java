 
   private int makeChange(int total, int denom) {
    	int nextCoin = 0;
    	switch (denom) {
    	case 25:
    		nextCoin = 10;
    		break;
    	case 10:
    		nextCoin = 5;
    		break;
    	case 5:
    		nextCoin = 1;
    		break;
    	case 1:
    		return 1;
    	default:
    		return 0;
    	}
    	
    	int ways = 0;
    	for (int count = 0; count*denom <= total; ++count) {
    		ways += makeChange(total-count*denom, nextCoin);
    	}
    	return ways;
    }
    
   