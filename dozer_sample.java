import java.lang.String;
import org.dozer.*;

public class s1 {

	public static void main(String[] args) {
		src sourceObject = new src("Hi");
		System.out.println("Value --> " + sourceObject.sourceStringForInteger);	
		Mapper mapper = new DozerBeanMapper();
		dest destObject =  mapper.map(sourceObject, dest.class);
		System.out.println("Value --> " + destObject.sourceStringForSecond);	
	}

}
