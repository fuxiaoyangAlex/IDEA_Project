package work.concertAnnotation;


import org.springframework.stereotype.Repository;
import work.concert.performDao;

@Repository("perform2")
public class performanceImpl2 implements performDao{
        @Override
    public void perform(String name) {
           System.out.println(name+"开始表演");
    }
}
