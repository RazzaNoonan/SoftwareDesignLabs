package ie.atu.sw;

public interface Cypherable {

	String encrypt(String plainText) throws CypherException;

	String decrypt(String cypherText) throws CypherException;

}