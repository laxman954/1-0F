import java.util.UUID;

/**
 * @author lekshmana.murugan
 * @since 2014-09-11 This RandomIDGeneration class Generate Unique id using UUID class is in
 *        util pacakage in Java Since version 1.5
 *  @see http://docs.oracle.com/javase/7/docs/api/java/util/UUID.html
 */
public class RandomIDGeneration {
	/**
	 * This method is used to Generate random unique id
	 * @return Randomly generate unique id, and converted into string.
	 */
	public String generateRandomID() {
		return UUID.randomUUID().toString();
	}
}
