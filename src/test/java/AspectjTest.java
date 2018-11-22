import concert.Lili;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = PerformConfig.class)
@ContextConfiguration("/perform_config.xml")
public class AspectjTest {
    @Autowired
    private Lili lili;
    @Test
    public void testIntroduced(){
        lili.doPerform();
    }

}
