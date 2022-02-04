package polymorphism;
import org.springframework.stereotype.Component;


@Component("sony")
public interface Speaker {

	void volumeUp();

	void volumeDown();

}