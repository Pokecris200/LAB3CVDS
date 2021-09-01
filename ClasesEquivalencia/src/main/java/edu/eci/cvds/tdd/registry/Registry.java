package edu.eci.cvds.tdd.registry;

public class Registry {
	public RegisterResult registerVoter(Person p) {
		
		RegisterResult state = null;

        // TODO Validate person and return real result.
		if (!p.isAlive()) {
			
			state = RegisterResult.DEAD;
		} else if (p.getAge() < 18 && p.getAge() >= 0) {
			
			state = RegisterResult.UNDERAGE;
		} else if (p.getAge() < 0) {
			
			state = RegisterResult.INVALID_AGE;
		} else {
			
			state = RegisterResult.VALID;
		}
		
        return state;
    }
}