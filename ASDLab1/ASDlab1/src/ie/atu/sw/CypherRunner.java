package ie.atu.sw;

public class CypherRunner {

	public static void main(String[] args) throws CypherException {
		CaesarCypher cc = new CaesarCypher();
		cc.setKey(2);
		
		String s = "Happy Days!";
		String t = cc.encrypt(s);
		System.out.println(t);
		System.out.println(cc.decrypt(t));
		

	}

}
