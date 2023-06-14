package lionalex;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class TestLionAlex {

    private LionAlex lionAlex;
    @Mock
    Feline feline;

    @Before
    public void createObject() throws Exception {
        lionAlex = new LionAlex(feline);
    }

    @Test
    public void getFriendsTest() {
        assertThat(List.of("Марти", "Глория", "Мелман"), is(lionAlex.getFriends()));
    }

    @Test
    public void getPlaceOfLivingTest() {
        Assert.assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }

    @Test
    public void getKittensTest() {
        Assert.assertEquals(0, lionAlex.getKittens());
    }
}
