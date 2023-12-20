package ie.atu.sw;

import java.util.Iterator;

public class CaesarCypher implements Cypherable 
{
	private int key;
	
	@Override
	public String encrypt(String plainText) throws CypherException{
			return new String(encrypt(plainText.getBytes()));
	}
	
	public byte[] encrypt(byte[] plainText) throws CypherException{
		for (int i = 0; i < plainText.length; i++) {
			plainText[i] += getKey();
		}
		return plainText;
	}
	
	@Override
	public String decrypt(String cypherText) throws CypherException{
		return new String(decrypt(cypherText.getBytes()));
	}
	
	public byte[] decrypt(byte[] cypherText) throws CypherException{
		for (int i = 0; i < cypherText.length; i++) {
			cypherText[i] -= getKey();
			
		}
		return cypherText;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}
	
	public class CypherKeyImpl implements CypherKey{
		@Override
		public void setKey(String key) throws CypherException {
			CaesarCypher.this.key = Integer.parseInt(key);
		}

		@Override
		public String getKey() {
			return key + "";
		}
	}

}

