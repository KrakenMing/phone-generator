package area;

/**
 * 电话是否在地区中
 * @author Kraken
 * 2018年10月15日
 */
public interface Area {
	boolean inArea(String phone);

	default boolean notInArea(String phone) {
		return !inArea(phone);
	};
}
