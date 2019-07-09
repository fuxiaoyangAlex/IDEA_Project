package work.concert;

import org.springframework.stereotype.Repository;

@Repository("per")
public class performanceImpl implements performDao{
        @Override
    public void perform(String name) {
           System.out.println(name+"开始表演");
    }
}
