package myself.testJUnit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("dog")
public class Pet {
    private String name;
    private String type;

    public String getType() {
        return type;
    }
    @Value("二哈")
    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }
@Value("傻哈")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
