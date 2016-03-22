package a;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

// See http://interactivepython.org/runestone/static/pythonds/BasicDS/TheStackAbstractDataType.html
@Test
public class StackTest {

    Stack<Integer> s;

    @BeforeMethod
    public void setUp() throws Exception {
        s = new Stack<>();
    }

    @DataProvider
    public static Object[][] stackValues() {
        return new Object[][]{
                {Arrays.asList(0)},
                {Arrays.asList(0, 1)},
                {Arrays.asList(0, 1, 2)},
                {Arrays.asList(0, 1, 2, 3)}
        };
    }

    public void shouldBeAbleToCreateEmptyStack() {
        assertThat(s.isEmpty()).isTrue();
    }

    public void shoulBeAbleToPushAndPopElements() {
        s.push(1);
        s.push(2);

        assertThat(s.pop()).isEqualTo(2);
        assertThat(s.pop()).isEqualTo(1);
    }

    @Test
    public void emptyStackShouldHaveSizeZero() {
        assertThat(s.size()).isEqualTo(0);
    }

    @Test(dataProvider = "stackValues", singleThreaded = true)
    public void shouldHaveValidSize(List<Integer> values) {
        for (int val : values) {
            s.push(val);
        }
        assertThat(s.size()).isEqualTo(values.size());
    }

    @Test
    public void shouldHaveValidSizeAfterRemovingData() {
        s.push(1);
        s.pop();
        assertThat(s.size()).isEqualTo(0);
        assertThat(s.isEmpty()).isTrue();
    }

    @Test
    public void shouldBeAbleToPeekData() {
        s.push(-1);
        s.push(1);
        assertThat(s.peek()).isEqualTo(1);
        assertThat(s.peek()).isEqualTo(1);
        assertThat(s.peek()).isEqualTo(1);
        assertThat(s.peek()).isEqualTo(1);

        assertThat(s.size()).isEqualTo(2);
    }

    @Test(enabled = false)
    public void arrCompare() {
        int[] iarr = {1, 2, 3, 4, 5};
        assertThat(iarr).contains(-1, 2, 3, 4);
    }

}
