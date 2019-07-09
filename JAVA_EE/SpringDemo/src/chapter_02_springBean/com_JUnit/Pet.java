package chapter_02_springBean.com_JUnit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dog")
public class Pet {
    private String  type;
    private String nmae;

    public String getType() {
        return type;
    }
@Value("二哈")
    public void setType(String type) {
        this.type = type;
    }
    public String getNmae() {
        return nmae;
    }
@Value("毛球")
    public void setNmae(String nmae) {
        this.nmae = nmae;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", nmae='" + nmae + '\'' +
                '}';
    }
}
