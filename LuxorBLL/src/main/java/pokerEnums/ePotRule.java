package pokerEnums;

import java.util.HashMap;
import java.util.Map;

public enum ePotRule {
	NoLimit(1, true) {
		@Override
		public String toString() {
			return "No Limit";
		}
	},
	PotLimit(2, false) {
		@Override
		public String toString() {
			return "Pot Limit";
		}
	};
	
	private int potNbr;
	private boolean pDefault = false;
	private static Map<Integer, ePotRule> map = new HashMap<Integer, ePotRule>();
	
	static {
        for (ePotRule pot : ePotRule.values()) {
            map.put(pot.potNbr, pot);
        }
    }
	
	 public static ePotRule getPotRule(int potNbr) {
	        return map.get(potNbr);
	    }
	 
	private ePotRule(final int potNbr, boolean pDefault){
		this.potNbr = potNbr;
		this.pDefault = pDefault;
	}
	
	public int getPot(){
		return potNbr;
	}
	
	public boolean getDefault(){
		return this.pDefault;
	}
}
