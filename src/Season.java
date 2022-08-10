/**
 * 
 * @author <font size='7' color='green'>Henry</font>
 * @version <b>1.0</b>
 * @since <i>2022-08-01</i>
 *
 */
public enum Season {
    SPRING(100), SUMMER(500), FALL(1000), WINTER(10000);
    private int value;
	public Season(int value){  //Constructor
		this.value = value;
	}
	public int getValue() {
		return this.value;
	}
}
